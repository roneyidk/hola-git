
package practicasss;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author patito321
 */
public class condicionales {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        /**
        int edad;
        
        System.out.println("Digite su edad para poder acceder: ");
        edad = leer.nextInt();
        
        if(edad>= 18){
            System.out.println("Aprobado, acceda");
        }else{
            System.out.println("Denegado, no puede acceder");
        }
        
        Realice un menu de calculadora
        
        int cal;
        System.out.println("Bienvenido a Calculadora Cientifica: ");
        System.out.println("Elija una de las siguientes opciones que desee realizar: \n1.Suma\n2. Resta\n3. Multiplicacion\n4.Division");
        cal = leer.nextInt();
        
        switch (cal){
            case 1:{
                System.out.println("Ha elegido la Opcion \n1. Suma");
                int Suma,n1,n2;
                System.out.println("Elija el primer numero: ");
                n1=leer.nextInt();
                System.out.println("ELija el segundo numero: ");
                n2=leer.nextInt();
                Suma=n1+n2;
                System.out.println("El resultado es: "+Suma);
                break;
            }
            case 2:{
                System.out.println("Ha elegido la opcion \n2.Resta");
                int resta,n1,n2;
                System.out.println("Elija el primer numero: ");
                n1=leer.nextInt();
                System.out.println("ELija el segundo numero: ");
                n2 = leer.nextInt();
                resta=n1-n2;
                System.out.println("El resultado de la resta es: "+resta);
                break;
            }
            case 3:{
                System.out.println("Ha elegido la opcion \n3.Multiplicacion");
                double multiplicacion,n1,n2;
                System.out.println("Elija una cantidad: ");
                n1=leer.nextDouble();
                System.out.println("ELija otra cantidad: ");
                n2=leer.nextDouble();
                multiplicacion=n1*n2;
                System.out.println("El resultado es: "+multiplicacion);
                break;
            }
            case 4:{
                System.out.println("Ha elegido la opcion \n4.Division");
                double div,n1,n2;
                System.out.println("Elija la primera cantidad: ");
                n1=leer.nextDouble();
                System.out.println("ELija la segunda cantidad: ");
                n2=leer.nextDouble();
                div=n1/n2;
                System.out.println("EL resultado es: "+div);
                break;
            }
            case 5:{
                System.out.println("Opcion incorrecta.");
            }
        }
        
        
        realiza un programa que identifique numeros pares e impares
        
        int num;
        System.out.println("Digita un numero para saber si es par o impar: ");
        num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero es par");   
        }else{
            System.out.println("El numero es impar");
        }
        
        Realizar un programa que calcule los numeros mayores, menores o iguales.
        
        int num,num2;
        
        num =Integer.parseInt(JOptionPane.showInputDialog("Elija un numero para calcular el mayor, el menor y si son iguales: "));
        
        num2=Integer.parseInt(JOptionPane.showInputDialog("ELija un numero pra calcular el mayor, el menor y si son iguales: "));

        if(num > num2){
            JOptionPane.showMessageDialog(null,"EL numero: "+num+" es mayor a el numero "+num2);
        }else if(num == num2){
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }else{
            JOptionPane.showMessageDialog(null,"El numero: "+num2+" es mayor a el numero "+num);
        }
        * 
        System.out.println("Digita tu nota: ");
        double nota=leer.nextDouble();
        
        String result = (nota>40) ? "pass" : "fail";
        System.out.println("Tu resultado del examen es: "+result);
        
        Realiza un programa que verifique si el dato solicitado es una letra
        char l;
        l = JOptionPane.showInputDialog("Digite una variable:").charAt(0);

        if (Character.isLetter(l)){
            JOptionPane.showMessageDialog(null,"La variable es la letra: "+l);

        }else{
            JOptionPane.showMessageDialog(null,"La variable no es una letra, es un numero o simbolo: "+l);
        }
        
        //En megaplaza se hace un 20% de descuento a los clientes que su compra supere los 
        //$300. Cual sera la cantida que pagara una persona por su compra.

        double shop, desct=0.20, total;
        shop=Double.parseDouble(JOptionPane.showInputDialog("Digite su valor de compra: "));

        if (shop > 300){
            total = shop - (shop*desct);
            JOptionPane.showMessageDialog(null,"Su compra es mayor a $300 Dolares, por lo que"+
            " adquiere un descuento del 20%.\nEl total a pagar es de: $"+total);
        }else{
            total = shop;
            JOptionPane.showMessageDialog(null,"Su compra no llego al rango superior a $300"+
            " por lo que no obtiene descuento.\nEl total a pagar es de: $"+total);
        }
        
        //Calcular el salario de una persona por horas, si trabaja mas de 40 horas
        //se le paga $16 por hora, pero si trabaja mas de 40 horas, se le paga las 
        //$16 dolares por hora y $20 por cada hora extra.

        double pay=16, hours, ext=20, total;
        hours = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
        if (hours > 40){
            //Primero se multiplica las 40 horas normales por su pago, luego se resta las horas trabajadas
            //con las extras, para calcular el valor de las horas extras, y se sume con el valor de las
            //horas normales.
            total = (pay*40) + ((hours-40)*ext);
            JOptionPane.showMessageDialog(null,"Su salario por las "+hours+" horas trabajadas es de: $"+total);
        }else{
            //SI trabajo las 40 horas establecidas, no recibe pago extra.
            total = pay*hours;
            JOptionPane.showMessageDialog(null,"Sus salario por las "+hours+" horas trabajadas es de: $"+total);
        }
        //Pedir al usuario un numero desde el rango de 0 a 99.999, y calcular las cantidad de cifras
        //que tiene el numero, si es mayor a 99.999, mostrar un mensaje
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 a 99.999:"));
        if ((num >= 0)&&(num <=99999)){
            JOptionPane.showMessageDialog(null,"Las cantidad de cifras del numero es: "+String.valueOf(num).length());

        }else{
            JOptionPane.showMessageDialog(null,"El numero es mayor a 99.999 o menor a 0, por favor digite un numero entre 0 y 99.999");
        }
        
        //Realizar un programa que solicite el dia, mes y anio, y indique si la fecha es correcta
        //Considerando que el mes no puede ser mayor a 12, y el dia no puede ser mayor a 30.
        int day,month,year;
        day = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia:"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes:"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Digite un anio:"));
        if((day >=1 && day <= 30)&&(month >= 1 && month <=12)&&(year > 1000)){
            JOptionPane.showMessageDialog(null, "La fecha es correcta\nDia: "+day+"Mes: "+month+"Year: "+year);
        }else{
            JOptionPane.showMessageDialog(null, "La fecha no existe");
        }
        
        //Pedir al usuario una nota del 0 al 10, y mostrar un mensaje segun la nota
        //de forma: insuficiente, suficiente, bien, notable, sobresaliente
        double n;
        n=Double.parseDouble(JOptionPane.showInputDialog("Digite su nota: "));
        if (n<5){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }else if (n>=5 && n<=7){
            JOptionPane.showMessageDialog(null, "Suficiente");
        }else if(n>7 && n<8){
            JOptionPane.showMessageDialog(null, "Bien");
        }else if(n>=8 && n<=9){
            JOptionPane.showMessageDialog(null, "Notable");
        }else{
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }

        //Ralice un calculadora aritmetica, que calcule dos numeros enteros, para 
        //llamar a la operacion suma, deba hacerlo con s minuscula o S mayuscula,
        //Para la resta r o R, para la multiplicacion m o M, y para la division d o D.
        
        String op;

        op=JOptionPane.showInputDialog("Digite la letra de la operacion que desee realizar: "+
        "\nS. Suma"+"\nR. Resta"+"\nM. Multiplicacion"+"\nD. Division: \n");

        char eleccion = Character.toUpperCase(op.charAt(0));
        switch(eleccion){
            case 'S':{
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion \nS. Suma");
                int suma,n1,n2;
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
                suma=n1+n2;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+suma);
                break;
            }
            case 'R':{
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion \nR. Resta");
                int resta,n1,n2;
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
                resta=n1-n2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+resta);
                break;
            }
            case 'M':{
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion \nM. Multiplicacion");
                double multi,n1,n2;
                n1=Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
                n2=Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                multi=n1*n2;
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+multi);
                break;
            }
            case 'D':{
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion \nD. Division");
                double divi,n1,n2;
                n1=Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
                n2=Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
                divi=n1/n2;
                JOptionPane.showMessageDialog(null,"El resultado de la division es: "+divi);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null,"La opcion es incorrecta");
        }**/

        //Simule un cajero automatico, con un saldo inicial de $1000 dolares, con un menu de opciones
        //que tenga las opciones de, Ingresar dinero, regirar dinero, consultar saldo y salir.

        double saldo=1000,ingreso,retiro;
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\nQue operacion desea realizar:"+
        "\n1. Ingresar dinero\n2. Retirar dinero\n3. Consultar saldo\n4. Salir"));

        switch(op){
            case 1:{
                ingreso=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad que desee ingresar: "));
                saldo=saldo+ingreso;
                JOptionPane.showMessageDialog(null,"Su nuevo saldo es de: $"+saldo);
                break;
            }
            case 2:{
                retiro=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad que desee retirar: "));
                if (retiro > saldo){
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente, su saldo actual es de: $"+saldo);
                }else{
                    saldo=saldo-retiro;
                    JOptionPane.showMessageDialog(null,"Su nuevo saldo es de: $"+saldo);
                }
                break;
            }
            case 3:{
                JOptionPane.showMessageDialog(null, "Su saldo actual es de $"+saldo);
                break;
            }
            case 4:{
                JOptionPane.showMessageDialog(null, "Gracias por usar el cajero automatico, vuelva pronto.");
                break;
            }
        }
    }
}
