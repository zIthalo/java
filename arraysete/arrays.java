package arraysete;

public class arrays {
    public static void main(String[] args) {
        String [] nomes = {"Trevor","Lol","Jão"};
        //Um array pode ser declarado sem valores, mas não pode ser declarado sem posições então crie seu array assim usando a expressão new ↓↓ ex. citado carros
        String[] carros = new String[4];
        /*Existem arrays unidimensionais estilo vetores e multidimensionais estilo matrizes os meus arrays carros e nomes são arrays do tipo unidimensionais, neste caso só possui uma linha*/
        System.out.println(nomes[2]); //imprimindo o conteúdo da array nomes na 2º posição

        /*Para declarar uma array multidimensional use a sintaxe ↓*/
        int[][] array_multidimensão = new int[5][5];
        /*Aqui temos um array de 5 linhas e 5 colunas */

        /*Revisando******

        * Definir arrays em Java é a mesma coisa que realizar a
        declaração de variáveis. Podemos declarar um array de uma
        única dimensão — ou vetor, como também é chamado — das
        seguintes formas:

        tipo do dado nomeDoArray [opcional: quantidade de
        elementos];

        tipo do dado nomeDoArray {elementos separados por
        vírgula};

        tipo do dado [opcional: quantidade de elementos]
        nomeDoArray;
         * int[] r = new int[44], k = new int[23];
         * 
         */
        //Também posso declarar mais de um array po linha
        //int r[] = new int[44], k = new int[23];

        // Colocando os valores na array
        int[] inicia_Valores = {2,52,504,7,88,9,6,14,656};

        //Definindo 9 posições para nossos números e inicializando cada elemento:
        // array_exemplo_N_inteiro = new int[9];
        // array_exemplo_N_inteiro [0] = 100;
        // array_exemplo_N_inteiro [1] = 85;
        // array_exemplo_N_inteiro [2] = 88;
        // array_exemplo_N_inteiro [3] = 93;
        // array_exemplo_N_inteiro [4] = 123;
        // array_exemplo_N_inteiro [5] = 952;
        // array_exemplo_N_inteiro [6] = 344;
        // array_exemplo_N_inteiro [7] = 233;
        // array_exemplo_N_inteiro [8] = 622;
    }
}
