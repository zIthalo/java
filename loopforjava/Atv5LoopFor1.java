package loopforjava;

//Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100

public class Atv5LoopFor1 {
    public static void main(String[] args) {
        int n, soma;
        for(n = 1, soma = 0; n <=100; ++n){
            System.out.println("Passo: " + n);
            soma+=n;
        }
        System.out.println("A soma de todos os números é de: " + soma);
    }
}
