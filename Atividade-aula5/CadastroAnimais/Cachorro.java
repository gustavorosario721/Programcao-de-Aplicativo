public class Cachorro extends Animal
{
    private String raca;

    public Cachorro(String nome, int peso, String raca)
    {
        super(nome, peso);
        this.raca = raca;
    }

    public void setRaca(String raca) 
    {
        this.raca = raca;
    }

    public String getRaca() 
    {
        return this.raca;
    }
}