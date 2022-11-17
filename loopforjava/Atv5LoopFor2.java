package loopforjava;
//Faça um programa imprima a soma de x variando de 1 a 20.

public class Atv5LoopFor2 {
    public static void main(String[] args) {
        int x, s;
        for(x = 1, s = 0; x<=20; x++){
            System.out.println("");
            System.out.println("Passo: " + x);
            s+=x;
            System.out.println(" ");
            System.out.println("Soma: " + s);
            System.out.println("");
        }
    }
}
