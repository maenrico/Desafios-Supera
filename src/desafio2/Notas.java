package desafio2;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

       // double valor = input.nextDouble();

        double valor = input.nextDouble();



        int notas = (int) valor; //remove os pontos flutuantes
        int moedas = (int) ((valor - notas) * 100); //pega os pontos flutuantes


        int valor100 = notas / 100;

        notas -= valor100 * 100;

        int valor50 = notas / 50;
        notas -= valor50 * 50;





        int valor20 = notas / 20;
        notas -= valor20 * 20;

        int valor10 = notas / 10;
        notas -= valor10 * 10;

        int valor5 = notas / 5;
        notas -= valor5 * 5;

        int valor2 = notas / 2;
        notas -= valor2 * 2;

        int moedas1 = notas;
        moedas -= moedas1;

        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;

        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;

        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;

        int moedas5 = moedas / 5;
        moedas -= moedas5 * 5;

        int moedas01 = moedas;

        System.out.println("NOTAS:");
        System.out.println(valor100 +"\t" + " nota(s) \tde\t R$ 100.00");
        System.out.println(valor50 + "\t" +" nota(s) \tde\t R$ 50.00");
        System.out.println(valor20 +"\t" + " nota(s) \td\t R$ 20.00");
        System.out.println(valor10 +"\t" + " nota(s) \tde\t R$ 10.00");
        System.out.println(valor5 + "\t" +" nota(s) \tde\t R$ 5.00");
        System.out.println(valor2 +"\t" + " nota(s) \tde\t R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + "\t" +" moeda(s) \tde\t R$ 1.00");
        System.out.println(moedas50 + "\t" +" moeda(s) \tde\t R$ 0.50");
        System.out.println(moedas25 +"\t" + " moeda(s) \tde\t R$ 0.25");
        System.out.println(moedas10 + "\t" +" moeda(s) \tde\t R$ 0.10");
        System.out.println(moedas5 + "\t" + " moeda(s) \tde\t R$ 0.05");
        System.out.println(moedas1 + " moeda(s) de R$ 0.01");
    }


    }




