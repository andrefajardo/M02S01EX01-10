package Semana01.Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
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
        listaAlunos.forEach(System.out::println);
    }
}