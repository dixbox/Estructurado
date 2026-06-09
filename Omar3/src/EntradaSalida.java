
/**
 *
 * @author Omar Contla Garcia
 * @version 21/01/2026
 * Clase para mostrar como se realiza la entrada de datos por teclado
 * y la salida en pantalla con la libreria Scanner.
 */
import java.util.Scanner;//Importacion de la biblioteca de Scanner
public class EntradaSalida {//creacion de la clase
    public static void main(String[] args) {//metodo de inicio
        //Creacion del objeto tipo Scanner para datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre completo");
        String nombre=teclado.nextLine();
        System.out.println("Ingresa tu edad");
        int edad=teclado.nextInt();
        teclado.nextLine();//Limpieza de buffer de entrada
        System.out.println("Ingresa como estas hoy, C:Cansado, F:Feliz, A:Amargado");
        char estadoAnimo=teclado.next().charAt(0);
        teclado.close();//metodo de cierre para el objeto teclado
        
        System.out.println("Nombre: "+nombre+"\nEdad:"+edad+"\nEstado de Animo "+estadoAnimo+" de Cansado");
    }
    
}
