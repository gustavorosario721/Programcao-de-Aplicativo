import java.util.Scanner;

public class QuatroValores
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        int soma = 0;

        int i = 0;
        while (i < 4)
        {
            try
            {
                System.out.print("Informe o valor do item " + (i + 1) + ": ");
                array[i] = input.nextInt();
                i++;
            }   
            catch (Exception e)
            {
                System.out.println("\nValor invalido! Tente novamente.");
                input.next();
            }
        }

        for (int num : array) 
        {
            if (num % 2 == 0)
                soma += num;    
        }

        System.out.println("Soma dos valores: " + soma);
    }
}