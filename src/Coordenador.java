import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {

    private List<Professor> professoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, int cpf, int registro, Double salario, String lotacao) {

        super(nome, cpf, registro, salario, lotacao);
    }

    public Coordenador(String nome, int cpf, int registro, Double salario, String lotacao, List<Professor> professoresSupervisionados) {

        super(nome, cpf, registro, salario, lotacao);

        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {

        this.professoresSupervisionados = professoresSupervisionados;
    }

    public List<Professor> getProfessoresSupervisionados() {

        return professoresSupervisionados;
    }

    @Override

    public void aumentaSalario (Double salario) {

        salario = salario * 1.05;
        System.out.println("Seu salário ajustado é: " + salario);

    }
}
