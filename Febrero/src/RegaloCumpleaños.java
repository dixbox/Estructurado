
/**
 *
 * @author Omar Contla Garcia
 * @version 25/02/2026
 */
public class RegaloCumpleaños {
    public static void main(String[] args) {
        int regalo = 100;
        for (int i = 12; regalo < 5300; i++) {
            regalo = regalo * 2;
            System.out.println("La edad de la nina es: " + i);
            System.out.println("Cantidad acumulada: " + regalo);
        }
    }
}
