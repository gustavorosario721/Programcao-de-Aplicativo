import java.util.Scanner;

public class TresValores
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        int soma = 0;
        byte pedidos = 0;

        int i = 0;
        while (i < 3)
        {
            try
            {
                System.out.print("Informe o valor do item " + (i + 1) + ": ");
                array[i] = input.nextInt();
                soma += array[i];
                pedidos++;
                i++;
            }   
            catch (Exception e)
            {
                System.out.println("\nValor invalido! Tente novamente.");
                input.next();
                pedidos++;
            }
        }

        System.out.println("O numero de vezes que foi solicitado a entrada do usuario foi: " + pedidos);
        System.out.println("Soma dos valores: " + soma);
    }
}