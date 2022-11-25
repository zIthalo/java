package whileete;
/* A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
 */
public class ex004 {
    public static void main(String[] args) {
        int ult = 1;
        int penult = 1;
        System.out.println(ult + " " + penult);
        int termo = 0;

        while (termo < 500){
            termo = ult + penult;
            penult = ult;
            ult = termo;
            if (termo < 500){
                System.out.println(termo);
            }else{
                System.out.println("O próximo valor será maior que 500");
            }
        }
    }
}
