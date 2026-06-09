
/**
 *
 * @author Omar Contla Garcia
 * @version 28/01/2026
 * Clase para realizar las operaciones básicas
 */
import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        int a, b, suma, resta, multiplicacion;
        double division;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el valor 1");
        a=sc.nextInt();
        System.out.println("Teclea el valor 2");
        b=sc.nextInt();
        suma=a+b;
        resta=a-b;
        multiplicacion=a*b;
        division=(double)a/(double)b;
        System.out.println("La suma de "+a+" y "+b+" es "+suma+"\nResta:"+resta+"\nmultiplicacion: "+multiplicacion+"\ndivision:"+division);
    }
}
