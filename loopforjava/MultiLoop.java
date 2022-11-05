package loopforjava;
//Loop com múltiplas declarações e instruções:  Rode o código abaixo no seu console e veja como ele se comporta:
public class MultiLoop {
    public static void main(String[] args) {
        int a, sum;
        for(a = 1, sum = 0; a<=5; ++a){
            System.out.println("O valor de a agora é: " +a);
            sum+=a;
        }
        System.out.println("A soma dos números é: " + sum);
    }
}
