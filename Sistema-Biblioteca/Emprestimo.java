public class Emprestimo
{
    private int id;
    private String usuario;
    private Livro livro;
    private int qtdEmprestado;
    private String dataEmprestimo;
    private boolean jaFoiDevlvido = false;
    private String dataDevolucao;

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getId() 
    {
        return id;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    public String getUsuario() 
    {
        return usuario;
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

    public void setJaFoiDevlvido(boolean jaFoiDevlvido) 
    {
        this.jaFoiDevlvido = jaFoiDevlvido;
    }

    public boolean getJaFoiDevlvido() 
    {
        return jaFoiDevlvido;
    }    

    public void setDataDevolucao(String dataDevolucao)
    {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataDevolucao()
    {
        return dataDevolucao;
    }

    public void pegarLivro(Livro livro, int qtdEmprestado, String dataEmprestimo)
    {
        setLivro(livro);
        setQtdEmprestado(qtdEmprestado);
        setDataEmprestimo(dataEmprestimo);
        livro.emprestarLivro(qtdEmprestado);
    }

    public void devolverLivro(String dataDevolucao)
    {
        setDataDevolucao(dataDevolucao);
        setJaFoiDevlvido(true);
        livro.devolverLivro(qtdEmprestado);
    }
}