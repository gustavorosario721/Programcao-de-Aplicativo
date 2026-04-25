import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca
{
    List <Usuario> usuarios = new ArrayList<>();
    List <Livro> livros = new ArrayList<>();
    List <Emprestimo> emprestimos = new ArrayList<>();
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

    public Aluno buscarMatricula(String matricula)
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
 
    public void recomendarLivro()
    {
    }
    
    public void cadastrarAluno()
    {
        boolean cpfValido;
        boolean matriculaValida;
        String nome;
        String cpf;
        String matricula;

        System.out.print("Informe o nome do Aluno: ");
        nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF do Aluno no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }
        } 
        while (cpfValido);

        do
        {
            System.out.print("Informe a matricula no formato 00000: ");
            matricula = input.nextLine();
            matriculaValida = matriculaFormatoValido(matricula);
            if (!matriculaValida) 
            {
                System.out.println("Matricula formatada errada! Tente novamente.");
                continue;    
            }
        } 
        while (!matriculaValida);

        Usuario c = buscarCpf(cpf);
        Usuario m = buscarMatricula(matricula);

        if (c == null && m == null)
        {
            Aluno a = new Aluno();
            a.cadastrarAluno(nome, cpf, matricula);
            usuarios.add(a);
        }
        else
            System.out.println("Informe outro CPF e outra Matricula.");
    }

    public void cadastrarProfessor()
    {
        boolean cpfValido;
        boolean cadastroConluido = false;
        String nome;
        String cpf;
        Disciplina d = Disciplina.LOGICA_DE_PROGRAMACAO;

        System.out.print("Informe o nome do Professor: ");
        nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF do professor no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }

            Usuario c = buscarCpf(cpf);
            if (c == null)
                cpfValido = true;
            else
            {
                System.out.println("Informe outro CPF.");
                cpfValido = false;
                continue;
            }
        }
        while (!cpfValido);

        do
        {
            System.out.println("Escolha a disciplina do professor");
            Disciplina.listarDisciplinas();
          
            byte op = input.nextByte();
            switch (op) 
            {
                case 1:
                    d = Disciplina.values()[op - 1];
                    cadastroConluido = true;
                    break;
                case 2:
                    d = Disciplina.values()[op - 1];
                    cadastroConluido = true;
                    break;
                case 3:
                    d = Disciplina.values()[op - 1];
                    cadastroConluido = true;
                    break;
                case 4:
                    d = Disciplina.values()[op - 1];
                    cadastroConluido = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    cadastroConluido = false;
                    break;
            }
        } while (!cadastroConluido);

        Professor p = new Professor();
        p.cadastrarProfessor(nome, cpf, d);
        usuarios.add(p);
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