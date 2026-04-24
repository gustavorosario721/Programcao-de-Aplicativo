public class Aluno extends Usuario 
{
    private String matricula;
    
    public Aluno()
    {
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public String getMatricula() 
    {
        return matricula;
    }

    public void cadastrarAluno(String nome, String cpf, String matricula)
    {
        setNome(nome);
        setCpf(cpf);
        setMatricula(matricula);
    }

    @Override
    public void exibirDados() 
    {
        super.exibirDados();
        System.out.println("Matricula: " + getMatricula());
    }
}