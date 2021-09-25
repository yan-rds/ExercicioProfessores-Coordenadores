package br.com.zup;

public class Professores extends Funcionarios {
    private String nivelDeGraduacao;
    private String disciplinaMestrada;
    private int quantidadeDeTurmas;
    private int quantidadeDeAlunos;
    public Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Professores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMestrada, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMestrada = disciplinaMestrada;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMestrada() {
        return disciplinaMestrada;
    }

    public void setDisciplinaMestrada(String disciplinaMestrada) {
        this.disciplinaMestrada = disciplinaMestrada;
    }


    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public void adicionarAlunos(Turma turma){
        quantidadeDeAlunos = quantidadeDeAlunos + turma.getQuantidadeAlunos();

    }

    public String quantidadeAlunos(){
    return "Quantidade de alunos: " + quantidadeDeAlunos;

    }

    public void adicionarTurma(Turma turmaAdicionada){
        turma = turmaAdicionada;
    }


}
