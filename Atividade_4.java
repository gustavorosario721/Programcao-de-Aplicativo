public class Atividade_4
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Informe o numero que deseja ver o valor dobrado: ");
        int num1 = input.nextInt();

        System.out.printf("O dobro de %d é: %d", num1, (num1 * 2));
    }
}