package revisao;

import java.util.Scanner;

/*

Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:  F=(9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 * 
 */
public class CelsiusFarenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = 0, f = (9*c+160) / 5;
        System.out.println();
        System.out.print("Qual a temperatura em Celsius? ");
        c = sc.nextFloat();
        System.out.println();
        System.out.println("Esta temperatura de  "+ c + " em Farenheit seria "+ f);
        sc.close();
    }
}