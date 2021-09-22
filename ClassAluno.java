package javaapplication1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Aluno {

    private String nome;
    private Double media;
    ArrayList<Aluno> alunos = new ArrayList();

    public Aluno(String nome, Double media) {
        this.nome = nome;
        this.media = media;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
            return nome;
        }
    public Double getMedia() {
        return media;
    }
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void setMedia(Double media) {
           this.media = media;
       }
    public void mostrarMedia() {

        for (Aluno aluno : alunos) {
            System.out.println("O aluno " + aluno.getNome() + " ficou com média " + aluno.getMedia() + "!");
        }
    }

}
