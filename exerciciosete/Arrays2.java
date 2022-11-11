package exerciciosete;
/*
  Verificando o tamanho de uma array.  Execute o código no seu console/programa analisando sua estrutura e evidenciando seu resultado.
 */
public class Arrays2 {
    public static void main(String[] args) {
        int arrayUm[] = {12,3,5,68,9,6,73,44,456,65,321};
        int arrayDois[] = {43,42,4,8,55,21,2,45};

        if (arrayDois.length > 8){
            System.out.println("Tamanho do Array Dois - Maior que 8!");
        }else {
            System.out.println("Tamanho do Array Dois - menor que 8!");
        }
        System.out.println("\nTamanho do array Um = " + arrayUm.length);
    }
}
