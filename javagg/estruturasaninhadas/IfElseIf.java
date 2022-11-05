package javagg.estruturasaninhadas;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int anoAtual;
        int nasc;
        
        System.out.print("Em que ano você nasceu? ");
        nasc = leia.nextInt();
        System.out.print("Qual é o ano atual? ");
        anoAtual = leia.nextInt();
        int idade = anoAtual - nasc;
        System.out.println("Sua idade é " + idade);

        if (idade < 16){
            System.out.println("Você não pode votar");
        }else if(idade >= 16 && idade < 18 || idade > 65){
            System.out.println("Voto opicional.");
        }else{
            System.out.println("Voto obrigatório.");
        }
    }
}
