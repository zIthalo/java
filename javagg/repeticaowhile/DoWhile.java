package javagg.repeticaowhile;

import java.util.Scanner;


public class DoWhile {
    public static void main(String[] args){
        int n, s = 0;
        String resposta;
        Scanner leia =  new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("------------------");
            System.out.println("  Somador boladão ");
            System.out.println("------------------");
            System.out.println("");
            System.out.print("Digite um número: ");
            n = leia.nextInt();
            s += n;
            System.out.print("Quer continuar? [s/n] ");
            resposta = leia.next();
        }while (resposta.equals("s"));

        System.out.println("--------------------");
        System.out.println("  Calculando . . .");
        System.out.println("--------------------");
        System.out.println("");   
        System.out.println("A soma de todos os valores é " + s);
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("        FIM         ");
        System.out.println("--------------------");
    }
}
