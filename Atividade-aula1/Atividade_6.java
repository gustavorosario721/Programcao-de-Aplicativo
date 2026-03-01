public class Atividade_6 
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Informe os dois numeros reais: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("A media desses dois numeros é: " + ((num1 + num2) / 2));
    }    
}
