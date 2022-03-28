package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        int qntNumeros = input.nextInt();
        for(int i = 0; i <qntNumeros; i++){

            int numero = input.nextInt();

            if(numero % 2 == 0 && numero > 0){
               listaPares.add(numero);
            }else {
                listaImpares.add(numero);
            }
        }

        Collections.sort(listaPares);
        listaImpares.sort(Collections.reverseOrder());

        for (int teste : listaPares){
            System.out.println(teste);

        }
        for (int impar : listaImpares){
            System.out.println(impar);
        }

    }

}
