package DesvioCondicional;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Parcela: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.30) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }

    }
}