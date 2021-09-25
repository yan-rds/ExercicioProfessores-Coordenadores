package br.com.zup;

public class FuncionariosAdministrativos extends Funcionarios{
    private String funcaoAdiminstrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdiminstrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdiminstrativa = funcaoAdiminstrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdiminstrativa() {
        return funcaoAdiminstrativa;
    }

    public void setFuncaoAdiminstrativa(String funcaoAdiminstrativa) {
        this.funcaoAdiminstrativa = funcaoAdiminstrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
