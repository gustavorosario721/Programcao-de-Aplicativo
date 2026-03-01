import java.util.Scanner;

public class Atividade_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Informe o numero 1: ");
        num1 = input.nextInt();

        System.out.println("Informe o numero 2: ");
        num2 = input.nextInt();

        System.out.printf("A soma de %d e de %d é: %d", num1, num2, num1 + num2);   
    }
}