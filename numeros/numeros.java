package numeros;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int n, s =0;
        String resp;
        Scanner leia = new Scanner(System.in); /*new Scanner = objeto. Para criar uma classe Scanner você precisa colocar Scanner + o nome do scanner que você desejar, depois =, depois chamar o objeto new Scanner, e entre parêntesis colocar a classe de entrada(System.in);. Se fosse de saída seria System.out... ;) */ 
        do{
            System.out.println("Digite um número: ");

            n = leia.nextInt(); /*Aqui serve para ler números inteiros. Em algorítimos seria leia(n) */

            s+= n; /*Mesma coisa que s = s + n, para resumir s + = n */

            System.out.println("Quer continuar? [s/n]");

            resp = leia.next(); /*aqui somente para strings */

        }while (resp.equals("s")); /*Lê-se: enquanto a var resp for igual a s. Nunca esquecer de colocar um ponto e vírgula aqui */
        System.out.println("A soma de todos os valores é igual a " + s);
    }
}
