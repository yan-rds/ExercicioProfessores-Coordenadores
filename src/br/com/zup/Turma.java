package br.com.zup;

public class Turma {
    private int quantidadeAlunos;
    private int serie;

    public Turma() {
    }

    public Turma(int quantidadeAlunos, int serie) {
        this.quantidadeAlunos = quantidadeAlunos;
        this.serie = serie;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
