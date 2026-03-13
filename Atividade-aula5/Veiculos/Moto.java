public class Moto extends Veiculo
{
    private int cilindradas;

    public Moto(String marca, String ano, int cilindradas)
    {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas) 
    {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() 
    {
        return cilindradas;
    }
}
