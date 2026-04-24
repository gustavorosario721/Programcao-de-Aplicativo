import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca
{
    List <Usuario> usuarios = new ArrayList<>();
    List <Livro> livros = new ArrayList<>();
    List <Emprestimo> emprestimos = new ArrayList();
    Scanner input = new Scanner(System.in);

    public Biblioteca()
    {
    }

    public boolean matriculaFormatoValido(String matricula)
    {
        if (matricula.matches("\\d{5}"))
            return true;
        else
            return false;
    }

    public boolean cpfFormatoValido(String cpf)
    {
        if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
            return true;
        else
            return false;
            
    }

    public Usuario buscarCpf(String cpf)
    {
        for (Usuario c : usuarios) 
        {
            if (c.getCpf().equals(cpf))
                return c;
        }

        return null;
    }

    public Usuario buscarMatricula(String matricula)
    {
        for (Usuario u : usuarios)
        {
            if (u instanceof Aluno)
            {
                Aluno m = (Aluno) u;
                if (m.getMatricula().equals(matricula))
                    return m;
            }
        }
        return null;
    }
 
    public void cadastrarAluno()
    {
        boolean cadastroConluido = false;
        System.out.print("Informe o nome do Aluno: ");
        String nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF do Aluno no formato 000.000.000-00: ");
            String cpf = input.nextLine();
            cadastroConluido = cpfFormatoValido(cpf);
            if (!cadastroConluido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }

            System.out.print("Informe a matricula no formato 00000: ");
            String matricula = input.nextLine();
            cadastroConluido = matriculaFormatoValido(matricula);
            if (!cadastroConluido) 
            {
                System.out.println("Matricula formatada errada! Tente novamente.");
                continue;    
            }

            Usuario c = buscarCpf(cpf);
            Usuario m = buscarMatricula(matricula);

            if (u == null && m == null)
            {
                Aluno a = new Aluno();
                a.cadastrarAluno(nome, cpf, matricula);
                usuarios.add(a);
            }
            else
                System.out.println("Informe outro CPF e outra Matricula.");
        } while (!cadastroConluido);
    }

    public void cadastrarProfessor()
    {
        boolean cadastroConluido = false;
        System.out.print("Informe o nome do Professor: ");
        String nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF do professor no formato 000.000.000-00: ");
            String cpf = input.nextLine();
            cadastroConluido = cpfFormatoValido(cpf);
            if (!cadastroConluido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }

            Usuario c = buscarCpf(cpf);
            if (c == null)
            {
                Professor p = new Professor();
                p.cadastrarProfessor(nome, cpf, null);
                usuarios.add(a);
            }
            else
                System.out.println("Informe outro CPF e outra Matricula.");
        } while (!cadastroConluido);  
    }

    public void cadastrarLivro()
    {
    }

    public void realizarEmprestimo()
    {
    }

    public void devolverEmprestimo()
    {
    }

    public void listarUsuarios()
    {
    }

    public void listarLivros()
    {
    }

    public void listarEmprestimos()
    {
    }
}
