package loopforjava;
//Loop For Each: Rode o código abaixo no seu console e veja como ele se comporta:
public class MeuForEachExemplo {
    public static void main(String[] args) {
        
        int [] pontos = {101,102,95,106,160};
        int h_pontos = maximum(pontos);
        System.out.println("A melhor pontuação é " + h_pontos);
    
    }
    public static int maximum(int[] numbers){
        int pontMax = numbers[0];
        for(int num : numbers){
            if(num > pontMax){
                pontMax = num;
            }
        }
        return pontMax;
    }
}
