package tiposprimitivosjava;
//Como colocar dados em java (comando leia)?
//↓1ºFaça este import
import java.util.Scanner; 

public class ComandoLeia {
    
    public static void main(String[] args) {
        try (//2º Depois declare esta classe, dê um nome coerente a ela e crie um objeto Scanner(System.in) ↓↓
        Scanner leia = new Scanner(System.in)) {
            String nome;

            System.out.println("Digite seu nome: " );
            //Traduzindo leia nome↓↓↓
            nome = leia.nextLine();
            //Nome recebe o nome do scanner.nextLine() para strings
            System.out.println("O nome digitado foi: " + nome);
   
            float nota;
            System.out.println("Digite a nota: ");
            
            nota = leia.nextFloat();
            
            System.out.println("A nota digitada foi: " + nota);

            if (nota >= 6) {
                System.out.format("Aluno %s APROVADO!! ", nome);
            } else {
                System.out.printf("Aluno %s REPROVADO!!", nome);
            }
        }

    }
}
