public class Carro extends Veiculo
{
    public int portas;
    
    public Carro(String marca, String ano, int portas)
    {
        super(marca, ano);
        this.portas = portas;
    }

    public void setPortas(int portas) 
    {
        this.portas = portas;
    }

    public int getPortas() 
    {
        return this.portas;
    }
}
