
/**
 *
 * @author Omar Contla Garcia
 * @version 13/04/2026
 */
import java.util.*;
public class Repaso {
    public static void main(String[] args) {
        float datos[][] = {{2f, 9f, 4f, 11f}, {3f, 5f, 7f, 12f}, {6f, 2f, 7f, 11f}, {8f, 4f, 6f, 7f}};
        String cadena = " ";
        for (int i = 0; i < datos.length; i++) {
            cadena += "\n";
            for (int l = 0; l < datos[i].length; l++) {
                cadena += datos[i][l] + " ";
            }
        }
        System.out.println(cadena);
    }
}
