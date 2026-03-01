import java.util.Scanner;

public class Atividade_13
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    char inicial;

    System.out.print("Informe o seu nome: ");
    inicial = input.next().charAt(0);

    System.out.printf("A inicial do seu nome é: %c\n", inicial);
  }
}
