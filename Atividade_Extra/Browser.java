public class Browser extends Iphone
{
    private String mecanismoBusca;
    private int abasAbertas = 0;
    private String siteAtual;

    public Browser()
    {
    }

    public Browser(String mecanismoBusca, int abasAbertas, String siteAtual)
    {
        this.mecanismoBusca = mecanismoBusca;
        this.abasAbertas = abasAbertas;
        this.siteAtual = siteAtual;
    }

    public void exibirPagina(String url)
    {
        System.out.println("Pagina atual " + url);
    }

    public void adicionarNovaAba()
    {
        System.out.println("Nova aba aberta");
        abasAbertas++;
    }

    public void atualizarPagina()
    {
        System.out.println("Pagina atualizada");
    }

    public void alterarMecanismoBusca(String mecanismo)
    {
        mecanismoBusca = mecanismo;
        System.out.println("Mecanismo de busca atualizado para " + mecanismoBusca);
    }
}