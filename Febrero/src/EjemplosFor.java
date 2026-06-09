
/**
 *
 * @author Omar Contla Garcia
 * @version 16/02/2026
 * Comprobacion de pruebas de escritorio con la estructura ciclica for.
 */
public class EjemplosFor {
    public static void main(String[] args) {
        //Inicia la estructura de bucle
        for(int i=1;i<=7;i++){
            System.out.println("El valor del contador es: "+i);
        }//Cierre del ciclo for
        //Segunda comprobacion
        int a=50;
        for(int i=0;i<=10;i++){
            a+=i;//Acumula el valor obtenido en cada vuelta de ciclo en la variable a,es lo mismo que escribir a=a+i
            System.out.println("El valor acumulado en la vuelta "+i+" es "+a);
        }//Tercera comprobacion
        int y=7;
        for(int i=3;i!=15;i++){
            y+=i;
            System.out.println("El valor acumulado en la vuelta "+i+" es "+y);
        }//Cuarta Comprobacion
        int j=1;
        for(int i=1;i<=5;i++){
            j+=Math.pow(i, 2);
            System.out.println("El valor acumulado en la vuelta "+i+" es "+j);         
        }//Quinta Comprobacion
        for(int i=0;i<=9;i+=3){
            System.out.println("El valor del contador es: "+i);
        }
    }
}
