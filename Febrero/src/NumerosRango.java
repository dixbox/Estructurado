
/**
 *
 * @author Omar Contla Garcia
 * @version 18/03/2026 
 * Realiza un programa que llene 2 arreglos con 10 numeros
 * aleatorios en un rango entre 50 y 100 y que muestre el mensaje de son iguales
 * o no de acuerdo a su contenido.
 */
import java.util.*;
public class NumerosRango {
    public static void main(String[] args) {
        int[] aleatorio1=new int[10];
        int[] aleatorio2=new int[10];
        Random rnd=new Random();
        for (int i=0;i<10;i++) {
            aleatorio1[i]=rnd.nextInt(51) + 50;
            aleatorio2[i]=rnd.nextInt(51) + 50;
        }
        System.out.println(Arrays.toString(aleatorio1));
        System.out.println(Arrays.toString(aleatorio2));
        if (Arrays.equals(aleatorio1,aleatorio2)) {
            System.out.println("Los arreglos son iguales de acuerdo a su contenido.");
        } else {
            System.out.println("Los arreglos no son iguales de acuerdo a su contenido.");
        }
    }
}
