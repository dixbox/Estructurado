
/**
 *
 * @author Omar Contla Garcia
 * @version 11/03/2026
 * galon 1=3.79 a litro
 * Kilo 1=0.54 libras
 */
import java.util.Scanner;
public class Conversiones {
    public static double Operacion1(){
        Scanner sc = new Scanner(System.in);
        double a=1, b=3.79;
        System.out.println("Ingresa un valor cual es quiera: ");
        a=sc.nextDouble();
        return a*b;
    }
    public static double Operacion2(){
        Scanner sc = new Scanner(System.in);
        double c=1, d=0.454;
        System.out.println("Ingresa un valor cual es quiera: ");
        c=sc.nextDouble();
        return c*d;
    }
    public static double Operacion3(){
        Scanner sc = new Scanner(System.in);
        double j=1, k=1000;
        System.out.println("Ingresa un valor cual es quiera: ");
        j=sc.nextDouble();
        return j*k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es la conversion que deseas realizar");
        System.out.println("1. Galones a Kilogramos");
        System.out.println("2. Kilogramos a Libras");
        System.out.println("3. Kilometros a Metros");
        System.out.println("Selecciona un numero: ");
        char opcion = sc.next().charAt(0);
        switch (opcion){
            case '1':
                System.out.println("Galones a Litros: "+Operacion1()); 
                break;
            case '2':
                System.out.println("Kilogramos a Libras: "+Operacion2());
                break;
            case '3':
                System.out.println("Kilometros a Metros: "+Operacion3());
                break;
            default:
        }
    }
}
