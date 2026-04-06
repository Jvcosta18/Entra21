package DesvioCondicional;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int a = sc.nextInt();

        System.out.print("Lado 2: ");
        int b = sc.nextInt();

        System.out.print("Lado 3: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

    }
}