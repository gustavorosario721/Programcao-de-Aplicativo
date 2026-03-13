public class Alimento extends Produto
{
    public String dataDeValidade;

    public Alimento(String nome, double preco, String dataDeValidade)
    {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) 
    {
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() 
    {
        return this.dataDeValidade;
    }
}
