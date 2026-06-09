
/**
 *
 * @author Omar Contla Garcia
 * @version 09/02/2026
 * Clase para verificar el funcionamiento de los metodos para tratamiento de datos tipo cadena o caracter
 */
import javax.swing.*;
import java.util.Scanner;
public class TratamientoDeDatos {
    public static void main(String[] args) {
     String nombre="Pedro",nombres="Juan",email="usuario@gmail.com";
     //Metodo que sirve para ver el tamaño de una cadena de texto
     //En PSeInt se llamaba Longitud
     JOptionPane.showMessageDialog(null,"El nombre: "+nombre+" tiene "+nombre.length()+" letras");
     System.out.print("El nombre: "+nombre+" tiene "+nombre.length()+" letras");
     //Metodo que muestra un caracter de acuerdo a la posicion en la que se encuentra en la palabra o frase
     JOptionPane.showMessageDialog(null,"Mi nombre inicia con la letra "+nombre.charAt(0));
     //Metodo que permite igualar cadenas de texto o comparar
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es igual al de "+nombre+" "+nombre.equals("Pedro"));//True
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es igual al de "+nombre+" "+nombre.equals("PEDRO"));//False
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es igual al de "+nombre+" "+nombre.equals(nombre));//True
     //Metodo que permite comparar una cadena sin importar como esta escrita
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es igual al de "+nombre+" "+nombre.equalsIgnoreCase(nombres));
     //Metodo para sustituir un texto
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" ahora es "+nombre.replace('J','L'));
     //Metodo para sustituir una cadena de texto
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es reemplazado por "+nombre.replaceAll(nombre, "Lupita"));
     JOptionPane.showMessageDialog(null,"El nombre de "+nombre+" es reemplazado por "+nombre.replaceAll(nombre, nombres));
     //Metodo que devuelve el valor unicode de ASCII,por ejemplo si tengo el alt+123 me devuelve la llave
     JOptionPane.showMessageDialog(null,"En ASCII la letra o es "+nombre.codePointAt(4));
     //Metodos que permiten cambiar cualquier cadena de mayuscula a minuscula y viceversa
     JOptionPane.showMessageDialog(null,"Muestra "+nombres+" en minuscula "+nombres.toLowerCase());
     JOptionPane.showMessageDialog(null,"Muestra "+nombres+" en minuscula "+nombres.toUpperCase());
     //Metodo que permite mostrar parte de una cadena a partir de su posicion un valor previo y no posterior
     JOptionPane.showMessageDialog(null,"Muestra parte de la cadena Pedro "+nombre.substring(1, 3));
     //Metodo que sirve para indexar o mostrar una parte
     JOptionPane.showMessageDialog(null, email.substring(7));
    }
}
