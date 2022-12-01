package revisao;

import java.util.Scanner;

public class SegundosQueFaltam {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println();
        System.out.print("Digite a hora atual: ");
        hora = sc.nextInt();
        int horaSeg = 3600;
        int midNight = 86400;
        hora *= horaSeg;
        int pMidNight = midNight - hora;
        
        System.out.println("Se passaram " + hora + " segundos desde as 0h para meia noite faltam "+ pMidNight+ " segundos");
        System.out.println();
        sc.close();
    }
}
// System.out.println();
// System.out.println("Digite a quantidade de segundos: ");
// segundo = sc.nextInt();

// hora = segundo / 3600;
// resto = segundo % 3600;
// minuto = resto/ 60;
// s = resto % 60;





/*
 * #include <stdio.h>
#include <stdlib.h>

int main() {
int segundos, h, m, s, resto;

printf("Digite uma quantidade de segundos: ");
scanf("%d", &segundos);

h = segundos / 3600;
resto = segundos % 3600;
m = resto / 60;
s = resto % 60;
printf("%d:%d:%d\n", h, m, s);

return 0;
}
 */



