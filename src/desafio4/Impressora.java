package desafio4;

import java.util.Scanner;

public class Impressora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeFrases = input.nextInt();
        input.nextLine();
       for (int i = 0; i < quantidadeFrases; i++){

           String frase = input.nextLine();
           if (frase.length() <= 100 && frase.length() >= 2 ){
               ajeitaFrase(frase);
           }else{
               System.err.println("Digite uma frase entre 2 e 100.");
           }

       }
    }

    public static void ajeitaFrase(String frase){

        StringBuilder sb1 = new StringBuilder(frase.substring(0, frase.length() / 2));
        sb1.reverse();

        StringBuilder sb2 = new StringBuilder(frase.substring(frase.length() / 2));
        sb2.reverse();

        System.out.println( sb1.toString() + sb2.toString());
    }

}
