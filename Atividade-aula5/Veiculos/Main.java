public class Main 
{
    public static void main(String[] args) 
    {
        Carro c1 = new Carro("Fiat", "2006", 2);
        c1.setPortas(4);

        c1.exibirInformacoes();
        System.out.println("Portas: " + c1.getPortas());

        System.out.println();

        Moto m1 = new Moto("Honda", "2019", 200);
        m1.setCilindradas(150);

        m1.exibirInformacoes();
        System.out.println("Cilindradas: " + m1.getCilindradas());
    
    }
}
