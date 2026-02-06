import java.util.Scanner;

public class Atividade_11 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean valor;

        System.out.println("\nInforme um valor qualquer: ");
        valor = input.nextBoolean();

        System.out.printf("\nO valor de bool é: %b", valor);
    }    
}
