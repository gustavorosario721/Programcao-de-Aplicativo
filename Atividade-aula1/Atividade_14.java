import java.util.Scanner;

public class Atividade_14
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int idade;
    float altura;
    String nome;

    System.out.print("Informe a sua idade: ");
    idade = input.nextInt();
    input.nextLine();

    System.out.print("Informe o seu nome: ");
    nome = input.nextLine();

    System.out.print("Informe a sua altura: ");
    altura = input.nextFloat();

    System.out.printf("Nome = %s\nIdade = %d\nAltura = %f\n", nome, idade, altura);
  }
}
