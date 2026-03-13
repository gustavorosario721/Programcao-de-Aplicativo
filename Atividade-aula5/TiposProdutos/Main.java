public class Main 
{
    public static void main(String[] args)
    {
        Eletronico eletronico1 = new Eletronico("Celular", 1599.99, "00/00/0000");
        eletronico1.setGarantia("12/12/2027");
        eletronico1.mostrarProduto();
        System.out.println("Garantia: " + eletronico1.getGarantia());

        System.out.println();

        Alimento alimento1 = new Alimento("Coco", 4.22324, "00/00/0000");
        alimento1.setDataDeValidade("14/03/2026");
        alimento1.mostrarProduto();
        System.out.println("Data de validade: " + alimento1.getDataDeValidade());
    }    
}
