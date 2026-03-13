public class Main 
{
    public static void main(String[] args) 
    {
        Cachorro cachorro1 = new Cachorro("Joao", 10, "vira-lata");
        cachorro1.setNome("bob");
        cachorro1.setPeso(30);
        cachorro1.setRaca("vira-lata");

        cachorro1.mostrarAnimal();
        System.out.println("Raca: " + cachorro1.getRaca());

        System.out.println();

        Gato gato1 = new Gato("eraldo", 5, "amarelo");
        gato1.setNome("thunder");
        gato1.setPeso(10);
        gato1.setCor("Laranja");

        cachorro1.mostrarAnimal();
        System.out.println("Cor: " + gato1.getCor());
    }
}