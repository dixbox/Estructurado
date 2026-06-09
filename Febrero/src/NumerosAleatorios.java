
/**
 *
 * @author Omar Contla Garcia
 * @version 24/02/2026
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        int suma=0;
        double cubo=1;
        for (int i=1;i<=15;i++){
          double aleatorio=(int)(Math.random()*(120-60+1)+60);
          System.out.println(""+(int)aleatorio);
          suma+=aleatorio;
          cubo=Math.pow(suma, 3);
        }
        System.out.println("La suma es: "+suma+" el cubo de la suma de aleatorios es: "+cubo);
    }
}
