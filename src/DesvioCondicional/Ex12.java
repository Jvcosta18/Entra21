package DesvioCondicional;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Operação (+ - * /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (op == '-') {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (op == '*') {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (op == '/') {
            System.out.println("Resultado: " + (n1 / n2));
        } else {
            System.out.println("Operação inválida");
        }

    }
}