
import java.util.Scanner;

public class Atividade_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = input.nextInt();

        System.out.printf("A sua idade é: %d", idade);
    }
}