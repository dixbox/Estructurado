
/**
 *
 * @author Omar Contla Garcia
 * @version 05/02/2026
 */
import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingresa el valor del numero 1");
        num1 = sc.nextInt();
        System.out.println("Ingresa el valor del numero 2");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.err.println("NO SE PUEDE REALIZAR NINGUNA OPERACION");
        } else if (num1 > 0 & num2 > 0) {
            int suma = num1 + num2;
            System.out.println("La suma de los numeros 1 y 2 es de: " + suma);
        } else if (num1 < 0 & num2 < 0) {
            int resta = num1 - num2;
            System.out.println("La resta de los numeros 1 y 2 es de: " + resta);

        } else if (num1 == 0 | num2 == 0) {
            System.err.println("N o se puede con 0");
        } else if (num1 > 0 & num2 < 0 | num1 < 0 & num2 > 0) {
            System.err.println("Error no se pueden de cero");
        }
    }
}
