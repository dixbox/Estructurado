
/**
 * 
 * @author Omar Contla Garcia
 * @version 23/02/2026
 */
import java.util.Scanner;
public class BucleCuatro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Definir un iterador inicializado en 1
        int i=1;
        int numero;
        //Definir una variable boleana inicializada en verdadero
        boolean continuar=true;
        System.out.println("Cuantos numeros quieres ver iniciando del 1");
        numero=sc.nextInt();
        //Iniciar el ciclo
        do{
          System.out.println("El valor de i es: "+i);
          if(i>=numero){
              continuar=false;
          }
          i++;//Incremento en 1 en cada vuelta de ciclo
        }while(continuar);
    }
}
