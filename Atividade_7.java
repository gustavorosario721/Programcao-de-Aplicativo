public class Atividade_7 
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        float produto;
        int quantidade;

        System.out.print("Informe o valor do produto: ");
        produto = input.nextFloat();

        System.out.print("Informe a quantidade comprada: ");
        quantidade = input.nextInt();

        System.out.printf("Valor total da compra: %f", (produto * quantidade));
    }
}
