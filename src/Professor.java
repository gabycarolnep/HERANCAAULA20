import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionarios {

    private String nivelGraduacao;
    private List <Diciplina> disciplinaMinistrada = new ArrayList<>();
    private List <Turma> turmas = new ArrayList<>();
    private List <Alunos> alunos = new ArrayList<>();

    public Professor(String nome, int cpf, int registro, Double salario, String lotacao) {

        super(nome, cpf, registro, salario, lotacao);
    }

    public void setAlunos (List <Alunos> alunos) {

        this.alunos = alunos;

    }
    public void setTurma (List <Turma> turma) {

        this.turmas = turma;

    }
    public List <Alunos> getAlunos() {

        return alunos;
    }
    public List <Turma> getTurma() {

        return turmas;
    }

    public String getNivelGraduacao() {

        return nivelGraduacao;
    }

    public List <Diciplina> getDisciplinaMinistrada() {

        return disciplinaMinistrada;
    }

    public void setNivelGraduacao (String nivelDeGraduacao) {

        this.nivelGraduacao = nivelDeGraduacao;

    }

    public void setDisciplinaMinistrada (List <Diciplina> disciplinaMinistrada) {

        this.disciplinaMinistrada = disciplinaMinistrada;

    }

}
