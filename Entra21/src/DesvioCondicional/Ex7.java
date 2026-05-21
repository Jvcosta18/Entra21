package DesvioCondicional;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();

        if (nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Regular");
        } else if (nota <= 8) {
            System.out.println("Bom");
        } else {
            System.out.println("Excelente");
        }

    }
}