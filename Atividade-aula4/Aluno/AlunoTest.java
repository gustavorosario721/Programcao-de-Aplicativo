import java.util.Scanner;

public class AlunoTest 
{
    public static void main(String args[])
    {
        double[] notas = new double[3];
        Aluno aluno1 = new Aluno("Gustavo");
        Scanner input = new Scanner(System.in);

        System.out.print("Informe três notas para o aluno: ");

        for (int i = 0; i < notas.length; i++)
        {
            notas[i] = input.nextDouble();
        }

        aluno1.setNotas(notas);

        aluno1.calcularMedia();
    }    
}
