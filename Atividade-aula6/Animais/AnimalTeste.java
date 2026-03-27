public class AnimalTeste 
{
    public static void main(String args[])
    {
        Cachorro C = new Cachorro("Vira-lata");
        Animal G = new Gato("Gato");

        C.emitirSom();
        System.out.println();
        C.emitirSom(3);
        System.out.println();
        G.emitirSom();
    }    
}
