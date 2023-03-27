import java.util.Scanner;
public class MsgError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro");
        System.out.print("Digite o nome de usuário: ");
        String user = input.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = input.nextLine();
        
        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNasc = input.nextLine();
        
        if (senha.equals(user) || senha.equals(dataNasc)) {
            System.out.println("A senha não pode ser igual ao nome de usuário ou à data de nascimento.");
        } else {
            System.out.println("Usuário e senha cadastrados com sucesso!");
        }
        
        input.close();
    
    }
}

// Scanner leia = new Scanner(System.in);

// String nome;
// String nasc;
// String senha;

// System.out.println("");

// System.out.print("Digite seu nome: ");
// nome = leia.next();
// System.out.println("");
// System.out.print("Digite a data de seu nascimento: ");
// nasc = leia.next();
// System.out.println("");
// System.out.print("Digite sua senha: ");
// senha = leia.next();

// if (senha == nome || senha == nasc) {
//     System.out.println("Sua senha não pode ser igual ao seu nome..");
// } else {
//     System.out.println("Acesso liberado");
// }