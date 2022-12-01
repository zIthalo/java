package revisao;

import java.util.Scanner;

/*
Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */
public class ConsumoMedio {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        double distancia = 0, combustivel = 0; 
        double consumo = distancia / combustivel;
        
        System.out.println();
        System.out.print("Digite a distancia percorrida pelo seu veículo: ");
        distancia = leia.nextFloat();
        System.out.print("Digite o total de combustível gasto: ");
        combustivel = leia.nextFloat();

        System.out.println("Seu automóvel percorreu " + distancia + "km você gastou " + combustivel + "l de combustível o consumo médio do seu automóvel é de " + consumo + " por litro.");
        leia.close();
    }
}
