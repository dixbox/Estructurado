
/**
 *
 * @author Omar Contla Garcia
 * @version 10/02/2026 Clase para observar el comportamiento de funciones
 * matematicas estaticas para realizar calculo o tratar datos numericos
 */
import javax.swing.*;

public class FuncionesMatematicas {

    public static void main(String[] args) {
        double radio = 5.0;
        //Metodo que sirve para usar el valor de pi y hacer el calculo de la potencia
        double area = Math.PI * Math.pow(radio, 2);
        //Math.PI duvuelve 3.1416
        //Math.Pow(base,exponente) determina la potencia de un numero
        JOptionPane.showMessageDialog(null, "Area del circulo " + area);

        //Funciones que permiten redondear numeros
        double numero = 5.7;
        //Redondea al siguiente numero mas arriba despues del punto
        double resultado = Math.ceil(numero);//Aqui debemos obtener el valor de 6
        //Metodo que redondea al entero mas cercano de acuerdo a la regla matematica
        double resultado2 = Math.round(numero);//Salida 6
        //Metodo que redondea al numero mas cercano hacia abajo-truncar
        double resultado3 = Math.floor(numero);//Salida 5
        JOptionPane.showMessageDialog(null, "Valor redondeado con ceil " + resultado + "\nValor redondeado con round " + resultado2 + "\nValor redondeado con floor " + resultado3);
        //Metodo que sirve para mostrar un valor absoluto
        double absoluto = Math.abs(area);
        JOptionPane.showMessageDialog(null, (int) Math.abs(area));
        JOptionPane.showMessageDialog(null, (int) absoluto);/*Todas las funciones de la 
      libreria Math arrojan resultados con decimales porque corresponden al tipo de dato,
      double,para verlo en enterose puede castear las funciones
         */
        //Metodo que permite realizar el calculo de la raiz cuadrada
        //Forma 1
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de 8 es " + Math.sqrt(8));
        int valor = 8;
        //Forma 2
        double raiz = Math.sqrt(valor);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de 8 es " + raiz);
        //Forma 3
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero para determinar la raiz cuadrada"));
        double raiz2 = Math.sqrt(valor);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de " + valor2 + " es " + raiz2);
        //Metodo para determinar la cubica de cualquier valor
        JOptionPane.showMessageDialog(null, "La raiz cubica de 9 es " + Math.cbrt(9));
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero para detrminar la raiz cubica"));
        double raiz3 = Math.cbrt(numero1);
        JOptionPane.showMessageDialog(null, "La raiz cubica de " + numero1 + " es " + raiz3);
        //Metodo que determina el valor maximo de dos numeros
        //Forma 1
        double maximo = Math.max(5, 3);
        JOptionPane.showMessageDialog(null, "El valor mayor entre 5 y 3 es: " + maximo);
        //Forma 2
        double dato1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
        double dato2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
        double maximo2 = Math.max(dato1, dato2);
        JOptionPane.showMessageDialog(null, "El mayor de los numeros ingresados es: " + maximo2);
        //Metodo que determina el valor minimo de dos numeros
        double minimo = Math.min(800, 758);
        JOptionPane.showMessageDialog(null, "El valor minimo entre 800 y 758 es " + minimo);
        //Metodo que permite obtener numeros aleatorios
        JOptionPane.showMessageDialog(null, "Numero aleatorio entre el 1 y el 10 " + Math.random());
        double aleatorio = Math.random() * 11;
        JOptionPane.showMessageDialog(null, (int) aleatorio);
    }
}
