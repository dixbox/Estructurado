
/**
 *
 * @author Omar Contla Garcia
 * @version 25/02/2026
 */
public class RegaloCumple {
    public static void main(String[] args) {
        int edad = 12, regalo = 100, ahorro = 100, acumulado = 5500;
        System.out.println("Regalo " + acumulado + " ");
        while (regalo <= acumulado) {
            regalo *= 2;
            System.out.println("Edad: " + edad + " el regalo es: " + ahorro);
            ahorro += regalo;
            edad++;
        }
        System.out.println("Su edad sera de: " + edad);
    }
}
