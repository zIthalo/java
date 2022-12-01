package revisao;

import java.util.Scanner;
public class CodigoDeAcesso {

    public static void main(String[] args) {
        int codigo, senha;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código de acesso: ");
        codigo = sc.nextInt();

        if (codigo == 1234) {
            System.out.print("Insira a senha de acesso: ");
            senha = sc.nextInt();
            if(senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Código incorreto");
        }

        sc.close();
    }
}

