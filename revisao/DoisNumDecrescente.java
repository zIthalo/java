package revisao;

import java.util.Scanner;

public class DoisNumDecrescente {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println();
        System.out.print("Digite o 1º número:  ");
        n1 = sc.nextDouble();
        System.out.println();
        System.out.print("Digite o 2º número:  ");
        n2=sc.nextDouble();
        System.out.println();
        if (n1 > n2) {
            System.out.println("Ordem decrescente: " + n1 +", "+ n2);
        } else {
            System.out.println("Ordem decrescente: " + n2 +", "+ n1);
        }
        sc.close();
    }
}
