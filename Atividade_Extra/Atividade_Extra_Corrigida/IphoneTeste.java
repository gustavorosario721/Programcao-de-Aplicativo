//Alunos: Gustavo do Rosario Alves da Silva, Eduardo Meneses

public class IphoneTeste
{
    public static void main(String[] args) 
    {
        Iphone i1 = new Iphone();

        //Browser
        i1.alterarMecanismoBusca("Yahoo");
        i1.adicionarNovaAba();
        i1.abasAbertas();
        i1.atualizarPagina();
        i1.exibirPagina("w3c.com");
        System.out.println();

        //Reprodutor musical
        i1.selecionarMusica("Alguma musica");
        System.out.println("Musica atual " + i1.getMusicaAtual());
        i1.pausarMusica();
        i1.tocarMusica();
        System.out.println();

        //Aparelho telefonico
        i1.ligar("(71) 90003-9393");
        i1.atender();
        i1.iniciarCorreio();
        System.out.println();
    }
}