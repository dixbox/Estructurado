
/**
 *
 * @author Omar Contla Garcia
 * @version 10/03/2026
 */
import java.util.Scanner;
public class PromedioDecimales {
    public static float Promedio(float cal, int calfin) {
        return cal/calfin;
    }

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingresa las calificaciones: ");
        int b=teclado.nextInt();
        float suma=0;
        for (int i = 1;i<=b;i++) {
             System.out.print("Ingrese la calificacion "+i+": ");
            suma+=teclado.nextFloat();
        }
            float promedioF=Promedio(suma, b);
            System.out.println("Tu promedio es: "+promedioF);
    }
}
