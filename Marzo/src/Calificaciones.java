
/**
 *
 * @author Omar Contla Garcia
 * @version 24/03/2026
 */
import java.util.*;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. DECLARACIÓN E INICIALIZACIÓN DE ARREGLOS
        // Arreglo predefinido con los nombres de los 8 estudiantes
        String[] nombres = {"Pedro","Juan","Kevin","Guillermo","Gael","Omar","Esau","Jose"};
        // Arreglo vacío para almacenar las 8 calificaciones que se ingresaran
        double[] calificaciones = new double[8];
        // 2. VARIABLES PARA ESTADÍSTICAS
        // Contadores para saber cuántos estudiantes caen en cada categoría
        System.out.println("Registro de Calificaciones");
        // 3. BUCLE PRINCIPAL: CAPTURA Y CLASIFICACIÓN
        // Recorre el arreglo para pedir la calificación de cada estudiante
        int contExc = 0, contReg = 0, contCri = 0;
        // Acumuladores para sumar las calificaciones de cada categoría y luego sacar el promedio
        double sumaExc = 0, sumaReg = 0, sumaCri = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            double nota;
            // a) Validación de entrada con ciclo do-while
            // Garantiza que la calificación esté estrictamente entre 0 y 10
            do{
                System.out.print("Ingrese calificacion para " + nombres[i] + " (0-10): ");
                nota = sc.nextDouble();
                // Uso del operador OR lógico (||) para la condición de error
                if(nota<0||nota>10){
                System.out.println("¡Error! La calificacion debe estar entre 0 y 10.");
            }
            }while(nota<0||nota>10);
            // b) Almacenamiento en el arreglo
            calificaciones[i]=nota;
            // c) Clasificación inmediata y actualización de estadísticas
            // Dependiendo del rango de la nota, se aumenta el contador y se suma al acumulador correspondiente
            if(nota==10){
                contExc++;
                sumaExc+=nota;
            }else if (nota>=7 & nota<=9){// Se usa AND lógico (&) para evaluar el rango
                contReg++;
                sumaReg+=nota;
            }else if(nota<6){
                contCri++;
                sumaCri+=nota;
            }
        }
        // 4. IMPRESIÓN DEL REPORTE DETALLADO
        System.out.println("\n--- Lista de Resultados ---");
        // Se vuelve a recorrer el arreglo para imprimir los datos guardados
        for (int i = 0; i < calificaciones.length; i++) {
            String categoria = "";
            // Se asigna la etiqueta en texto según la calificación almacenada
            if (calificaciones[i] == 10) categoria = "Excelente";
            else if (calificaciones[i] >= 7 && calificaciones[i] <= 9) categoria = "Regular";
            else if (calificaciones[i] < 6) categoria = "Critico";
            else categoria = "Sin categoría (6-6.9)";
            // Imprime el nombre, la calificación y su categoría
            System.out.println(nombres[i] + " - Calificacion: " + calificaciones[i] + " [" + categoria + "]");
    }
        // 5. CÁLCULO E IMPRESIÓN DE PROMEDIOS FINALES
        System.out.println("\n--- Estadísticas Finales ---");
        // Se utiliza el operador ternario (condicion ? verdadero : falso) para evitar 
        // una división por cero (NaN) en caso de que un contador esté en 0.
        System.out.println("Total Excelentes (10): " + contExc + " Promedio: " + (contExc > 0 ? (sumaExc / contExc) : 0));
        System.out.println("Total Regulares (7-9): " + contReg + " Promedio: " + (contReg > 0 ? (sumaReg / contReg) : 0));
        System.out.println("Total Criticos (< 6): " + contCri + " Promedio: " + (contCri > 0 ? (sumaCri / contCri) : 0));
        // Cierre del objeto Scanner para liberar recursos
        sc.close();
    }
}
