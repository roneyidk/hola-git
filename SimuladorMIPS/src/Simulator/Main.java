
package Simulator;
//las librerias usadas me ayudaran a crear mi interfaz grafica.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Main extends JFrame {
    private JButton btnArchivo, btnSimular;
    private JPanel panel;
    private ArrayList<LineaPanel> lista = new ArrayList<>();
    private int actual = 0;
    private MIPSSImulator mips = new MIPSSImulator();
    private JTextArea txtRegistros;
    private JTextArea txtConsola; //aqui le agrego la consola dentro

    public Main() {
        setTitle("Simulador MIPS 32 bits");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 700);
        setLocationRelativeTo(null);

        btnArchivo = new JButton("Seleccionar archivo");
        btnSimular = new JButton("Ejecutar");
        btnSimular.setEnabled(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 1));

        JPanel botones = new JPanel();
        botones.add(btnArchivo);
        botones.add(btnSimular);

        add(botones, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // 🧠 Consola visual para mostrar instrucciones ejecutadas
        txtConsola = new JTextArea(5, 30);
        txtConsola.setEditable(false);
        txtConsola.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollConsola = new JScrollPane(txtConsola);

        // 🧠 Área de registros
        txtRegistros = new JTextArea(8, 30);
        txtRegistros.setEditable(false);
        txtRegistros.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollRegistros = new JScrollPane(txtRegistros);

        // Panel combinado para consola + registros
        JPanel panelInferior = new JPanel(new GridLayout(2, 1));
        panelInferior.add(scrollConsola);
        panelInferior.add(scrollRegistros);

        add(panelInferior, BorderLayout.SOUTH);

        btnArchivo.addActionListener(e -> seleccionarArchivo());
        btnSimular.addActionListener(e -> simular());
    }

    private void seleccionarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            cargar(archivo);
        }
    }

    private void cargar(File archivo) {
        panel.removeAll();
        lista.clear();
        actual = 0;
        txtConsola.setText(""); // limpiar consola
        txtRegistros.setText(""); // limpiar registros

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int i = 0;

            while ((linea = br.readLine()) != null && i < 10) {
                LineaPanel lp = new LineaPanel(linea);
                lista.add(lp);
                panel.add(lp);
                i++;
            }

            btnSimular.setEnabled(true);
            panel.revalidate();
            panel.repaint();

            txtConsola.setText("Archivo seleccionado: " + archivo.getName() + "\n");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer archivo");
        }
    }

    private void simular() {
        Timer t = new Timer(1500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (actual > 0 && actual <= lista.size()) {
                    lista.get(actual - 1).setActivo(false);
                }

                if (actual < lista.size()) {
                    LineaPanel lp = lista.get(actual);
                    lp.setActivo(true);

                    String instr = lp.getInstruccion();

                    // Mostrar instrucción ejecutada en consola visual
                    txtConsola.append("Ejecutando: " + instr + "\n");

                    mips.ejecutar(instr);
                    txtRegistros.setText(mips.getEstado());

                    actual++;
                } else {
                    ((Timer) e.getSource()).stop();
                    txtConsola.append("Simulación finalizada.\n");
                }
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}

class LineaPanel extends JPanel {
    private boolean activo = false;
    private final String instruccion;

    public LineaPanel(String instruccion) {
        this.instruccion = instruccion;
        setPreferredSize(new Dimension(600, 40));
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(activo ? Color.RED : Color.LIGHT_GRAY);
        g2.fillOval(10, 10, 20, 20);

        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Monospaced", Font.PLAIN, 14));
        g2.drawString(instruccion, 40, 25);
    }
}