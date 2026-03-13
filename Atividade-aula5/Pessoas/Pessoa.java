public class Pessoa
{
    private String nome;
    private int idade;

    Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return this.nome;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public int getIdade() 
    {
        return this.idade;
    }
}
