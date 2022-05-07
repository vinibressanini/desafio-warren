package questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int limite, horarioChegada, ausentes = 0;
        String frase = "Aula normal";
        ArrayList<Integer> tempoChegada = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        // Coleta os horários de chaegada

        do {

            System.out.println("Informe o horário de chegada (Informe 9999 para encerrar): ");

            horarioChegada = scn.nextInt();

            if (horarioChegada != 9999) {

                tempoChegada.add(horarioChegada);

            }

        } while (horarioChegada != 9999);

        System.out.println("Informe o limite de alunos presentes: ");

        limite = scn.nextInt();

        // Faz a checagem de alunos ausentes

        for (int i : tempoChegada) {

            if (i > 0) {
                ausentes++;
            }

        }

        // Verifica se a aula irá ser cancelada

        if (ausentes > limite) {
            frase = "Aula cancelada";
            System.out.println(frase);
        } else {
            System.out.println(frase);
        }

    }

}
