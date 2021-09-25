package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{
        Professores vetor [] = new Professores[2];

    public Coordenadores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    public Professores[] getVetor() {
        return vetor;
    }

    public void setVetor(Professores[] vetor) {
        this.vetor = vetor;
    }

    @Override
    public double aumentaSalario (){
        return getSalario() * 1.05;
    }

    public void adicionarProfessores (Professores professorAdicionado){
        if (vetor[1] != null){
            System.out.println("Numero máximo de professores atingidos, professor " + professorAdicionado.getNome() + " não adicionado.");
        }
        else {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == null) {
                    vetor[i] = professorAdicionado;
                    System.out.println("Professor " + professorAdicionado.getNome() + " adicionado");
                    i = 2;
                }

            }
        }
    }

    public void exibirProfessores(){
        System.out.println("Lista de professores:");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] != null) {
                System.out.println(vetor[i].getNome());
            }

        }
    }




}
