
/**
 *
 * @author Omar Contla Garcia
 * @version 18/02/2026
 */
import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double valores, raiz, producto=1;
        while (i <= 6) {
            System.out.println("Ingrese un valor: ");
            valores = sc.nextDouble();
            if (valores % 2 == 0) {
               raiz=Math.sqrt(valores);
               System.out.println("La raiz es: "+raiz);
               producto*=raiz;
            }else{
              System.out.println("Numero descartado");
            }
            i++;
        }
        System.out.println("El producto de la raiz de los pares es: "+producto);
    }
}
