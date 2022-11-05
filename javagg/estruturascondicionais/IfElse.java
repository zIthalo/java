package javagg.estruturascondicionais;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int anoAtual = 2022;
        int nasc;
        System.out.println("Digite o ano em que você nasceu: ");
        nasc = leia.nextInt();
        int idade = anoAtual - nasc;
        if (idade >= 18){
            System.out.println("Sua idade é de " + idade + ", você é de maior.");
        }else{
            System.out.println("Sua idade é de " + idade + ", você é de menor.");
        }
    }
}
