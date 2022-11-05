//-------------- ESTRUTURA DE REPETIÇÃO COM BREAK------------
package javagg.repeticaowhile;

import java.util.Scanner;


public class While {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int cambalhota = 0;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        while (cambalhota < 10){
            ++cambalhota;
            
            System.out.println("Cambalhota: " + cambalhota);
        
                System.out.print("Ficou tonto? Quer continuar? [s/n] ");
                String confirma = leia.next();
            
                if(confirma.equals("s")){
                    
                System.out.println("");
                System.out.println("");

                System.out.println("Você se garante nos paranauê. ");

                System.out.println("");
                System.out.println("");
                }else if (confirma.equals("n")){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Vá dormir. ");
                    break;
                } else{
                    System.out.println("");
                    System.out.println("");
                    
                    System.out.println("Eu falei [s/n] digite uma opção válida. ");

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    cambalhota--;
                    //A minha intenção aqui era criar um programa que além de contar a cambalhota, perguntar também se o usuário gostaria de continuar antes no if e no else if eu estava usando assim if (confirma == "s") e no else if (confirma == "n") mas tava dando errado então eu aprendi que para esses casos ao invés de utilizar o exemplo acima o correto é fazer isso: ex if (confirma.equals("s")) e else if(confirma.equals("n")) só assim o programa fez o que eu queria. Mas no meu else se eu digitasse qualquer tecla mesmo assim a contagem continuava, e para bloquear a contagem eu utilizei o decremento cambalhota--;
                }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("");
}
}





//---------- ESTRUTURA DE REPETIÇÃO WHILE COM CONTINUE ----------
// package javagg.repeticaowhile;

// import java.util.Scanner;
// public class While {
//     public static void main(String[] args) {
//         Scanner leia = new Scanner(System.in);
//         int cambalhota = 0;
//         while (cambalhota < 10){
//             ++cambalhota;
//             if (cambalhota == 5 || cambalhota == 7 || cambalhota == 9){
//                 continue; //Este continue serve para esconder estes números contados aí em cima, ou seja, na minha saída de código não vai aparecer estes números que eu coloquei no if do continue.
//             }
//             System.out.println("Cambalhota: " + cambalhota);
//     }
// }
// }