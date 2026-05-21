package DesvioCondicional;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Número positivo");
        } else if (num < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número é zero");
        }

    }
}