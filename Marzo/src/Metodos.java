
/**
 *
 * @author Omar Contla Garcia
 * @version 09/03/2026
 * Clase para crear los 4 tipos de metodos
 * para crear funciones y subprogramas en java
 */
import java.util.Scanner;//Libreria
////////////////////////////////////////CLASE HIJA DE METODOS////////////////////////////////////////////////
public class Metodos {//Clase
    //Metodo sin retorno sin parametros
    public static void Suma(){/*El metodo es sin retorno porque usa la palabra void de vacio,
        se coloca el nombre del metodo iniciando con mayusculas y el parentesis
        no lleva ningun parametro */
        int a=10, b=90, c;
        c=a+b;
        System.out.println("Suma: "+c);
        System.out.println("Suma: "+(a+b));
    }
    //Metodo sin retorno con parametros
    public static void Suma2(int a, int b){/*Los parametros para el metodo deben de tener
        un nombre descriptivo y el tipo de dato que corresponde */
        int c;
        c=a+b;
        System.out.println("Suma 2: "+(a+b));
        System.out.println("Suma: "+c);
    }
    //Metodo con retorno sin parametros
    public static int Suma3(){
        int a=90, b=20;  
        return a+b;//Se debe indicar el tipo de retorno de acuerdo al tipo de dato
    }
    //Metodo con retorno con parametros
    public static int Suma4(int a, int b){
        int c;
        c=a+b;
        return c;
    }
    /*El metodo principal siempre se va a colocar en la parte inferiorde todos los metodos creados cuando
    se usa en una misma clase, en el metodo principal se mandara llamar (es decir se invocara)el metodo de suma */
    ////////////////////////////////////////CLASE PRINCIPAL O CLASE PADRE////////////////////////////////////////////////
    public static void main(String[] args) {
        //Invocacion del metodo sin retorno sin parametros
        Suma();
        //Ingreso de datos por teclado para pasar los valores que necesita el metodo Suma 2()para realizar la operacion
        int a,b;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa el primer valor");
        a=teclado.nextInt();
        System.out.println("Ingresa el segundo valor");
        b=teclado.nextInt();
        
        //Invocacion del metodo sin retorno con parametros
        Suma2(250,135);
        //Inovacion del metodo sin retorno con parametros de los datos ingresados por el usuario
        Suma2(a, b);
        //Invocacion del metodo con retorno sin parametros
        System.out.println("Suma 3: "+Suma3());
        //Invocacion del metodo con retorno con parametros
        System.out.println("Suma 4: "+Suma4(60, 60));
    }
}
