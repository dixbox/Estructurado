
/**
 *
 * @author dixbo
 */
import java.util.*;
public class SumaMatrices {
    public static void main(String[] args) {
        int matriz1[][] = new int[4][5];
        int matriz2[][] = new int[4][5];
        int contador,contador1;
        contador=1;
        contador1=20;
        String cadena="\n";
        for (int i=0;i<matriz1.length;i++){
            cadena+="\n";
            for(int j=0;j<5;j++){
                matriz1[i][j]=contador++;
                cadena+=matriz1[i][j]+" ";
            }
        }
        System.out.println("Matriz Uno:"+cadena);
        String cadena1="\n";
        for (int i=0;i<matriz2.length;i++){
            cadena1+="\n";
            for(int j=0;j<5;j++){
                matriz2[i][j]=contador1--;
                cadena1+=matriz2[i][j]+" ";
            }
        }
        System.out.println("Matriz Dos:"+cadena1);
        String cadena2="\n";
        for (int i=0;i<matriz2.length;i++){
            cadena2+="\n";
            for(int j=0;j<5;j++){
                cadena2+=matriz1[i][j]+matriz2[i][j]+" ";
            }
        }
        System.out.println("Matriz Tres:"+cadena2);
    }
}
