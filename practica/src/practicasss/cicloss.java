package practicasss;

import javax.swing.JOptionPane;

public class cicloss {
    public static void main(String[] args) {
        /**Practicas con ciclos
        for(int i=10;i>=1;i--){
            JOptionPane.showMessageDialog(null,i);
        }///esto es un for
        
        //esto es un ciclo while
        int i=1;
        while(i<=10){
            JOptionPane.showMessageDialog(null,i);
            i++;
        }

        int i=1,contador;
        contador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de veces que desee repetir: "));
        while(i<=contador){
            JOptionPane.showMessageDialog(null,i);
            i++;

        }//Ejercicio aplicando la sintaxis while
        **/

        //Ejercicio que usuario aplique un limite y calcular si es multiple de 2 y su par
        int lim, i=1;

        lim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el limite de numeros que desea saber si son pares: "));
        while(i<=lim){
            if(lim%2==0){
                JOptionPane.showMessageDialog(null, i+"Es numero par: ");
                i++;
            }else{
                JOptionPane.showMessageDialog(null, i+"No es numero par: ");
                i++;
            }
            //Calcular su par
            int par=lim*2;
            JOptionPane.showMessageDialog(null, "El par de "+lim+" es: "+par);
            i++;
        }
    }

}
