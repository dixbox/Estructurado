
/**
 *
 * @author Omar Contla Garcia
 * @version 03/02/2026
 * Clase para verificar el funcionamiento de la estructura de selección multiple
 */
import java.util.Scanner;
public class CitasMedicas {
    public static void main(String[] args) {
        System.out.println("Agenda tu cita medica");
        System.out.println("1. Pediatra");
        System.out.println("2. Medicina General");
        System.out.println("3. Internistas");
        System.out.println("Selecciona un Numero: ");
        Scanner sc=new Scanner(System.in);
        char opcion=sc.next().charAt(0);
        //String opcion=sc.nextLine();
        //int eleccion=sc.nextInt();//Variable de opcion de casos entera
        double pago;
        int dia;
        //Inicia la estructura de selección múltiple
        switch (opcion){
        //switch(eleccion){//Variable de tipo entero 
            //case 1://Ejemplo de un caso de tipo entero
            case 'p','1':
                System.out.println("Ingresa el dia de tu cita medica con un valor del 1 al 5");
                dia=sc.nextInt();
                //Inicia estructura anidada
                if(dia>=1 & dia<=3){
                    pago=150-(150*0.20);
                    System.out.println("Su cita es el dia: "+dia+"\nEl pago es de: "+pago);
                }else if(dia==4){
                    pago=150-(150*0.10);
                    System.out.println("Su cita es el dia: "+dia+"\nEl pago es de: "+pago);
                }else if(dia==5){
                pago=150-(150*0.05);
                System.out.println("Su cita es el dia: "+dia+"\nEl pago es de: "+pago);
                }else{
                    System.out.println("Ese dia no se agendan citas");
                    }
            break;//Indica el cierre
            
            case 'm','2':
                System.out.println("Ingresa el dia de tu cita medica con un valor del 1 al 5");
                dia=sc.nextInt();
                if(dia==3){
                    pago=150-(150*0.50);
                    System.out.println("Tu pago es: "+pago);
                    System.out.println("El dia: "+dia);
                }else{
                    pago=150;
                    System.out.println("Tu cita es el dia: "+dia+"\nTu pago es de: "+pago);
                }
                break;//Cierre del caso 2
            case 'I','3'://Caso 3
                System.out.println("Ingresa el dia de tu cita medica con un valor del 1 al 5");
                dia=sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa la hora de tu dia");
                String hora=sc.nextLine();
                pago=150;
                System.out.println("El pago de la consulta es: "+pago);
                System.out.println("Hora: "+hora+"\nDia: "+dia);
                break;//Cierre caso 3
            default://De otro modo en caso de la opcion
                System.out.println("Ese servivio no esta disponible"); 
        }
    }
}
