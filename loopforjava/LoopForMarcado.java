package loopforjava;
// Loop For Marcado: Rode o código abaixo no seu console e veja como ele se comporta:
public class LoopForMarcado {
    public static void main(String[] args) {
        xx:
            for(int i = 1; i<=3; i++){
                yy:
                    for(int j = 1; j<=3; j++){
                        if (i == 2 && j == 2 ){
                        break xx;
                    }
                        System.out.println( i + "_" + j);
                    }
            }
    }
}
