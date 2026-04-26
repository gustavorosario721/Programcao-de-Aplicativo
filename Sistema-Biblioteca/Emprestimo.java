public class Emprestimo
{
    private static int contador = 1;
    private int id;
    private Usuario usuario;
    private Livro livro;
    private byte qtdEmprestado;
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

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    public Usuario getUsuario() 
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

    public void setQtdEmprestado(byte qtdEmprestado) 
    {
        this.qtdEmprestado = qtdEmprestado;
    }

    public byte getQtdEmprestado() 
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

    public void pegarLivro(Usuario usuario, Livro livro, byte qtdEmprestado, String dataEmprestimo)
    {
        setUsuario(usuario);
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
        usuario.devolverLivro(qtdEmprestado);
    }
}