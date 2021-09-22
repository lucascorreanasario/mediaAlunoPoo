package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomeAlunos = new ArrayList<>();
        ArrayList<Double> mediaAlunos = new ArrayList<>();

        System.out.println("Digite a quantidade de alunos:");
        int qtAlunos = sc.nextInt();
        System.out.println("Digite a quantidade de notas:");
        int qtNota = sc.nextInt();

        double nota;
        for (int i = 0; i < qtAlunos; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome1 = sc.next();
            nomeAlunos.add(nome1);
            double soma = 0;
            for (int l = 0; l < qtNota; l++) {
                System.out.println("Digite a *" + (i + 1) + " nota:");
                nota = sc.nextDouble();
                soma = soma + nota;
            }
            double media = soma / qtNota;
            mediaAlunos.add(media);
        }
        for (int i = 0; i < mediaAlunos.size(); i++) {
            String nome = nomeAlunos.get(i);
            Double media = mediaAlunos.get(i);
            Aluno alunos = new Aluno(nome, media);
            alunos.mostrarMedia();
            alunos.addAluno(alunos);
        }

        sc.close();
    }
}
