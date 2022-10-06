package induccion;
import java.util.Scanner;
public class ImpMain {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int lim;
        System.out.print("Dame el limite: ");
        lim = teclado.nextInt();
        System.out.print("Limite: " +lim);
        System.out.print("\nSecuencia");
        for (int i = 0; i < lim; i++) {
            if( !(i % 2 == 0)){
                System.out.print(" - " + i);
            }
        }
        System.out.println("\nResultado: " +Math.pow(lim,2));

    }
}
