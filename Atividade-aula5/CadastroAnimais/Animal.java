public class Animal
{
    private String nome;
    private int peso;

    public Animal(String nome, int peso)
    {
        this.nome = nome;
        this.peso = peso;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(int peso) 
    {
        this.peso = peso;
    }

    public int getPeso() 
    {
        return peso;
    }

    public void mostrarAnimal()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
    }
}