
import java.util.Scanner;

public class imc {
    /*Faça umalgoritmo que solicite o nome da pessoa, sexo, idade, peso e altura em seguida apresente um relatório onde exiba os dados da pessoa e o seu imc considere imc da segunte forma: IMC  */
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, sexo; 
        int idade;
        double peso = 0;
        double altura = 0;
        double IMC;
        
        System.out.print("Olá, digite o seu nome: ");
        nome = leia.next();

        System.out.print("Olá, " + nome + ". Agora digite seu sexo: ");
        sexo = leia.next();

        System.out.print("Ok, " + nome + ". seu sexo é " + sexo + ". Agora digite sua idade: ");
        idade = leia.nextInt();

        System.out.print("Certo, " + nome + ". Agora digite seu peso: ");
        peso = leia.nextDouble();

        System.out.print("Ok, " + nome + ". Você pesa " + peso +" Kgs. Agora digite a sua altura: ");
        altura = leia.nextDouble();
        
         IMC = peso / (altura * altura);

        System.out.println("Seu imc é de: " + IMC);
        if (IMC < 18.5) {
            System.out.println("Você tá maguinho, quer um ifood? ");
        } else if (IMC < 25){
            System.out.println("Você está esbelto, continue assim! ");
        }else if (IMC < 29.9){
            System.out.println("Você tá buchudo faça abdominais! ");
        } else if(IMC < 35){
            System.out.println("Você tá obesinho! ");
        } else if(IMC < 40){
            System.out.println("Você é obeso mas é moderado! ");
        } else if (IMC >= 40){
            System.out.println("Estou chamando um guindaste para você! ");
        }
        leia.close();
    }
}
