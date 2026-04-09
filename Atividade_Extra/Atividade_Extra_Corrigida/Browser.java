public interface Browser
{
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public int abasAbertas();
    public void atualizarPagina();
    public void alterarMecanismoBusca(String mecanismo);
}