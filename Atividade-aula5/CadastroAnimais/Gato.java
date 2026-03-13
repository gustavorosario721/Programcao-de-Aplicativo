public class Gato extends Animal
{
    private String cor;

    public Gato(String nome, int peso, String cor)
    {
        super(nome, peso);
        this.cor = cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public String getCor() 
    {
        return this.cor;
    }
}