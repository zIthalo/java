package whileete;

import java.util.Scanner;

/*
 * Faça um programa que peça para o usuário digitar um número,
 em seguida, faça a soma de todos os algarismos do número.
EXEMPLO: 111 = 1+1+1 = 3
	   2090 = 2+0+9+0 = 11

 */
public class ex002ete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        int somaAlg = 0;
        System.out.print("Digite um número : ");
        n1 = leia.nextInt();

        while (n1>0){

            int modulo = n1 % 10;

            somaAlg += modulo;

            n1 /= 10;
            System.out.println("O valor da soma é "+ somaAlg);
        }
        System.out.println();
        System.out.println("A soma dos algarismos é: " + somaAlg);

    }
}
