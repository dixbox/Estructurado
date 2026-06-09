
/**
 *
 * @author dixbo
 * @version 18/03/2026
 *Realiza un programa que permita ingresar 6 nombres por teclado y que los imprima a modo de lista utilizando
 *Un arreglo unidimensional
 */
import java.util.*;
public class Nombres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa 6 nombres");
        String []nombre=new String [6];
        for(int i=0;i<nombre.length;i++){
            System.out.println("Ingresa tu nombre");
            nombre[i]=sc.nextLine();
        }
        for(int i=0;i<nombre.length;i++){
            System.out.println("El nombre es: "+nombre[i]);
        }     
    }
}
