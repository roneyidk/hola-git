
package practicasss;
import java.util.Scanner;
/**
 *
 * @author patito321
 */
public class condicionales {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int edad;
        
        System.out.println("Digite su edad para poder acceder: ");
        edad = leer.nextInt();
        
        if(edad>= 18){
            System.out.println("Aprobado, acceda");
        }else{
            System.out.println("Denegado, no puede acceder");
        }
        
        
    }
}
