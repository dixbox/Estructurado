
/**
 *
 * @author Omar Contla Garcia
 * @version  18/03/2026
 * Clase que muestre como recorrer un arreglo
 */
import java.util.*;
public class Vocales {
    public static void main(String[] args) {
        //Crear un arreglo de tipo char de tamaño 5
        char []vocales={'a','e','i','o','u'};
        //Recorrer arreglo para mostrar las 5 vocales
        for(int i=0;i<vocales.length;i++){
            System.out.println("Vocal en posicion: "+i+" "+vocales[i]);
        }
    }
}
