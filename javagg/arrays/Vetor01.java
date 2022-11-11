package javagg.arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {20,2,50,33,99,1800,1600};
        System.out.println("O meu vetor tem " + n.length + " índices."); //como usar o n.length para fazer o laço aqui abaixo
       for (int c = 0; c <= n.length - 1; c++){ //Por que n.length -1? Isto porque meu c começa com 0 e meu n tem 7 índices. Se eu colocar sem o - 1 é o meu laço irá se repetir 8 vezes, ou seja, ele meio que iria mostrar 8 valores sendo que o 8º não existe, então para ele só me mostrar 7 índices eu coloquei n.length -1, eu também poderia resolver isso colocando ao invés de menor ou igual <= eu colocasse somente menor que <. veja no Vetor2.java
        
        System.out.println("Na posição " + c + " temos " + n[c] + " "); //mostre o meu vetor n na posição de c.
        
       }
    }
}
