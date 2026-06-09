
/**
 *
 * @author Omar Contla Gracia
 * @version 23/03/2026 Clase para recorrer un arreglo con el for extendido
 * conocido como foreach
 */
import java.util.*;
public class RecorrerArreglo {
    public static void main(String[] args) {
        //Declarar un arreglo de tipo cadena que guarde meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril"};
        //Crear el recorrido del arreglo con foreach
        for (String datos : meses) {
            System.out.println(datos);//Imprimir los meses contenidos en el arreglo llamado meses copiados a la variable datos
            int numeros[] = new int[3];
            for (int valores : numeros) {
                System.out.println(valores);
            }
            int numeros2[] = {90, 15, 2, 7, 1, 100};
            Arrays.sort(numeros2);
            for (int valores2 : numeros2) {
                Arrays.sort(numeros2);//Ordena los valores de un arreglo
                System.out.println(valores2);
            }
            Arrays.sort(numeros2);//Ordena los valores de un arreglo
            //Imprime el arreglo ordeno en una cadena fuera del ciclo
            System.out.println("Ordenados" + Arrays.toString(numeros2));
        }
    }
}
