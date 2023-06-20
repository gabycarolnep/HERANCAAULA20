public class Diciplina {

    private String nome;
    private Professor professor;

    public String getNome() {

        return nome;
    }

    public Diciplina (String nome){

        this.nome = nome;

    }
    public Diciplina (String nome, Professor professor) {
        super();
        this.professor = professor;
    }

    public void setNome (String nome) {

        this.nome = nome;
    }
    public void setProfessor(Professor professor) {

        this.professor = professor;
    }
    public Professor getProfessor() {

        return professor;
    }

}
