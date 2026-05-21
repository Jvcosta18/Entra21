package DesvioCondicional;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        double desconto = 0;

        if (valor > 500) {
            desconto = valor * 0.20;
        } else if (valor >= 101) {
            desconto = valor * 0.10;
        }

        double total = valor - desconto;

        System.out.println("Total com desconto: " + total);

    }
}