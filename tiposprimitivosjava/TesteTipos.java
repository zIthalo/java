package tiposprimitivosjava;



public class TesteTipos {
    public static void main(String[] args) {
        

        // int valor = 10; //Para um valor em string receber um dado numérico crie esta classe invólucro ↓↓↓
        // String dinheiro = Integer.toString(valor);

        // System.out.println(dinheiro);

        String dinheiro = "30";
        //Para um valor em string se tornar numérico faça isso ↓↓ Classe Integer.parseInt(variável) 
        int valor = Integer.parseInt(dinheiro);

        System.out.println("Resultado de String para Integer: " + valor);

        
        //De string para real
        String nota = "30";

        float resultado = Float.parseFloat(nota);

        System.out.println("Resultado de String para Float: "+ resultado);

        //de float para string
        float n1 = 3.5f;

        String res = Float.toString(n1);

        System.out.println("Resultado de float para string: " + res);

    }
}
