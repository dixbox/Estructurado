
/**
 *
 * @author Omar Contla Garcia
 * @version 28/01/2026
 */
import javax.swing.*;
public class Operaciones2 {
    public static void main(String[] args) {
        int a, b, suma, resta;
        double division, multiplicacion;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        suma=a+b;
        resta=a-b;
        multiplicacion=(double)a*(double)b;
        division=(double)a/(double)b;
        JOptionPane.showMessageDialog(null,"Suma: "+suma+"\nResta: "+resta+"\nMultiplicacion: "+multiplicacion+"\nDivision: "+division);
    }
}
