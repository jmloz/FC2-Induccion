package induccion;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim;
        System.out.print("Dame el limite: ");
        lim = teclado.nextInt();
        System.out.print("Limite: " +lim);
        System.out.print("\nSecuencia");
        for (int i = 1; i < lim; i++) {
            if( i % 2 == 0){
                System.out.print(" - " + i);
            }
        }
        System.out.println("\nResultado: " +((lim/2)*((lim/2)+1)));

    }
    }
