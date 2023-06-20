public abstract class Funcionarios implements Custos {

    private String nome;
    private int cpf;
    private int registro;
    private double salario;
    private String lotacao;

    public Funcionarios (String nome, int cpf, int registro, Double salario, String lotacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salario = salario;
        this.lotacao = lotacao;

    }

    @Override
    public void reembolsoCustos (double valor) {

        System.out.println("O valor do seu reembolso é de "+ valor +" reais");
    }

    public void setNome (String nome) {

        this.nome = nome;
    }

    public void setCpf (int cpf) {

        this.cpf = cpf;
    }

    public void setRegistro (int registro) {

        this.registro = registro;
    }

    public void setLotacao (String lotacao) {

        this.lotacao = lotacao;
    }

    public void setSalario (Double salario) {

        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public String getLotacao() {
        return lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario (Double salario) {

        salario = this.salario * 1.10;

        System.out.println("Salário ajustado: " + salario + " reais");

    }





}
