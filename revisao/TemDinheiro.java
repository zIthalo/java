package revisao;

import java.util.Scanner;

/*
 * Crie um programa que valide se o usuário poderá comprar um produto informado, isto é, se ele possui dinheiro suficiente para comprar os produtos. O usuário deverá informar seu nome, quanto possui de dinheiro, o nome do produto, o valor do produto e a quantidade do mesmo. Crie uma saída de dados que utilize todos os dados informados.
 */
public class TemDinheiro{
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        String usuario;
        double dindin;
        float notebook = 3000;
        float PC = 5000;
        String genero;
        System.out.println("--------------------------------------------");
        System.out.println("Lojão do Jão");
        System.out.println("--------------------------------------------");
        System.out.println();
   
        System.out.print("Digite seu nome: ");
        usuario = leia.nextLine();

        System.out.println("--------------------------------------------");
        System.out.println("Olá, " + usuario + "!");
        System.out.println("--------------------------------------------");

        System.out.print("Quanto você tem em dinheiro?");
        dindin = leia.nextDouble();

        System.out.println("Saldo: " + dindin);

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("TABELA DE PRODUTOS");
        System.out.println("--------------------------------------------");

       System.out.println("Notebook R$" + notebook);
       System.out.println("--------------------------------------------");
       
       System.out.println("PC R$"+ PC);
       System.out.println("--------------------------------------------");


       System.out.println();
       System.out.println("Qual desses produtos você deseja? 1 = Notebook 2 = PC");
       System.out.println();
       int escolha = leia.nextInt();
       int quantidade = 1;
       String res = "n";
       int ok;
       for (ok = escolha; ok == 1 || ok == 2 && res.equals("s"); ++quantidade ){
        
       if (escolha == 1 && dindin >= notebook){

        System.out.println("Você escolheu " + quantidade + " notebook(s) das galáxias");

       } else if(escolha == 2 && dindin >= PC){

        System.out.println("Você escolheu" + quantidade + "PC(s) das galáxias");

            
        } else if (escolha > 2 || escolha < 1){
            
            System.out.println("Escolha uma opção válida: ");
        
        } else if (dindin < PC || dindin < notebook){

        System.out.println("[ERRO] Você se encontra liso para esta opção. Quer adicionar mais dinheiro? ");
        String res1;
        res1 = leia.next();

        if (res1.equals("s")){
            double adc;
            System.out.println("Digite a quantidade que você irá adicionar: ");
            adc = leia.nextDouble();
        }
        } 
        System.out.print("Quer continuar? [s/n] "); 
        res = leia.next(); 
    }

    //    do{ 
    // }while (res.equals("s"));

    System.out.println("Obrigado pela compra " + usuario);
    if(escolha == 1){
        System.out.println("Você comprou " + quantidade + " Notebook(s).");
    }
    if(escolha == 2){
        System.out.println("Você comprou " + quantidade + " PC(s).");
    }
    }
}