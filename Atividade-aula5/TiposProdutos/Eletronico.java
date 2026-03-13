public class Eletronico extends Produto
{
    private String garantia;

    public Eletronico(String nome, double preco, String garantia)
    {
        super(nome, preco);
        this.garantia = garantia;
    }

    public void setGarantia(String garantia) 
    {
        this.garantia = garantia;
    }

    public String getGarantia() 
    {
        return this.garantia;
    }
}
