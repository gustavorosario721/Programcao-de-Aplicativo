public class Livro
{
    private String titulo;
    private Disciplina disciplina;
    private String autor;
    private int qtdTotal;
    private int qtdLivre;
    private int qtdEmprestado;

    public Livro()
    {
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setDisciplina(Disciplina disciplina) 
    {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() 
    {
        return disciplina;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public String getAutor() 
    {
        return autor;
    }

    public boolean temEstoque(int qtdEmprestado)
    {
        if (getQtdLivre() >= qtdEmprestado)
            return true;
        return false;
    }

    public void setQtdTotal(int qtdTotal) 
    {
        this.qtdTotal = qtdTotal;
    }

    public int getQtdTotal() 
    {
        return qtdTotal;
    }

    public void setQtdLivre(int qtdLivre) 
    {
        this.qtdLivre = qtdLivre;
    }

    public int getQtdLivre() 
    {
        return qtdLivre;
    }

    public void setQtdEmprestado(int qtdEmprestado) 
    {
        this.qtdEmprestado = qtdEmprestado;
    }

    public int getQtdEmprestado() 
    {
        return qtdEmprestado;
    }

    public void cadastrarLivro(String titulo, String autor, Disciplina disciplina, int qtdTotal)
    {
        setTitulo(titulo);
        setAutor(autor);
        setDisciplina(disciplina);
        setQtdTotal(qtdTotal);
        setQtdLivre(qtdTotal);
    }

    public void emprestarLivro(int qtdEmprestado)
    {
        if (getQtdLivre() >= qtdEmprestado) 
        {
            int totalLivre = getQtdLivre();
            totalLivre -= qtdEmprestado;
            setQtdLivre(totalLivre);

            int totalEmprestado = getQtdEmprestado();
            totalEmprestado += qtdEmprestado;
            setQtdEmprestado(totalEmprestado);
        }
    }

    public void devolverLivro(int qtdDevolvido)
    {
        if (getQtdEmprestado() >= qtdDevolvido)
        {
            int totalEmprestado = getQtdEmprestado();
            totalEmprestado -= qtdDevolvido;
            setQtdEmprestado(totalEmprestado);

            int totalLivre = getQtdLivre();
            totalLivre += qtdDevolvido;
            setQtdLivre(totalLivre);
        }
    }

    public void exibirDados()
    {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Disciplina: " + getDisciplina().nomeFormatado());
        System.out.println("Quantidade livre: " + getQtdLivre());
        System.out.println("Quantidade emprestada: " + getQtdEmprestado());
    }
}
