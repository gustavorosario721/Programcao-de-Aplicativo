public class Iphone implements Browser, ReprodutorMusical, AparelhoTelefonico
{
    private int abas = 0;
    private String musica;
    private String mecanismoBusca = "Google";

//Browser

    @Override
    public void exibirPagina(String url)
    {
        System.out.println("Exibindo pagina " + url + " usando o mecanismo " + mecanismoBusca);
    }

    @Override
    public void adicionarNovaAba()
    {
        System.out.println("Nova aba criada");
        abas++;
    }

    @Override
    public int abasAbertas()
    {
        return abas;
    }

    @Override
    public void atualizarPagina()
    {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void alterarMecanismoBusca(String mecanismo)
    {
        System.out.println("Mecanismo de busca alterado para " + mecanismo);
        this.mecanismoBusca = mecanismo;

    }

//Reprodutor musical

    @Override
    public void tocarMusica()
    {
        System.out.println("Tocando musica " + musica);
    }

    @Override
    public String getMusicaAtual()
    {
        return musica;
    }

    @Override
    public void pausarMusica()
    {
        System.out.println("Musica " + musica + " pausada");
    }

    @Override
    public void selecionarMusica(String musica)
    {
        System.out.println("Musica " + musica + " pausada");
    }

//Aparelho Telefonico

    @Override
    public void ligar(String numero)
    {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender()
    {
        System.out.println("Atendendo numero xxxxx-xxxx");
    }

    @Override
    public void iniciarCorreio()
    {
        System.out.println("Iniciando correio de voz");
    }
}