import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String simbol = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a operação que deseja fazer. \"exit\" para sair.");
        System.out.println("+: adição\n-: subtração\n*: multiplicação\n/: divisão\n**: exponenciação");
        simbol = input.next();
        while (!simbol.equalsIgnoreCase("exit"))
        {   
            System.out.print("Informe os numeros: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            switch (simbol)
            {
                case "+":
                    System.out.printf("%d somado à %d é igual a %d\n\n", num1, num2, num1 + num2);
                    break;
                case "-":
                    System.out.printf("%d subtraido por %d é igual a %d\n\n", num1, num2, num1 - num2);
                    break;
                case "*":
                    System.out.printf("%d multiplicado por %d é igual a %d\n\n", num1, num2, num1 * num2);
                    break;
                case "/":
                    try
                    {
                        int divisao = num1 / num2;
                        System.out.printf("%d dividido por %d é igual a %d\n\n", num1, num2, divisao);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Impossivel dividir por zero.");
                    }
                    break;
                case "**":
                    int result = 1;
                    if (num1 != 0 || num2 != 0)
                    {
                        for (int i = 0; i < num2; i++)
                        {
                            result = result * num1;
                        }
                    }
                    else
                    {
                        System.out.println("0 elevado à 0 gera comportamento indefinido.");
                        break;
                    }
                    System.out.printf("%d elevado à %d é %d\n\n", num1, num2, result);
                    break;
                default:
                    System.out.println("Simbolo invalido.");
            }
            System.out.println("Informe a operação que deseja fazer. \"exit\" para sair.");
            System.out.println("+: adição\n-: subtração\n*: multiplicação\n/: divisão\n**: exponenciação");
            simbol = input.next();
        }
        System.out.println("Encerrando o programa :-\\");
    }    
}
