
/**
 *
 * @author Omar Contla Garcia
 * @version 09/03/2026
 */
import java.util.Scanner;
public class DatosPersonales {
    public static void Nombre(){
        String nombre="Omar";
        int edad=19;
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
     public static void Nombre2(String a, int b){
        System.out.println("Tu Nombre es: "+a);
        System.out.println("Tu edad es: "+b);
    }
     public static String Nombre3(){
         String nombre="Pedro";
         int a=90; 
         String datos=nombre +" "+a;
        return datos;
    }
     public static String Nombre4(String c, int d){
         return "Tu nombre es: "+c+" Tu edad es "+d;
     }
     public static void main(String[] args) {
        Nombre();
        ///////////////////////////////////////////
        String a;
        int b;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa tu Nombre");
        a=teclado.nextLine();
        System.out.println("Ingresa tu Edad");
        b=teclado.nextInt();
        Nombre2(a, b);
        ///////////////////////////////////////////
        System.out.println("Nombre y Edad: "+Nombre3());
        ///////////////////////////////////////////
        System.out.println(Nombre4("Diego",23));
    }
}
