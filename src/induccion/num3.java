package induccion;
import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame N: ");
        int n = teclado.nextInt();
        System.out.println("N = "+ n);
        System.out.print("Secuencia = 1");
        for (int i = 0; i < n ; i++) {

            System.out.print(" + 2^"+(i+1));

        }
        System.out.println("\nΣ = " + ((Math.pow(2,n+1))-1));

    }
}
