package revisao;

import java.util.Scanner;
public class DeRealParaDolar {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    double dolar = 0, real=0, cambio=1;
        System.out.println();
    System.out.print("Informe o valor da cotação do dólar");
    cambio = teclado.nextDouble();

    System.out.print("Quantos dólares para converter para reais?");
    dolar = teclado.nextDouble();
    
    System.out.format("%6.2f dólares convertidos a taxa de %6.2f reais por dólar dá %6.2f reais\n", dolar, cambio, dolar*cambio);
    teclado.close();
    
  }
}
    

