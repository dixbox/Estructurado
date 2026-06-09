
/**
 *
 * @author Omar Contla Garcia
 * @version 23/02/2026
 */
import java.util.Scanner;
public class EjemploBucle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String letra;
        //Inicia estructurada de control iterativa do-while
        do{
            System.out.println("Ingresa una letra del abecedario");
            letra=sc.nextLine();
        }while(!letra.equalsIgnoreCase("x"));/*Se usa el metodo de equalsIgnoreCase para igualar la letra ingresada con 
        la letra x,el programa repetira la instruccion hasta que se pare en x
        */
    }
}
