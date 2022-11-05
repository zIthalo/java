package javagg.repeticaowhile;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        for(int i = 0; i <= 15; i+=2){
            if(i%3 ==0) continue;
            System.out.println(i);
        }
    }
}
