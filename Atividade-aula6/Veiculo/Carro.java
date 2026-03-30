public class Carro extends Veiculo
{
    @Override
    public void ligar() 
    {
        System.out.println("Ligando a carro.");
    }

    public void ligar(boolean chavePresencial)
    {
        if (chavePresencial) 
        {
            System.out.println("Ligando carro " + getMarca() + " com chave presencial.");
        }
        else
            System.out.println("Ligando carro " + getMarca() + " sem chave presencial.");
    }
}
