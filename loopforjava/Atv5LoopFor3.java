package loopforjava;
/*
   Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva: 

    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
 */
public class Atv5LoopFor3 {
   public static void main(String[] args) {
    double[] altM = {1.50, 1.60, 1.55, 1.66, 1.47 };
    double[] altH = {1.75, 1.77, 1.79, 1.90, 2};
    double media = (1.75+ 1.77+ 1.79+ 1.90+ 2) / 5;
    double mAlt = maximum(altH);
    double menorAlt = minimum(altM);
    System.out.println("");
    System.out.println("A maior altura é de: " + mAlt + " A menor altura é de: " + menorAlt);
    System.out.println("");
    System.out.println("A media da altura dos homens é de: " + media);
    System.out.println("");
    System.out.println("O número de mulheres foi de: " + altM.length);
   }
   public static double maximum(double[] numbers) {

    double altMax =numbers[0];
    for(double num : numbers){
        if(num > altMax){
            altMax = num;
        }
    }
    return altMax;
   }
   public static double minimum(double[] numbers){
    double altMin = numbers[0];
    for( double num : numbers){
        if (num < altMin){
            altMin = num;
        }
    }
    return altMin;
   }
}

/*
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

 */