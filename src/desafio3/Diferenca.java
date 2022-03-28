package desafio3;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[input.nextInt()];
        int alvo = input.nextInt();
        int numPares = 0;


        for(int i = 0; i < num.length; i++){
            num[i] = (i+1);
        }


        for(int i=0; i<num.length; i++) {

            for(int j=0; j<num.length; j++) {
                if((i - j) == alvo){
                    numPares++;
                }
            }
        }


        System.out.println(numPares);

    }

}
