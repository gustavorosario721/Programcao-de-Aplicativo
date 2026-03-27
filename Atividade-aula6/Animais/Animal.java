public class Animal 
{
    private String nome;

    public Animal(String nome)
    {
        this.nome = nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void emitirSom()
    {
        System.out.printf("O Animal %s emite um som\n", nome);
    }
}
