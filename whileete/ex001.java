package whileete;

import java.util.Scanner;

/*EXERCÍCIO
1 Faça um programa que mostre a soma de todos os números no intervalo determinado pelo usuário.
Logo, peça para que o usuário defina o início da contagem e em seguida, peça ao mesmo que informe o final. */
public class ex001 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, soma;
        System.out.print("Por onde você deseja que a contagem comece? ");
        n1 = leia.nextInt();
        System.out.print("Onde você quer que termine? ");
        n2 = leia.nextInt();
        while (n1 <= n2){
            n1++;
            soma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + soma);
        }
        
    }
    
}
