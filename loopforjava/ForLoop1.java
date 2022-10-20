package loopforjava;

public class ForLoop1 {
    public static void main(String[] args) {
        {
        int[] pontos = {101, 102, 95, 106, 160};
        int hPontos = maximum(pontos);
        System.out.println("A melhor pontuação é: " + hPontos);
        }
    }
    public static int maximum(int[] numbers){
        int pontMax = numbers[0];

        for (int num : numbers){
            if (num > pontMax){
                pontMax = num;
            }
        }
        return pontMax;
    }
}
