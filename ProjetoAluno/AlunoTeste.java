import java.util.Scanner;

public class AlunoTeste 
{
    public static void main(String[] args)
    {
        Aluno[] alunos = new Aluno[5];
        String name;
        int age;
        String registration;

        alunos[0] = new Aluno(null, 0, null);
        alunos[1] = new Aluno(null, 0, null);
        alunos[2] = new Aluno(null, 0, null);
        alunos[3] = new Aluno(null, 0, null);
        alunos[4] = new Aluno(null, 0, null);

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < alunos.length; i++)
        {
            System.out.print("Informe o nome do aluno: ");
            name = input.nextLine();
            System.out.print("Informe a idade do aluno: ");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Informe a matricula do aluno: ");
            registration = input.nextLine();
            System.out.println();           
            alunos[i].setName(name);
            alunos[i].setAge(age);
            alunos[i].setRegistraton(registration);
        }

        for (int i = 0; i < alunos.length; i++)
        {
            System.out.printf("Nome do aluno %d: %s\n", i + 1, alunos[i].getName());
            System.out.printf("Idade do aluno %d: %d\n", i + 1, alunos[i].getAge());
            System.out.printf("Matricula do aluno %d: %s\n", i + 1, alunos[i].getRegistration());
            System.out.println();
        }
    }
}
