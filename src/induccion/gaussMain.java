package induccion;
import java.util.Scanner;
public class gaussMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
            System.out.print("Dame el limite: ");
            n = teclado.nextInt();
            int arreglo[] = new int[n];

            // (n(n+1))/2
            arreglo[0] = 1;
            for (int i = 1; i < arreglo.length; i++) {
                arreglo[i] = i + 1;
            }

            System.out.println("Limite: " + n);
            System.out.print("Secuencia:");
            for (int i = 0; i < arreglo.length; i++) {

                System.out.print(" - " + arreglo[i]);

            }
            System.out.print("\nResultado: " + (((n) * (n + 1)) / 2));


    }
}