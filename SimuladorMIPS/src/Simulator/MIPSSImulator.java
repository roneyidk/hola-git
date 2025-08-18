
package Simulator;

import java.util.HashMap;
/**
 *
 * @author patito321
 */
public class MIPSSImulator {
        private final HashMap<String, Integer> registros;

    public MIPSSImulator() {
        registros = new HashMap<>();
        // Inicializa registros comunes
        for (int i = 0; i <= 7; i++) {
            registros.put("$t" + i, 0);
        }
    }

public void ejecutar(String instruccion) {
    instruccion = instruccion.trim();
    if (instruccion.isEmpty()) return;

    String[] partes = instruccion.split("[ ,]+");
    String op = partes[0];

    try {
        switch (op) {
            case "addi":
                registros.put(partes[1], registros.get(partes[2]) + Integer.parseInt(partes[3]));
                break;
            case "add":
                registros.put(partes[1], registros.get(partes[2]) + registros.get(partes[3]));
                break;
            case "sub":
                registros.put(partes[1], registros.get(partes[2]) - registros.get(partes[3]));
                break;
            default:
                // Nada por ahora
        }
    } catch (Exception e) {
        // Silenciar errores aquí o agregar log si deseas
    }
}

    public String getEstado() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- REGISTROS ---\n");
    for (String r : registros.keySet()) {
        sb.append(String.format("%-4s = %d\n", r, registros.get(r)));
    }
    return sb.toString();
}
}


