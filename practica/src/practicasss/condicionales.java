
package practicasss;
import java.util.Scanner;
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
        }**/
        
        /**Realice un menu de calculadora
        
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
        }**/
        
        
        //realiza un programa que identifique numeros pares e impares
        
        int num;
        System.out.println("Digita un numero para saber si es par o impar: ");
        num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero es par");   
        }else{
            System.out.println("El numero es impar");
        }
        
        
    }
}
