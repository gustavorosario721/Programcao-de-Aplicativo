public class VeiculoTeste 
{
    public static void main(String[] args)
    {
        Moto m1 = new Moto();
        Carro c1 = new Carro();

        m1.setMarca("Honda");
        c1.setMarca("Chevrolet");

        m1.ligar();
        c1.ligar();

        m1.ligar(true);
        c1.ligar(false);
    }
}