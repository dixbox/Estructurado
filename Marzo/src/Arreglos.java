
/**
 *
 * @author Omar Contla Garcia
 * @version 17/03/2026
 */
import java.util.*;
public class Arreglos {
    public static void main(String[] args) {
        //Declaracion de un arreglo unidimensional sin datos
        int []positivos=new int[4];
        //Asignacion de valores a las posiciones del arreglo positivos
        positivos[0]=15;
        positivos[1]=150;
        positivos[2]=1500;
        positivos[3]=100;
        //Salida por pantalla de los datos por posicion y coleccion del arreglo
        //Por posicion
        System.out.println("Muestra el dato en la posicion 2 del arreglo: "+positivos[2]);
        //Para ver la coleccion completa del arreglo
        System.out.println("Coleccion completa del arreglo "+Arrays.toString(positivos));
        
        //Ingreso de datos por teclado de acuerdo a la posicion del arreglo
        Scanner sc=new Scanner(System.in);//Creacion de objeto para ingreso de datos
        System.out.println("Ingresa un numero positivo");
        positivos[3]=sc.nextInt();
        System.out.println("Datos positivos "+Arrays.toString(positivos));
        //Suma de posiciones de un arreglo
        int suma;
        suma=positivos[1]+positivos[3];
        System.out.println("Suma de dos posiciones del arreglo "+suma);
        
        //Forma 2 de declarar un arreglo y asignar valores a las posiciones del mismo
        int []negativos={-10,-20,-30,-40,-50};
        System.out.println("Posicion 4 del arreglo "+negativos[4]);
    }
}
