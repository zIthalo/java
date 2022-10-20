package numeros;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int n, s =0;
        String resp;
        try (Scanner leia = new Scanner(System.in)) {
            do{
                System.out.println("Digite um número: ");

                n = leia.nextInt(); /*Aqui serve para ler números inteiros. Em algorítimos seria leia(n) */

                s+= n; /*Mesma coisa que s = s + n, para resumir s + = n */

                System.out.println("Quer continuar? [s/n]");

                resp = leia.next(); /*aqui somente para strings. ex. a variável resp recebe nome do scanner (leia) para string (.next()) */

            }while (resp.equals("s")); /*Lê-se: enquanto a var resp for igual a s. Nunca esquecer de colocar um ponto e vírgula aqui */
        } 
        System.out.println("A soma de todos os valores é igual a " + s);
    }
}
