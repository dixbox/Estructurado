
/**
 *
 * @author Omar Contla Garcia
 * @version 23/03/2026
 * Clase que muestra como se declara e inicializa un 
 * arreglo bidimensional
 */
public class Bidimensionales {
    public static void main(String[] args) {
        //Declaracion de un arreglo bidimensional
        float estatura [][]=new float [3][3];
        //Asignar datos a las posiciones del arreglo
        estatura[0][0]=1.50f;
        estatura[0][1]=1.46f;
        estatura[0][2]=1.80f;
        float alumno1=estatura[0][0];
        System.out.println("Estatura de Juan "+estatura[0][0]);
        System.out.println("Estatura de Juan "+alumno1);
        
        ///////////////////////////////////////////////////////////////////////////////////////
        
        int edades[][]={{3,2,1},{4,6,7},{3,3,9}};//Se toma para el for
        System.out.println("Posicion 2,2 del arreglo "+edades[2][2]);
        
        //////////////////////////////////////////////////////////////////////////////////////
        
        String semana[][]={{"Lunes","Martes","Miercoles"},{"Jueves","Viernes","Sabado"}};
        System.out.println("Posicion 2,2 "+semana[1][1]);
        
        //////////////////////////////////////////////////////////////////////////////////////
        
        /**************+Recorrer un arreglo bidimensional con for*************/
        int edad[][]={{3,2,1},{4,6,7},{3,3,9}};
        String cadena=" ";
        //Recorrer Filas
        for(int i=0;i<edad.length;i++){
            
            //Recorer Columnas
            for(int j=0;j<edad[i].length;j++){
                System.out.println(edad[i][j]);
            }
        }
        System.out.println(cadena);//Imprimo la matriz
    }
}
