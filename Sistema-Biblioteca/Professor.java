public class Professor extends Usuario
{
    private Disciplina disciplina;
    public static final byte MAX_LIVROS = 5;
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
        setNome(nome);
        setCpf(cpf);
        setDisciplina(disciplina);
    }

    public static byte getMaxLivros() 
    {
        return MAX_LIVROS;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina.nomeFormatado());
    }
}