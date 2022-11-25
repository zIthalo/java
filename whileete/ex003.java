package whileete;
/*
 * 3. Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
public class ex003 {
    public static void main(String[] args) {
        int paisA = 80000;
        int paisB = 200000;
        int qtdAnos = 0;

        while(paisB > paisA){
            double popPaisA = paisA * 0.03;

            double popPaisB = paisB * 0.015;

            paisA += popPaisA;

            paisB += popPaisB;

            qtdAnos++;
        }
        System.out.println("-------------------------------");
        System.out.println("O país A passará o país B em " + qtdAnos + " anos.");
        System.out.println("------------------------------");
    }
}
