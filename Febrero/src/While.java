
/**
 *
 * @author Omar Contla Garcia
 * @version 18/02/2026
 * Clase para verificar la sintaxis y errores que puede
 * presentar el uso de la estructura while
 */
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //Declara e inicializa el iterador para el ciclo
        int i=1;
        //Indica la estructura ciclica while
        while (i<=5){
            System.out.println("El valor del iterador es: "+i);
            /*Cuando se omite el uso del incremento dentro de la
            sintaxis se crea un bucle infinito, ya que no existe un limite
            */
            //Agregar incremento del iterador en 1
            i++;
        }
        System.out.println("*****************************************************");
        int j=1, y=1;
        while (j<=10){
            y+=Math.pow(j, 2);
            System.out.println("El valor del iterador es: "+y);
            j++;
        }
        System.out.println("*****************************************************");
        int o=1;
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre=sc.nextLine();
        while(o<=8){
            System.out.println("Tu nombre 8 veces "+nombre);
            o++;
        }
        System.out.println("*****************************************************");
    }
}
