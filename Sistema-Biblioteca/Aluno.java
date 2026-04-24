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

    public boolean matriculaFormatoValido(String matricula)
    {
        if (matricula.matches("\\d{5}"))
            return true;
        else
            return false;
    }

    public void cadastrarAluno(String nome, String cpf, String matricula)
    {
        setNome(nome);

        if (cpfFormatoValido(cpf))
            setCpf();
        else
            System.out.println("Formato de cpf invalido! Insira o no formato 000.000.000-00");
        
        if (matriculaFormatoValido(matricula))
            setMatricula(matricula);
        else
            System.out.println("Formato de matricula invalido! Insira a no formato 00000");
    }

    @Override
    public void exibirDados() 
    {
        super.exibirDados();
        System.out.println("Matricula: " + getMatricula());
    }
}