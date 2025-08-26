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
         
         
         //Realice a program it's make the user write a word exit, for exit the program, and it's word's no indicated, show a message, "try again."
         
         String word="exit",usr;
         
         usr=JOptionPane.showInputDialog("Write the word for exit: ");
         while(!usr.equalsIgnoreCase(word)){
             usr=JOptionPane.showInputDialog("Word Incorrect, try again!");
             
         }
         JOptionPane.showMessageDialog(null,"Good, you're a exit the program");
         **/
        
        //Realice un programa donde el usuario deba digitar la contrasenia, y intentarlo en bucle hasta digitarla bien o decir la palabra exit
        //para salir del programa
        
        String password="java123",user;
        
        user=JOptionPane.showInputDialog("Write the password correct \nOr Write 'exit' for finish the program: ");
        
        while(!user.equalsIgnoreCase(password) && !user.equalsIgnoreCase("exit")){
            user=JOptionPane.showInputDialog("Incorrect Password, try again.\nOr write 'exit' for finish te program: ");
            
        }
        if(user.equalsIgnoreCase(password)){
            JOptionPane.showMessageDialog(null,"Correct Password, Welcome user!");
        }else{
            JOptionPane.showMessageDialog(null,"Finish the program");
        }
         
         
         

    }

}
