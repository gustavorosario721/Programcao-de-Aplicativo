public class Professor extends Usuario
{
    private Disciplina disciplina;

    public Professor()
    {
    }

    public void setDisciplina(Disciplina disciplina) 
    {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() 
     {
        return disciplina;
    }

    public void cadastrarProfessor(String nome, String cpf, Disciplina disciplina)
    {
        setNome(cpf);
        setDisciplina(disciplina);
        setDisciplina(disciplina);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + getDisciplina());
    }
}