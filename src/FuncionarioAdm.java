public class FuncionarioAdm extends Funcionarios {

    private String senioridade;
    private String funcaoAdministrativa;

    public FuncionarioAdm (String nome, int cpf, int registro, Double salario, String lotacao) {

        super(nome, cpf, registro, salario, lotacao);

    }
    public FuncionarioAdm (String nome, int cpf, int registro, Double salario, String lotacao, String senioridade, String funcaoAdministrativa) {

        super(nome, cpf, registro, salario, lotacao);

        this.senioridade = senioridade;
        this.funcaoAdministrativa = funcaoAdministrativa;

    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {

        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public void setSenioridade(String senioridade) {

        this.senioridade = senioridade;
    }
    public String getFuncaoAdministrativa() {

        return funcaoAdministrativa;
    }

    public String getSenioridade() {

        return senioridade;
    }

}
