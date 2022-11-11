package exerciciosete;
import java.util.Scanner;

/*

 Nesta questão iremos multiplicar o índice do nosso Array pelo seu valor. Por fim, iremos calcular a média aritmética, isto é, iremos somar todos os valores e dividi-los pela quantidade de itens. Execute o código no seu console/programa analisando sua estrutura e evidenciando seu resultado.
 
 */

public class Arrays1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valores[] = new int[7];
           
        for(int i = 0; i<7; i++){
            System.out.printf("Digite o número da posição [%d]: ", (i+1));
            valores[i] = leia.nextInt();
        }
        
        int somaElementos = 0;
        for(int x = 0; x<7; x++){
            somaElementos += valores[x];
        }
        System.out.printf("A soma dos elementos é: %d\n", somaElementos);
        for(int x = 0; x<7; x++){
            int produto = (valores[x] * x);
            System.out.printf("A mult. do índice pelo elem. %d * %d = %d\n", valores[x], x, produto);
        }

        double soma = somaElementos;
        double media = soma /7.0;
        System.out.printf("A media aritmética é: %f\n", media);
    }
}
