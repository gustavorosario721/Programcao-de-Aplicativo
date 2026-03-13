public class Veiculo 
{
    private String marca;
    private String ano;

    public Veiculo(String marca, String ano)
    {
        this.marca = marca;
        this.ano = ano;
    }

    public void setAno(String ano) 
    {
        this.ano = ano;
    }

    public String getAno() 
    {
        return this.ano;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getMarca()
    {
        return this.marca;
    }

    public void exibirInformacoes()
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}
