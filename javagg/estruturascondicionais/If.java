package javagg.estruturascondicionais;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a 1º nota: ");
        float n1 = leia.nextFloat();
        System.out.println("Digite a 2º nota: ");
        float n2 = leia.nextFloat();
        float m = (n1 + n2) / 2;

        System.out.println("Sua média foi de " + m + ".");
        if (m>9){
            System.out.println("Parabéns!");
        }

    }
}
