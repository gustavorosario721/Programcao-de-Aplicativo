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
        return disciplina.diminuirCaixa();
    }

    public void cadastrarProfessor(Strimg nome, String cpf, Disciplina disciplina)
    {
        setNome(cpf);

        if (cpfFormatoValido(cpf))
            setCpf();
        else
            System.out.println("Formato de cpf invalido! Insira o no formato 000.000.000-00");
    
        setDisciplina(disciplina);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + getDisciplina());
    }
}