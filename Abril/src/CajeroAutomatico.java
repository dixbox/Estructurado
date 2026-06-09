
/**
 *
 * @author Omar Contla Garcia
 * @version 21/04/2026
 */
import javax.swing.JOptionPane;
public class CajeroAutomatico {
    static double saldo=2000.0;
    public static void main(String[] args){
        if (!autenticador()){
            JOptionPane.showMessageDialog(null, "El sistema se ha bloqueado debido a multiples intentos fallidos.");
            return;
        }
        int opcion;
        do {
            String menu = "      CAJERO AUTOMATICO\n" +
                          "1. Depositar dinero a la cuenta\n" +
                          "2. Retirar dinero de la cuenta\n" +
                          "3. Consultar saldo\n" +
                          "4. Cancelar transaccion\n" +
                          "5. Salir\n" +
                          "Elige una opcion: ";
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    deposito();
                    break;
                case 2:
                    retiro();
                    break;
                case 3:
                    saldo();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Transacción cancelada. Regresando al menu principal...");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Por favor, intenta de nuevo.");
            }
        } while (opcion !=5);
    }
    public static boolean autenticador(){
        int nipCorrecto=1234;
        int intentos=0;
        int maxIntentos=3;
        JOptionPane.showMessageDialog(null, "Bienvenido al Banco DIXBOX.");
        while (intentos<maxIntentos) {
            int nipIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu NIP de 4 digitos: "));
            if (nipIngresado==nipCorrecto) {
                JOptionPane.showMessageDialog(null, "Has Ingresado al Cajero");
                return true;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "NIP incorrecto. Intento "+intentos+" de "+maxIntentos);
            }
        }
        return false;
    }
    public static void deposito(){
        double cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas depositar: $"));
        if (cantidad>0) {
            saldo+=cantidad;
            JOptionPane.showMessageDialog(null, "Deposito exitoso. Tu nuevo saldo es: $"+saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Error: La cantidad a depositar debe ser mayor a $0");
        }
    }
    public static void retiro(){
        double cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas retirar: $"));

        if (cantidad>saldo) {
            JOptionPane.showMessageDialog(null, "Error: No cuenta con saldo suficiente.");
        } else if (cantidad<=0) {
            JOptionPane.showMessageDialog(null, "Error: La cantidad a retirar debe ser mayor a $0.");
        } else {
            double saldoAnterior=saldo;
            saldo-=cantidad;
            JOptionPane.showMessageDialog(null, "\n TICKET DE RETIRO\n" +
                                                "Saldo anterior: $"+saldoAnterior+"\n" +
                                                "Cantidad retirada: $"+cantidad+"\n" +
                                                "Saldo final: $"+saldo);
        }
    }
    public static void saldo(){
        JOptionPane.showMessageDialog(null, "\nTu saldo actual es: $"+saldo);
    }
}
