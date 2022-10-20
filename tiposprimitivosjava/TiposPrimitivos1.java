package tiposprimitivosjava;

public class TiposPrimitivos1 {
    public static void main(String[] args) {
        String nome = "Ithalo"; //como utilizar o print format para strings e números reais tudo junto? ↓↓
        float nota = 8.5f; //Este f no final é para declarar como float
        float n2 = 9.5f;
        
        System.out.println("A nota é: " + nota);
        //Aprendendo a usar o System.out.printf("Sua nota é %.2f", nota) (é chamado de print formatado)
        System.out.printf("A segunda nota é %.2f \n", n2);
        //Este %f significa float. Se você quiser formata-lo para ter duas casas decimais você declara assim %.2f e assim por diante e para fazer quebrar linha você utiliza \n após o %f

        System.out.printf("A segunda nota de %s é de %.1f \n ", nome, nota);
        //Se esquecer volte aqui. Para entender essas declarações você só precisa se ligar que toda vez que tiver um %s 'string', %.1f 'float', isso significa que eu estou chamando uma variável e falando o tipo dela

        //A mesma coisa do printf

        System.out.format("A primeira nota de %s é %.1f ", nome, nota );
    }

}
/* Família Tipo Primitivo Classe invólucro Tamanho Exemplo (as infos abaixo seguem esta ordem)

    Lógico- boolean Boolean 1 bit(0falso 1verdadeiro) true;

    Literais- char Character 1 byte 'A'(este comando só aceita uma letra)
    -------------- String 1 byte/cada "JAVA" (Esta classe invólucro aceita textos)

    inteiros- byte Byte 1 byte 127 (127 é o valor máximo)
    short Short 2 bytes 32 767 (32 767 é valor máximo)
    int Integer 4 bytes 2 147 483 (max value ←)
    long Long 8 bytes 263 (2elevado a 63 um número gigante)

    Reais- float Float 4 bytes 3.4e+38
    double Double 8 bytes 1.8e+308
     * 
     * 
     */

     /*_______________________Declarando variáveis 
     _______________________Inteiras ↓↓

     int idade = 3;
     
     int idade = (int) 3;

     (wrapper class ↓↓↓ que é a mesma coisa de envelopar, fazer um invólucro ↓↓↓)
     Integer idade = new Integer(3); Aqui também se declara uma variável mas desse jeito ela vira umm objeto

     //!! Imporante !!- Sempre que você ver a palavra 'new' dentro de uma declaração esse 'new' está criando um objeto
      
     _______________________Reais_______________________
    float sal = 1825.54f; //Não esquecer do 'f'

    float sal = (float) 1825.54;// Se quiser declarar sem o f hehe

    Float sal = new Float(1825.54);

    _______________________Caractere único_______________________
    char letra ='G';
    
    char letra = (char) 'G';

    Character letra = new Character('G');

    _______________________Verdadeiro ou falso_______________________

    boolean casado = false;

    boolean casado = (boolean) false;

    Boolean casado = new Boolean(false);

_______________________Textos_______________________
String nome = "ithalo";


Como colocar dados em java (comando leia) veja isso na outra classe criada ComandoLeia.java
      */