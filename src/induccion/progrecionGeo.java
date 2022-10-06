package induccion;
import java.util.*;
public class progrecionGeo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame a: ");
        int a = teclado.nextInt();
        System.out.print("Dame r: ");
        int r = teclado.nextInt();
        System.out.print("Dame n: ");
        int n = teclado.nextInt();
        System.out.print("Secuencia = "+a);
        //Codigo en accion.
        for (int i = 0; i < n; i++) {
            System.out.print(" + ("+a+"*"+r+")"+"^"+(i+1));
        }
        System.out.print("\nΣ = "+((((a)*(Math.pow((r),(n+1))))-a)/(r-1)));


    }
}
