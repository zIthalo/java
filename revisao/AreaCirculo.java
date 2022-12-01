package revisao;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double area = 3.14, raio = 0;

        System.out.print("Digite o valor do raio da circunferência: ");
        raio = leia.nextFloat();

        area = 3.14 * (raio * raio);

        System.out.println("A área total da circunferência é " + area);
        leia.close();
    }
}
