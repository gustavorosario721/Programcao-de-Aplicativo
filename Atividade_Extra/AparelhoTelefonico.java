public class AparelhoTelefonico extends Iphone
{
    private String telefone;

    public void ligar(String numero)
    {
        System.out.println("Ligando para " + numero);
    }

    public void atender()
    {
        System.out.println("Ligação atendida de xxxxx");
    }

    public void iniciarCorreio()
    {
        System.out.println("Iniciando correio de voz");
    }
}
