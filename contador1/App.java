package contador1;

import javax.swing.JOptionPane;

public class App{
    
public static void main(String[] args) {
   String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Pergunta", 3);
   while (nome == null) {
 nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Pergunta", 3);
      
   }
   JOptionPane.showMessageDialog(null, nome, "None" ,0);
        System.out.println(nome);
        System.err.println(nome);
}

}

