package exerciciosete;
/*
 Inicialização sem valor array.   Execute o código no seu console/programa analisando sua estrutura e evidenciando seu resultado.

 */

public class Arrays3 {
    public static void main(String[] args) {

    //array com 10 elementos
    int arrayBase[] = new int[20];
    System.out.printf("%s %10s \n", "Index", "Valores");

    //gera a saída do valor de cada elemento do array
    for (int i = 0; i < arrayBase.length; i++) {
        System.out.printf("%3d %10d \n", i, arrayBase[i]);
    }
  }
}
