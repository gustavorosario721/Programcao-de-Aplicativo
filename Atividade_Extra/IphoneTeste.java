public class IphoneTeste
{
    public static void main(String[] args) 
    {
        Iphone i1[] = {
            new Browser(), 
            new ReprodutorMusical(), 
            new AparelhoTelefonico()
        };
        
        Browser b1= new Browser();
        b1.adicionarNovaAba();
        b1.atualizarPagina();
        b1.exibirPagina("Google.com");
        b1.alterarMecanismoBusca("Yahooo");

        ReprodutorMusical r1 = new ReprodutorMusical();
        r1.selecionarMusica("chapadinha na gaveta");
        r1.tocarMusica();
        r1.pausarMusica();

        AparelhoTelefonico a1 = new AparelhoTelefonico();
        a1.ligar("92424-2232");
        a1.atender();
        a1.iniciarCorreio();
    }
}