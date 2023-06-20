import java.util.List;

public class Turma {

    private String nome;
    private List <Alunos> alunos;
    private List <Professor> professores;
    private List <Diciplina> disciplinas;

    public Turma (String nome) {

        this.nome = nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAlunos (List <Alunos> alunos) {

        this.alunos = alunos;
    }
    public void setProfessores (List <Professor> professores) {

        this.professores = professores;
    }

    public void setDisciplinas (List <Diciplina> disciplinas) {

        this.disciplinas = disciplinas;
    }
    public String getNome() {

        return nome;
    }

    public List <Professor> getProfessores() {

        return professores;
    }

    public List <Alunos> getAlunos() {

        return alunos;
    }

    public List <Diciplina> getDisciplinas() {

        return disciplinas;
    }

}
