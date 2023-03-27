import java.util.Scanner;

public class Nota0e10{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota = -1.0;
        
        while (nota < 0 || nota > 10) {
            System.out.println("");

            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = leia.nextDouble();
            
            System.out.println("");
            
            if (nota < 0 || nota > 10) {
                System.out.println("");
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
                System.out.println("");
            }
        }
        
        System.out.println("A nota informada foi " + nota);
        
        leia.close();
    }
}











// float n1;
// System.out.println("");
// System.out.print("Digite a nota do aluno: ");
// n1 = leia.nextFloat();

// while(n1 > 10 && n1 < 0){
//     if (n1 >= 0 && n1 <= 10 ) {
//         System.out.println("Valor válido");
        
//     } 
   
//     if(n1 > 10 && n1 < 0){
//         System.out.println("Valor inválido digite novamente");
//         break;
//     } 
// }
// leia.close();