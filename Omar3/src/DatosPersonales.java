
/**
 *
 * @author Omar Contla Garcia
 * @version 21/01/2026
 */
import java.util.Scanner;
public class DatosPersonales {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa tu Nombre");
        String nombre=teclado.nextLine();
        System.out.println("Ingresa tu Matricula");
        int matricula=teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa tu Genero");
        String genero=teclado.nextLine();
        System.out.println("Ingresa tu Promedio del Primer Cuatrimestre");
        double cuatri=teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingresa tu Carrera");
        String carrera=teclado.nextLine();
        teclado.close();
        System.out.println("Nombre: "+nombre+"\nMatricula:"+matricula+"\nGenero: "+genero+"\nPromedio del primer cuatrimestre: "+cuatri+"\nCarrera: "+carrera);
    }
}
