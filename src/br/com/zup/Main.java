package br.com.zup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Coordenadores coordenador1 = new Coordenadores("joao", "123", 123, "123", 123);
        Professores professor1 = new Professores("yan", "123", 123, "abc", 90, "doutorado", "matematica", 1);
        Professores professor2 = new Professores("yanz", "123", 123, "abc", 90, "doutorado", "matematica", 1);
        Professores professor3 = new Professores("yanx", "123", 123, "abc", 90, "doutorado", "matematica", 1);
        Turma turma1 = new Turma(12, 5);
        Turma turma2 = new Turma(10, 4);

        professor1.adicionarTurma(turma1);
        professor1.adicionarAlunos(turma1);
        System.out.println(professor1.quantidadeAlunos());
        professor1.adicionarTurma(turma2);
        professor1.adicionarAlunos(turma2);
        System.out.println(professor1.quantidadeAlunos());
        System.out.println(professor1.getNome());

        coordenador1.adicionarProfessores(professor1);
        coordenador1.exibirProfessores();
        coordenador1.adicionarProfessores(professor2);
        coordenador1.exibirProfessores();
        coordenador1.adicionarProfessores(professor3);
        coordenador1.exibirProfessores();


    }
}
