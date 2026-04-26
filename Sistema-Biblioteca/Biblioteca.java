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

    public boolean selecionarDisciplina(Disciplina d)
    {
        boolean cadastroConluido;

        System.out.println("---------- Disciplinas ----------\n");
        Disciplina.listarDisciplinas();
        System.out.print("Escolha a disciplina a ser atribuida: ");

        byte op = input.nextByte();
        input.nextLine();
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
                System.out.printf("\n%10s", "Opção inválida!");
                cadastroConluido = false;
                break;
        }

        return cadastroConluido;
    }
 
    public void cadastrarAluno()
    {
        boolean cpfValido;
        boolean matriculaValida;
        String nome;
        String cpf;
        String matricula;

        System.out.println("---------- Cadastro de Aluno ----------");
        System.out.print("Informe o nome do Aluno: ");
        nome = input.nextLine();

        do
        {
            System.out.print("\nInforme o CPF no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.printf("\n%10s", "!CPF formatado errado! Tente novamente!\n");
                continue;
            }
        } 
        while (!cpfValido);

        do
        {
            System.out.print("\nInforme a matricula no formato 00000: ");
            matricula = input.nextLine();
            matriculaValida = Validador.matriculaFormatoValido(matricula);
            if (!matriculaValida) 
            {
                System.out.printf("\n%10s", "!Matricula formatada errada! Tente novamente!");
                continue;    
            }
        } 
        while (!matriculaValida);

        Usuario c = Buscador.buscarCpf(cpf, usuarios);
        Usuario m = Buscador.buscarMatricula(matricula, usuarios);

        if (c == null && m == null)
        {
            Aluno a = new Aluno();
            a.cadastrarAluno(nome, cpf, matricula);
            usuarios.add(a);
        }
        else
            System.out.printf("\n%10s", "!Informe outro CPF e outra Matricula!");

        System.out.printf("\n%10s", "Aluno cadastrado com sucesso!\n");
                System.out.println("--------------------\n");
    }

    public void cadastrarProfessor()
    {
        boolean cpfValido;
        boolean cadastroConluido = false;
        String nome;
        String cpf;
        Disciplina d = Disciplina.LOGICA_DE_PROGRAMACAO;

        System.out.println("---------- Cadastro de Professor ----------");
        System.out.print("Informe o nome do Professor: ");
        nome = input.nextLine();

        do
        {
            System.out.print("\nInforme o CPF do professor no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.printf("\n%10s", "!CPF formatado errado! Tente novamente.\n");
                continue;
            }

            Usuario c = Buscador.buscarCpf(cpf, usuarios);
            if (c == null)
                cpfValido = true;
            else
            {
                System.out.printf("\n%10s", "!Informe outro CPF!\n");
                cpfValido = false;
                continue;
            }
        }
        while (!cpfValido);

        do
        {
            cadastroConluido = selecionarDisciplina(d);
        } while (!cadastroConluido);

        Professor p = new Professor();
        p.cadastrarProfessor(nome, cpf, d);
        usuarios.add(p);
        System.out.println("\nProfessor cadastrado com sucesso!\n");
        System.out.println("--------------------\n");
    }


    public void cadastrarLivro() {
        Disciplina d = Disciplina.LINGUAGENS_DE_PROGRAMACAO;
        boolean disciplinaValida;
        int qtdTotal;

        System.out.println("---------- Cadastro de Livro ----------");
        System.out.print("\nInforme o título do livro: ");
        String titulo = input.nextLine();
        System.out.print("Informe o autor do livro: ");
        String autor = input.nextLine();

        do 
        {
            System.out.println("Informe a quantidade total de livro");
            qtdTotal = input.nextInt();
            input.nextLine();

            if (qtdTotal <= 0)
                System.out.printf("\n%10s", "!Informe uma quantidade não nula e positiva!");
        } 
        while (qtdTotal <= 0);
        
        do
        {
            System.out.println("Informe a disciplina a qual o livro pertence");
            disciplinaValida = selecionarDisciplina(d);
        } 
        while (!disciplinaValida);

        Livro novoLivro = new Livro(titulo, autor, qtdTotal, d);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!\n");
        System.out.println("--------------------\n");
    }

    public void realizarEmprestimo() 
    {
        System.out.println("---------- Realizar Emprestimo ----------");
        System.out.print("\nInforme o CPF do usuário: ");
        String cpf = input.nextLine();
        Usuario usuario = Buscador.buscarCpf(cpf, usuarios);

        if (usuario == null) {
            System.out.printf("\n%10s", "!Usuário não encontrado!\n");
            System.out.println("--------------------\n");
            return;
        }

        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        Livro livroAlvo = Buscador.buscarLivro(titulo, livros);

        if (livroAlvo == null)
        {
            System.out.printf("\n%10s", "!Livro não encontrado!");
            System.out.println("--------------------\n");
            return;
        }

        System.out.println("Quantidade livre: " + livroAlvo.getQtdLivre());
        System.out.printf("Quantidade maxima de livros para\nProfessor: %d\nAluno: %d\n", Professor.getMaxLivros(), Aluno.getMaxLivros());
        System.out.println("Quantidade de livros em posse do usuario: " + usuario.getQtdLivros());
        System.out.print("Informe a quantidade desejada de livro: ");
        int qtdEmprestado = input.nextInt();
        input.nextLine();
        
        if ((usuario instanceof Aluno) &&
            ((qtdEmprestado + usuario.getQtdLivros()) 
                > Aluno.getMaxLivros()))
        {
            System.out.printf("\n%10s", "!Quantidade maxima de livros para aluno excedidia!\n");
            System.out.println("--------------------\n");
            return;
        }
        else if ((qtdEmprestado + usuario.getQtdLivros()) 
            > Professor.getMaxLivros()) 
        {
            System.out.printf("\n%10s", "Quantidade maxima de livros para professor excedidia!\n");
            System.out.println("--------------------\n");
            return;   
        }

        if (livroAlvo.temEstoque(qtdEmprestado)) 
        {
            Emprestimo novoEmprestimo = new Emprestimo();
            novoEmprestimo.pegarLivro(cpf, livroAlvo, qtdEmprestado, titulo);
            emprestimos.add(novoEmprestimo);
            System.out.printf("Empréstimo realizado com sucesso para: %s\n", usuario.getNome());
        } 
        else
            System.out.printf("\n%10s", "!Quantidade exedeu estoque!\n");
        System.out.println("--------------------\n");
    }

    public void devolverEmprestimo() 
    {
        System.out.println("---------- Devolver Emprestimo ----------");
        System.out.print("\nInforme o id do emprestimo a ser devolvido: ");
        int id = input.nextInt();
        input.nextLine();
        Emprestimo e = Buscador.buscaEmprestimo(id, emprestimos);

        if (e != null && e.getAtivo()) 
        {
            e.devolverLivro("00/00/0000");
            System.out.println("Emprestimo devolvido com sucesso!\n");
        }
        else
            System.out.printf("\n%10s", "Empréstimo ativo não encontrado para este id.");
        System.out.println("--------------------\n");
    }

    public void listarUsuarios() 
    {
        System.out.println("\n---------- Lista de Usuários ----------");
        if (usuarios.isEmpty()) 
        {
            System.out.printf("\n%10s", "Nenhum usuário cadastrado.\n");
            System.out.println("--------------------\n");
        } 
        else 
        {
            for (Usuario u : usuarios) 
            {
                u.exibirDados();
                System.out.println("--------------------\n");
            }
        }
    }

    public void listarLivros() 
    {
        System.out.println("\n---------- Acervo da Biblioteca ----------");
        if (livros.isEmpty())
        {
            System.out.printf("\n%10s", "Nenhum livro no acervo.\n");
            System.out.println("--------------------\n");
        }
        else 
        {
            for (Livro l : livros) 
            {
                l.exibirDados();
                System.out.println("--------------------\n");
            }
        }
    }

    public void listarEmprestimos() 
    {
        System.out.println("\n---------- Histórico de Empréstimos ----------");

        if (emprestimos.isEmpty()) 
        {
            System.out.printf("\n%10s", "Nenhum empréstimo registrado.\n");
            System.out.println("--------------------\n");
        } 
        else 
        {
            for (Emprestimo e : emprestimos) 
            {
                Usuario u = Buscador.buscarCpf(e.getCpf(), usuarios);
                String status = e.getAtivo() ? "Ativo" : "Devolvido";
                System.out.println("Livro: " + e.getLivro().getTitulo());
                System.out.println("Usuário: " + u.getNome());
                System.out.println("Status: " + status);
                System.out.println("--------------------\n");
            }
        }
    }
}