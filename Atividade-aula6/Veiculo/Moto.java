public class Moto extends Veiculo
{
    @Override
    public void ligar() 
    {
        System.out.println("Ligando a moto.");
    }

    public void ligar(boolean chavePresencial)
    {
        if (chavePresencial) 
        {
            System.out.println("Ligando moto " + getMarca() + " com chave presencial.");
        }
        else
            System.out.println("Ligando moto " + getMarca() + " sem chave presencial.");
    }
}