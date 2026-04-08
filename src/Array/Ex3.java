package Array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" Digitite o " + (i + 1) + " numero ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros Pares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Numeros Impares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);

            }

        }

    }
}