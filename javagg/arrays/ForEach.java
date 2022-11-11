package javagg.arrays;

import java.util.Arrays;

/*Nesta aula aqui eu aprendi como usar o for each, este for each é exclusivo para ser usado com arrays. Entendendo a sintaxe do for each:
    Como identificar um for each? 
Um for each (para cada) sempre terá essa aparência: 
    for (int variavel: nomeDoVetor){}

Como o que fará este for each? E como montar?
primeiro eu tenho que criar o meu vetor por exemplo ↓:

    int num[] = {3,5,1,8,4};

depois o meu for each ↓:

for (int valor: num){
    //se lê: para cada valor contido no meu array num crie uma variável com nome de valor, que irá receber o valor de cada índice no laço de repetição

    //depois de ter feito isso a cada vez que for feita a iteração do laço a minha variável valor receberá um valor do índice do array ex:

    //int valor = 3, foi feito o laço valor = 5, foi feito o laço valor = 1, foi feito o laço valor = 8, foi feito o laço valor = 4

    //Quantas vezes essa repetição será feita?
    //Isso irá depender do tamanho do meu array, se ele tiver 5 índices será repetido 5 vezes se tiver 100, cem vezes será repetido.
}
OBS: Eu tenho que criar a minha variável de repetição do mesmo tipo primitivo do meu array.
*/
public class ForEach {
    public static void main(String[] args) {
        int num[]= {3,5,1,8,4};
        //Como colocar este vetor em ordem numérica? usando o Arrays.sort(nome do vetor aqui)
        Arrays.sort(num);
        for(int valor: num){
            System.out.println(valor);
            //para cada valor de num coloque na variável valor
        }
        //Como procurar um valor dentro de um array? Usando o arrays.binarysearch(nome do vetor, posição/índice que eu quero saber o valor no vetor) 

        int n[] = {5,6,9,7,8,14};
        
        int p = Arrays.binarySearch(n, 14);
        //O que o Arrays.binarySearch() faz? Ele serve para você colocar o vetor que você quer pesquisar e depois da vírgula voce vai colocar o número ou nome que você quer escolher.  Lembre-se que você tem que criar uma variável para utilizar isso, essa variável mostrará o índice que o Arrays.binarySearch() encontrou o valor. Confira abaixo ↓↓↓
        for (int i : n) {
            System.out.println(i + "  ");
        }
        //Utilizei o for each para mostrar o meu vetor e seus valores. 
        System.out.println("Eu encontrei o valor no índice " + p);
        //Se o valor aparecer negativo este índice não existe, ou seja o numero que você quer não existe no array.

        /* Como eu posso preencher meu array de, por exemplo 10 posições com um único valor sem precisar ficar declarando passo por passo assim por exeplo:
        
        int vet[] = int[3];
        vet[0] = 1;
        vet[1] = 1;
        vet[2] = 1;
        
        ou assim:
        int vet[] = {1,1,1};

        ao invés disso eu posso fazer assim:
        int vet = new int[10];
        Arrays.fill(vet, 8); //preencha os índices do meu vetor com o valor 8
        */ 

        int vet[] = new int[10];
        Arrays.fill(vet, 8);

        for (int j : vet) {
            System.out.println(j);
        }
        
      
    }
}
