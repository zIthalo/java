package revisao;
import java.util.Scanner; 

public class ConvidadosArray {

    public static void main(String[] args) {

        String[] convidados;

        int totalConvidados=0;

        convidados = new String[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa lista de convidados");

        System.out.print("Quantos nomes deseja colocar na lista?(maximo 100): ");

        totalConvidados = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalConvidados; i++) {

            System.out.print("Informe o nome do "+(i+1)+" convidado: ");

            convidados[i] = sc.nextLine();

        }

        System.out.println("Lista de convidados");

        for (int i = 0; i < totalConvidados; i++) {

            System.out.println(convidados[i]);

        }
        sc.close();

    }

}
    
