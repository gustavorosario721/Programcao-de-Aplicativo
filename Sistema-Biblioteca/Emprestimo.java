public class Emprestimo
{
    private static int contador = 1;
    private int id;
    private String cpf;
    private Livro livro;
    private int qtdEmprestado;
    private String dataEmprestimo;
    private boolean ativo = true;
    private String dataDevolucao;


    public Emprestimo()
    {
        this.id = contador++;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getId() 
    {
        return id;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setLivro(Livro livro) 
    {
        this.livro = livro;
    }

    public Livro getLivro() 
    {
        return livro;
    }

    public void setQtdEmprestado(int qtdEmprestado) 
    {
        this.qtdEmprestado = qtdEmprestado;
    }

    public int getQtdEmprestado() 
    {
        return qtdEmprestado;
    }

    public void setDataEmprestimo(String dataEmprestimo)
    {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataEmprestimo() 
    {
        return dataEmprestimo;
    }

    public void setAtivo(boolean ativo) 
    {
        this.ativo = ativo;
    }

    public boolean getAtivo()
    {
        return ativo;
    }

    public void setDataDevolucao(String dataDevolucao)
    {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataDevolucao()
    {
        return dataDevolucao;
    }

    public void pegarLivro(String cpf, Livro livro, int qtdEmprestado, String dataEmprestimo)
    {
        setCpf(cpf);
        setLivro(livro);
        setQtdEmprestado(qtdEmprestado);
        setDataEmprestimo(dataEmprestimo);
        livro.emprestarLivro(qtdEmprestado);
    }

    public void devolverLivro(String dataDevolucao)
    {
        setDataDevolucao(dataDevolucao);
        setAtivo(false);
        livro.devolverLivro(qtdEmprestado);
    }
}