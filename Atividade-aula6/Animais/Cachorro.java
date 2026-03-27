public class Cachorro extends Animal
{

    public Cachorro(String nome)
    {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Au Au");
    }

    public void emitirSom(int vezes)
    {
        for (int i = 1; i <= vezes; i++)
            System.out.println("AAAAAAAA");
    }
}
