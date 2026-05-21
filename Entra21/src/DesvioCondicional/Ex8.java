package DesvioCondicional;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int a = sc.nextInt();

        System.out.print("Lado 2: ");
        int b = sc.nextInt();

        System.out.print("Lado 3: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triângulo");
        } else {
            System.out.println("Não forma triângulo");
        }

    }
}