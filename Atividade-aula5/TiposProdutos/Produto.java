public class Produto
{
    private String nome;
    private double preco;

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void mostrarProduto()
    {
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preco: %.2f", this.preco);
        System.out.println();
    }
}