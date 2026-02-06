import java.util.Scanner;

public class Atividade_9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String cidade;
        String nome;

        System.out.print("\nInforme o seu nome: ");
        nome = input.nextLine();

        System.out.print("\nInforme a sua cidade: ");
        cidade = input.nextLine();

        System.out.printf("\nOla %s da cidade de %s\n", nome, cidade);
    }    
}