package Semana01.Exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1_10 {
    public static void main(String[] args) {

        String ctrl = "start";

        ArrayList<String> listaAlunos = new ArrayList<>();
        ArrayList<Double[]> listaNotas = new ArrayList<>();
        Double notas[] = new Double[3];

        while (!ctrl.equalsIgnoreCase("fim")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do aluno ou 'FIM' para finalizar: ");
            ctrl = sc.next();
            if(!ctrl.equalsIgnoreCase("fim")) {
                listaAlunos.add(ctrl);
                System.out.println("Digite a 1ª nota: ");
                notas[0] = Double.valueOf(sc.next());
                System.out.println("Digite a 2ª nota: ");
                notas[1] = Double.valueOf(sc.next());
                System.out.println("Digite a 3ª nota: ");
                notas[2] = Double.valueOf(sc.next());
                listaNotas.add(notas);
            }
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Aluno(a): " + listaAlunos.get(i));
            System.out.println("Notas: " + Arrays.toString(listaNotas.get(i)));
            Double totalNotas = 0.0;
            for (int posicaoNota = 0; posicaoNota < 3 ; posicaoNota++) {
                totalNotas =+ listaNotas.get(i)[posicaoNota];
            }
            double mediaAluno = totalNotas / listaNotas.get(i).length;
            System.out.println("Média = " + mediaAluno);
        }
    }
}
