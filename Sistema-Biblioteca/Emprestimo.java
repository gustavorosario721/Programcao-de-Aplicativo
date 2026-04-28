import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo
{
    private static int contador = 1;
    private int id;
    private Usuario usuario;
    private Livro livro;
    private byte qtdEmprestado;
    private LocalDate dataEmprestimo;
    private boolean ativo = true;
    private LocalDate dataDevolucao;
    private double multa;


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

    public void setDataEmprestimo(LocalDate dataEmprestimo) 
    {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataEmprestimo() 
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

    public void setDataDevolucao(LocalDate dataDevolucao) 
    {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataDevolucao() 
    {
        return dataDevolucao;
    }

    public void setMulta(double multa) 
    {
        this.multa = multa;
    }

    public double getMulta() 
    {
        return multa;
    }

    public void pegarLivro(Usuario usuario, Livro livro, byte qtdEmprestado, LocalDate dataEmprestimo, LocalDate dataDevolucao)
    {
        setUsuario(usuario);
        setLivro(livro);
        setQtdEmprestado(qtdEmprestado);
        setDataEmprestimo(dataEmprestimo);
        setDataDevolucao(dataDevolucao);
        livro.emprestarLivro(qtdEmprestado);
    }

    public void calcularMulta()
    {

    }

    public void devolverLivro(LocalDate dataDevolucao)
    {
        setDataDevolucao(dataDevolucao);
        setAtivo(false);
        livro.devolverLivro(qtdEmprestado);
        usuario.devolverLivro(qtdEmprestado);
    }
}