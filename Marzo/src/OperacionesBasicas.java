
/**
 *
 * @author Omar Contla Garcia
 * @version 11/03/2026
 */
import java.util.Scanner;
public class OperacionesBasicas {
    public static int Operacion1(int a, int b, Scanner teclado) {
        int c;
        c = a+b;
        return c;
    }
    public static int Operacion2(int a, int b, Scanner sc) {
        int j;
        j= a-b;
        return j;
    }
    public static float Operacion3(float a, float b, Scanner sc){
        float s;
        s=a/b;
        return s;
    }
    public static float Operacion4(int a, int b, Scanner sc){
        float o;
        o=a*b;
        return o;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Ingresa el valor 1");
        a=sc.nextInt();
        System.out.println("Ingresa el valor 2");
        b=sc.nextInt();
        System.out.println("Suma es: "+Operacion1(a,b,sc));
        System.out.println("Resta es: "+Operacion2(a,b,sc));
        System.out.println("Division es: "+Operacion3(a,b,sc));
        System.out.println("Multiplicacion es: "+Operacion4(a,b,sc));
    }
}
