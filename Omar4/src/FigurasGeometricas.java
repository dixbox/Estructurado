
/**
 *
 * @author Omar Contla Garcia
 * @version 04/02/2026
 */
import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        System.out.println("Cual es el que deseas calcular el area y perimetro");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rombo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("Selecciona un numero: ");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().charAt(0);
        double per, lado, area, base, altura, radio, rm, rmb, pi;
        switch (opcion) {
            case '1', 'C':
                System.out.println("Ingresa los valores para calcular las medidas del Cuadrado");
                lado = sc.nextDouble();
                per = (lado * 4);
                area = (lado * lado);
                System.out.println("El perimetro es de: " + per + "\ny el area es de: " + area);
                break;
            case '2', 'R':
                System.out.println("Ingresa los valores para calcular las medidas del Rombo");
                System.out.println("Ingresa la Diagonal mayor");
                rm = sc.nextDouble();
                System.out.println("Ingresa la Diagonal menor");
                rmb = sc.nextDouble();
                System.out.println("Dame la medida de un lado");
                lado = sc.nextDouble();
                per = (lado * 4);
                area = (rm * rmb) / 2;
                System.out.println("El perimetro es de : " + per + "\ny el area es de: " + area);
                break;
            case '3', 'T':
                System.out.println("Ingresa los valores para calcular las medidas del Triangulo");
                System.out.println("Ingresa la medida de la base");
                base = sc.nextDouble();
                System.out.println("Ingresa la altura del tirangulo");
                altura = sc.nextDouble();
                per = (base * 3);
                area = (base * altura);
                System.out.println("El perimetro es de : " + per + "\ny el area es de: " + area);
                break;
            case '4', '0':
                System.out.println("Ingresa los valores del circulo");
                radio = sc.nextDouble();
                pi = 3.1416;
                area = (pi * (radio * radio));
                per = (2 * pi * radio);
                System.out.println("El perimetro es de : " + per + "\ny el area es de: " + area);
                break;
            default:
        }
    }
}
