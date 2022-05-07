package questoes;

import java.util.ArrayList;

public class Questao1 {

    private static int inverteNumero (int num) {

        int invertido = 0;

        while (num != 0) {

            int digit = num % 10;
            invertido = invertido * 10 + digit;

            num /= 10;
        }

        return invertido;
    }

        public static void main(String[] args) {

        ArrayList<Integer> reversiveis = new ArrayList<>();

        for ( int i = 1; i <= 1000000; i++) {

           String verificadorN = Integer.toString(i);
           int result = i + inverteNumero(i);

           if ( !verificadorN.endsWith("0") && result % 2 != 0 && result <= 1000000){

                   reversiveis.add(i);

               }

        }

            System.out.println(reversiveis);
            System.out.println("\n Total de Números Reversíveis: " + reversiveis.size());

        }


}




