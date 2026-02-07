import java.util.Scanner;

public class Atividade_16 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int qtd;
    float preco;
    String nome;

    System.out.print("Informe o nome do produto: ");
    nome = input.nextLine();

    System.out.print("Informe o preco do produto: ");
    preco = input.nextFloat();

    System.out.print("Informe a quantidade comprada: ");
    qtd = input.nextInt();

    System.out.printf("Produto: %s\nTotal a pagar: %f\n", nome, (preco * qtd));
  }
}
