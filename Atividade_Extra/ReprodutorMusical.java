public class ReprodutorMusical extends Iphone
{
    private int nivelVolume;
    private String musicaAtual;
    private String playlistAtual;

    public void tocarMusica()
    {
        System.out.println("Tocando musica " + musicaAtual);
    }

    public void pausarMusica()
    {
        System.out.println("Musica " + musicaAtual + " pausada");
    }

    public void selecionarMusica(String musica)
    {
        this.musicaAtual = musica;
        System.out.println("Tocando " + musica);
    }
}