
package practicasss;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author patito321
 */
public class ventanas {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        /**String palabra;
        
        palabra = JOptionPane.showInputDialog("Digite una palabra: ");
        JOptionPane.showMessageDialog(null,"La palabra es: "+palabra);**/
        /**calculal a suma de 3 notas
        double nota1,nota2,nota3,suma;
        System.out.println("Digita las 3 notas: \n");
        nota1 = leer.nextDouble();
        nota2 = leer.nextDouble();
        nota3 = leer.nextDouble();
        
        suma = nota1+nota2+nota3;
        
        System.out.println("La suma total de las notas es: \n"+suma);
        
        suma = suma / 3;
        
        System.out.println(suma);**/
        
        //Calcule el salario semanal de un empleado a partir de sus horas trabajadas y de su salario x hora
        /**
        String empleado;
        double salario_hora, salario_semanal, horas_trabajadas;
        int e;
        
        System.out.println("Ingrese el nombre del empleado: ");
        empleado = leer.nextLine();
        System.out.println("Ingrese el Area del empleado: \n1.Area de Ventas\n2.Area de Sistemas\n3.Administracion\n4.Recursos Humanos\n5.Auxiliares de Limpieza");
        e = leer.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas en esta semana: ");
        horas_trabajadas = leer.nextDouble();
        
        switch(e){
            case 1:{
                System.out.println("Area de Ventas");
                salario_hora = 12;
                salario_semanal = horas_trabajadas * salario_hora;
                System.out.println("El salario semanal del empleado es de: "+salario_semanal);
            }break;
            case 2:{
                System.out.println("Area de Sistemas");
                salario_hora = 40;
                salario_semanal = horas_trabajadas * salario_hora;
                System.out.println("El salario semanal del empleado es de: "+salario_semanal);
            }break;
            case 3:{
                System.out.println("Administracion");
                salario_hora = 25;
                salario_semanal= horas_trabajadas*salario_hora;
                System.out.println("El salario semanal del empleado es de: "+salario_semanal);
                
            }break;
            case 4:{
                System.out.println("Recursos Humanos");
                salario_hora = 30;
                salario_semanal = horas_trabajadas*salario_hora;
                System.out.println("El salario semanal del empleado es de: "+salario_semanal);
            }break;
            case 5:{
                System.out.println("Auxiliar de Limpieza");
                salario_hora = 15;
                salario_semanal = horas_trabajadas*salario_hora;
                System.out.println("El salario semanal del empleado es de: "+salario_semanal);
            }break;
        }
        **/
        /**
        double g_total, l_total, j_total, total_j, total_t;
        
        System.out.println("Guillermo cuanto dinero tienes actualmente?; ");
        g_total = leer.nextDouble();
        
        l_total = g_total / 2;
        System.out.println("Luis tiene la mitad de lo que tiene guillermo: "+l_total);
        
        j_total=g_total+l_total;
        
        total_j= j_total / 2;
        
        total_t= g_total+l_total+total_j;
        
        System.out.println("Juan tiene la mitad de la suma entre guillermo y luis: "+total_j);
        System.out.println("La suma de los ahorros de los 3 es de: "+total_t);
        **/
        /**
        double sueldoBase = 1000;
        double comisionFija = 150;
        double porcentajeComision = 0.05;

        int cantidadCarros;
        double totalVentas;
        double sueldoTotal, comi_car, com_ven;

        System.out.print("Ingrese la cantidad de carros vendidos: ");
        cantidadCarros = leer.nextInt();

        System.out.print("Ingrese el total de ventas del mes: ");
        totalVentas = leer.nextDouble();
        
        comi_car = cantidadCarros * comisionFija;
        System.out.println("Usted recibe una comision de: "+comi_car+" por la cantidad de carros vendidos.\n");
        
        com_ven = totalVentas * porcentajeComision;
        System.out.println("Usted recibe una comision de: "+com_ven+" por la cantidad de ventas obtenidas este mes.\n");
        sueldoTotal = (comi_car * com_ven) + sueldoBase;

        System.out.println("El sueldo total del vendedor es: $" + sueldoTotal);**/
        /**double par, prex, sgex, exf, notfinal, par1=0.10, prex1=0.25, sgex1=0.25, zxff1=0.40;
        
        System.out.println("Indique la nota de su participacion en clase: ");
        par = leer.nextDouble();
        
        System.out.println("Indique la nota del primer parcial: ");
        prex = leer.nextDouble();
        
        System.out.println("Indique la nota del segundo examen: ");
        sgex = leer.nextDouble();
        
        System.out.println("Indique la nota de su examen final: ");
        exf = leer.nextDouble();
        
        notfinal = (par*par1)+(prex*prex1)+(sgex*sgex1)+(exf*zxff1);
        System.out.println("Su nota final es de: "+notfinal);**/
        
        /**double num1, num2, ex,total;
        
        System.out.println("Digite un numero: ");
        num1 = leer.nextDouble();
        System.out.println("Digite un numero: ");
        num2 = leer.nextDouble();
        System.out.println("Digite el exponente de la suma: ");
        ex = leer.nextDouble();
        
        total = Math.pow(num1+num2, ex);
        
        System.out.println("La suma de la potencia es: "+total);**/
        
        /**double a, c,b;
        
        System.out.println("Ingrese el valor de A: ");
        a = leer.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        b = leer.nextDouble();
 
        
        System.out.println("Ingrese el valor de AC: ");
        c = leer.nextDouble();
        
        double x1 = (-(b) + (Math.sqrt((b*b) - 4*(a)*(c)))) / (2*(a));
        double x2 = (-(b) - (Math.sqrt((b*b) - 4*(a)*(c)))) / (2*(a));
        
        System.out.println(x1);
        System.out.println(x2);**/
        
       
        
  
    }
    
}
