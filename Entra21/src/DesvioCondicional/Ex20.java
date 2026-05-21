package DesvioCondicional;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "1234";
        int tentativas = 0;

        while (tentativas < 3) {

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("Senha incorreta");
            }

            tentativas++;
        }

        if (tentativas == 3) {
            System.out.println("Acesso bloqueado");
        }

    }
}