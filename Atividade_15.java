import java.util.Scanner;

public class Atividade_15 
{
  public static void main(String[] args) 
  {
    String nome;
    float nota1;
    float nota2;

    Scanner input = new Scanner(System.in);

    System.out.print("Informe o nome do aluno: ");
    nome = input.nextLine();

    System.out.print("Informe as notas do aluno: ");
    nota1 = input.nextFloat();
    nota2 = input.nextFloat();

    System.out.printf("Nome do Aluno: %s%nMédia: %f\n", nome, (nota1 + nota2) / 2);
  }
}
