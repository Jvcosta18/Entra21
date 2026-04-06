package DesvioCondicional;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secreto = 7;

        System.out.print("Digite um número: ");
        int palpite = sc.nextInt();

        if (palpite == secreto) {
            System.out.println("Acertou!");
        } else if (palpite < secreto) {
            System.out.println("O número é maior");
        } else {
            System.out.println("O número é menor");
        }

    }
}