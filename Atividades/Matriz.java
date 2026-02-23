import java.util.Scanner;

public class Matriz 
{
    public static void main()
    {
        int[][] array = 
        {{0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}};

        Scanner input = new Scanner(System.in);
        System.out.print("Informe os elementos da matriz: ");
        for (int c = 0; c < 3; c++)
        {
            for (int r = 0; r < 3; r++)
            {
                array[c][r] = input.nextInt();
            }
        }       

        for (int c = 0; c < 3; c++)
        {
            for (int r = 0; r < 3; r++)
            {
                System.out.print(array[c][r]);
            }
            System.out.println();
        }

        for (int c = 0; c < 3; c++)
        {
            for (int r = 0; r < 3; r++)
            {
                if (c == r)
                    System.out.print(array[c][r]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int c = 0; c < 3; c++)
        {
            for (int r = 0; r < 3; r++)
            {
                if (c == r)
                    System.out.print(array[c][r]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
