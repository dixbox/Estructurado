
/**
 *
 * @author Omar Contla Garcia
 * @version 21/01/2026
 * Clase que verifica el uso y declaración de variable
 * de acuerdo a los tipos de datos * primitivos que se usan en Java.
 */
public class TiposDeDatos {//Creacion de la clase
    public static void main(String[] args) {//metodo de inicio
      /**CLASIFICACION DE LOS TIPOS DE DATOS
       * Enteros: byte, short, int, long
       * Decimales: double, float
       * Caracter: char
       * Lógico: boolean
       * Cadena: String (no primitivo)
       */  
      
      //TIPOS DE DATOS PRIMITIVOS ENTEROS
      byte edad=19;//8 bits, variable edad inicializada con un valor
      short id=1212;//16 bits
      int matricula=250372, cambioEntero, cambioCaracter;//32 bits
      long registroActa=89521155;//64 bits
      
      //TIPOS DE DATOS PRIMITIVOS DECIMALES
      double estatura=1.83, cambioCadena;//64 bits
      float peso=98.6f, cambioDecimal;//32 bits
      
      //TIPO DE DATO LÓGICO NO PRIMITIVO
      boolean estatus=true;
      
      //TIPO DE DATO CARACTER
      char genero='M';//Se usan comillas simples para asignar valores en una variable tipo char
      
      //TIPO DE DATO CADENA NO PRIMITIVO
      String nombre="Omar", area="32.32";
      
      //CASTEO DE TIPOS DE DATOS (CAMBIO)
      cambioEntero=(int)id;//Cambio del valor de la variable id a entero
      cambioCaracter=(int)genero;
      System.out.println("El caracter M en ASCII es:"+cambioCaracter);
      cambioDecimal=(float)matricula;
      System.out.println(cambioDecimal);
      cambioCadena=Double.parseDouble(area);//El casteo para cadenas de texto se
      //hace con el metodo de pase de parametros al tipo de dato correspondiente.
      System.out.println(cambioCadena);
    }
}
