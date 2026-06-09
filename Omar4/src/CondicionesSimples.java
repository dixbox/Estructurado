
/**
 *
 * @author Omar Contla Garcia
 * @version 27/01/2026
 */
import java.util.Scanner;
public class CondicionesSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int grados;
        System.out.println("¿A cuantos grados de temperatura estamos?");
        grados=teclado.nextInt();
        
        //Inicia la condición simple
         //El if hace referencia al Si de PSeInt
         if(grados>=-5 & grados<=7){//Entonces
             System.out.println("Hace mucho frio quedate en casa");
             //Inicia la condición compuesta
         }else if(grados>=8 & grados<=19){//SiNo en PSeInt
             System.out.println("Ya puedes ir a la escuela, el clima esta mejor");
         }else if(grados>=20 & grados<=32){
             System.err.println("Esta temperatura no esta registrada");
         }
    }
}
