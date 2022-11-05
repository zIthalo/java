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
            
            System.out.print("Você está ficando tonto, quer continuar? [s/n] ");
            String confirma = leia.next();

            if (confirma == "s"){
                System.out.println("");
                System.out.println("Você se garante nos paranauê. ");
                System.out.println("");
                }else if (confirma == "n"){
                    System.out.println("");
                    System.out.println("");
                    cambalhota = 10;
                    System.out.println("Vá dormir. ");
                } else{
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Eu falei [s/n] digite uma opção válida. ");
                    System.out.println("");
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