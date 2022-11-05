package loopforjava;
//Atualização e inicialização múltipla de variáveis: Rode o código abaixo no seu console e veja como ele se comporta:
public class Exemplo1 {
    public static void main(String[] args) {
        int x1 = 1;
        for (long x2 = 0, y = 0; x1 < 10 && x2 < 10; x1 ++, x2 ++){
            System.out.println("O valor de x2 é: " + x2);
        }
        System.out.println("O valor de x1 é: " + x1);
    }
}
