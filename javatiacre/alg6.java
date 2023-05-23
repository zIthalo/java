import java.util.Scanner;

public class alg6{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        int num[] = new int[6];
    
        for (int i = 0; i < num.length; i++) {
            
            System.out.print("Posição " + 1 + "digite o número");
            num[i] = leia.nextInt();
        }

       
    }
}