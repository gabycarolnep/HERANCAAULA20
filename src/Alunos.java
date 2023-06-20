public class Alunos {

    private String nome;
    private int cpf;

    public Alunos (String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCpf (int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

}
