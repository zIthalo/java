package javagg.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println(""); //usei isto para dar mais um espaçamento na saída de código
        System.out.println("");
        System.out.print("Digite a sua quantidade de pernas: ");
        
        int pernas = leia.nextInt();

        String tipo;

        //O segredo do switch em java é colocar a variável para ser lida e depois declarar ela na estrutura switch. Para que você não se esqueça mais, toda estrutura switch só trabalha com numeros inteiros e não pode ter intervalos, como as if else if else. Ex. if pernas > 16 && pernas < 20.. Aqui no switch as únicas coisas que você nomeia são o que as variáveis irão receber como valor e os números dos cases seguidos por :, o restante é só você gravar a ordem.
        
        switch (pernas){
            case 1:
            tipo = "Você é cotó";
            break;
            case 2:
            tipo = "Você é Bípede";
            break;
            case 3:
            tipo = "Você é um animal deficiente";
            break;
            case 4:
            tipo = "Você é Quadrúpede";
            break;
            case 5:
            tipo = "Você é uma aranha cotó" ;
            break;
            case 6:
            tipo = "Você é um araquinídeo, molusco ou crustáceo";
            break;
            case 7:
            tipo = "Você é um araquinídeo, molusco ou crustáceo cotó";
            break;
            case 8:
            tipo = "Você é um araquinídeo, molusco ou crustáceo";
            break;
            default:
            tipo = "Você é um bicho feio. Pra que tanta perna? ";
        }
        System.out.println("");
        System.out.println("");
        System.out.println(tipo);
        System.out.println("");
        System.out.println("");
    }
}
