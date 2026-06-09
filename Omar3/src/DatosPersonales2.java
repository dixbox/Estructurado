
/**
 *
 * @author Omar Contla Garcia
 * @version 28/01/2026
 * Clase de java para utilizar la libreria swing para
 * ingreso de datos por teclado.
 */
import javax.swing.*;//Importacion de la libreria la clase swing
public class DatosPersonales2 {
    public static void main(String[] args) {
        String nombreCompleto;
        int matricula;
        float promedio;
        
        /*Ingreso de datos por teclado con el componente
        JOptionPane
        */
        nombreCompleto=JOptionPane.showInputDialog("Ingresa tu nombre completo");
        matricula=Integer.parseInt((JOptionPane.showInputDialog("Ingresa tu matricula")));
        promedio=Float.parseFloat((JOptionPane.showInputDialog("Ingresa tu promedio")));
        
        //Salida por pantalla de los datos ingresados
        JOptionPane.showMessageDialog(null,"Nombre: "+nombreCompleto+"\nMatricula: "+matricula+"\nPromedio: "+promedio);
    }
}
