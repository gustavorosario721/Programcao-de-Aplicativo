import java.util.Scanner;

public class Atividade_8 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.print("Informe o seu nome: ");
        nome = input.nextLine();

        System.out.println("Boas vindas " + nome);
    }
}
