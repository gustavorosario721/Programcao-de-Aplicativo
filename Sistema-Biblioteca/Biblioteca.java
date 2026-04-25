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

        System.out.println("Escolha a disciplina a ser atribuida");
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
                System.out.println("Opção inválida");
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

        System.out.print("Informe o nome do Aluno: ");
        nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }
        } 
        while (!cpfValido);

        do
        {
            System.out.print("Informe a matricula no formato 00000: ");
            matricula = input.nextLine();
            matriculaValida = Validador.matriculaFormatoValido(matricula);
            if (!matriculaValida) 
            {
                System.out.println("Matricula formatada errada! Tente novamente.");
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
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("CPF formatado errado! Tente novamente.");
                continue;
            }

            Usuario c = Buscador.buscarCpf(cpf, usuarios);
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
            cadastroConluido = selecionarDisciplina(d);
        } while (!cadastroConluido);

        Professor p = new Professor();
        p.cadastrarProfessor(nome, cpf, d);
        usuarios.add(p);
    }


    public void cadastrarLivro() {
        Disciplina d = Disciplina.LINGUAGENS_DE_PROGRAMACAO;
        boolean disciplinaValida;
        int qtdTotal;

        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        System.out.print("Informe o autor do livro: ");
        String autor = input.nextLine();
        System.out.println("Informe a disciplina a qual o livro pertence");

        do 
        {
            System.out.println("Informe a quantidade total de livro");
            qtdTotal = input.nextInt();

            if (qtdTotal <= 0)
                System.out.println("Informe uma quantidade não nula e positiva!");
        } 
        while (qtdTotal <= 0);
        
        do
        {
            disciplinaValida = selecionarDisciplina(d);
        } 
        while (!disciplinaValida);

        Livro novoLivro = new Livro(titulo, autor, qtdTotal, d);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void realizarEmprestimo() {
        System.out.print("Informe o CPF do usuário: ");
        String cpf = input.nextLine();
        Usuario usuario = Buscador.buscarCpf(cpf, usuarios);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        Livro livroAlvo = Buscador.buscarLivro(titulo, livros);

        if (livroAlvo == null)
        {
            System.out.println("Livro não encontrado");
            return;
        }

        System.out.println("Quantidade livre: " + livroAlvo.getQtdLivre());
        System.out.printf("Quantidade maxima de livros para\nProfessor: %d\nAluno: %d\n", Professor.getMaxLivros(), Aluno.getMaxLivros());
        System.out.println("Quantidade de livros em posse do usuario: " + usuario.getQtdLivros());
        System.out.print("Informe a quantidade desejada de livro: ");
        int qtdEmprestado = input.nextInt();
        
        if ((usuario instanceof Aluno) &&
            ((qtdEmprestado + usuario.getQtdLivros()) 
                > Aluno.getMaxLivros()))
        {
            System.out.println("Quantidade maxima de livros para aluno excedidia!");
            return;
        }
        else if ((qtdEmprestado + usuario.getQtdLivros()) 
            > Professor.getMaxLivros()) 
        {
            System.out.println("Quantidade maxima de livros para professor excedidia!");
            return;   
        }

        if (livroAlvo.temEstoque(qtdEmprestado)) 
        {
            Emprestimo novoEmprestimo = new Emprestimo();
            novoEmprestimo.pegarLivro(cpf, livroAlvo, qtdEmprestado, titulo);
            emprestimos.add(novoEmprestimo);
            System.out.println("Empréstimo realizado com sucesso para: " + usuario.getNome());
        } 
        else
            System.out.println("Quantidade exedeu estoque!");
    }

    public void devolverEmprestimo() {
        System.out.print("Informe o id do emprestimo a ser devolvido: ");
        int id = input.nextInt();
        Emprestimo e = Buscador.buscaEmprestimo(id, emprestimos);

        if (e != null && e.getAtivo()) 
        {
            e.devolverLivro("00/00/0000");
        }
        else
            System.out.println("Empréstimo ativo não encontrado para este id.");
    }

    public void listarUsuarios() 
    {
        System.out.println("\n--- Lista de Usuários ---");
        if (usuarios.isEmpty()) 
        {
            System.out.println("Nenhum usuário cadastrado.");
        } 
        else 
        {
            for (Usuario u : usuarios) 
            {
                u.exibirDados();
            }
        }
    }

    public void listarLivros() 
    {
        System.out.println("\n--- Acervo da Biblioteca ---");
        if (livros.isEmpty()) 
            System.out.println("Nenhum livro no acervo.");
        else 
        {
            for (Livro l : livros) 
            {
                l.exibirDados();
            }
        }
    }

    public void listarEmprestimos() 
    {
        System.out.println("\n--- Histórico de Empréstimos ---");

        if (emprestimos.isEmpty()) 
        {
            System.out.println("Nenhum empréstimo registrado.");
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
            }
        }
    }
}