package javagg.arrays;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String mes[]= {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int tot[] ={31,28,31,30,31,31,30,31,30,31,30,31};
        System.out.print("Em que ano estamos? " );
        int ano;
        ano = leia.nextInt();

        //Como saber se um ano é bissexto? Se o resto da divisão do ano por 4 for = a 0 então este ano é bissexto
        if (ano % 4 == 0){
            System.out.print("Este ano é bissexto.");
            System.out.println("");
            tot[1] = 29;
        }else{
            System.out.print("Este ano não é bissexto.");
            System.out.println("");
            tot[1] = 28;
        }
    
        for (int i = 0; i < mes.length; i++){
            System.out.println("");
            System.out.println("O mês de " + mes[i] + " tem "+ tot[i] + " dias.");
            System.out.println("");
        }
    }
    
}
