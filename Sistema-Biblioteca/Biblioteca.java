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

    public Disciplina selecionarDisciplina()
    {
        Disciplina d;
        Disciplina.listarDisciplinas();
        byte op = input.nextByte();
        input.nextLine();
        switch (op) 
        {
            case 1:
                d = Disciplina.values()[op - 1];
                break;
            case 2:
                d = Disciplina.values()[op - 1];
                break;
            case 3:
                d = Disciplina.values()[op - 1];
                break;
            case 4:
                d = Disciplina.values()[op - 1];
                break;
            default:
                System.out.println("\n\t\t!Opção inválida!\n");
                d = null;
                break;
        }

        return d;
    }

    public void recomendarLivro(Professor professor)
    {
        System.out.println("---------- Livros Recomendados ----------");
        for (Livro l : livros) 
        {
            if (l.getDisciplina().equals(professor.getDisciplina()))
            {
                l.exibirDados();
                System.out.println("----------------------------------------");
            }
        }
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
            System.out.print("Informe o CPF no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("\n\t\t!CPF formatado errado! Tente novamente!\n");
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
                System.out.println("\n\t\t!Matricula formatada errada! Tente novamente!\n");
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
        {
            System.out.println("\n\t\t!Informe outro CPF e outra Matricula!\n");
        }

        System.out.println("\n\t\tAluno cadastrado com sucesso!\n");
        System.out.println("----------------------------------------");
    }

    public void cadastrarProfessor()
    {
        boolean cpfValido;
        String nome;
        String cpf;
        Disciplina d;

        System.out.println("---------- Cadastro de Professor ----------");
        System.out.print("Informe o nome do Professor: ");
        nome = input.nextLine();

        do
        {
            System.out.print("Informe o CPF do professor no formato 000.000.000-00: ");
            cpf = input.nextLine();
            cpfValido = Validador.cpfFormatoValido(cpf);
            if (!cpfValido)
            {
                System.out.println("\n\t\t!CPF formatado errado! Tente novamente!\n");
                continue;
            }

            Usuario c = Buscador.buscarCpf(cpf, usuarios);
            if (c == null)
                cpfValido = true;
            else
            {
                System.out.println("\n\t\t!Informe outro CPF!\n");
                cpfValido = false;
                continue;
            }
        }
        while (!cpfValido);

        do
        {
            System.out.println("---------- Disciplinas ----------");
            System.out.println("Escolha a disciplina a ser atribuida: ");
            d = selecionarDisciplina();
        } while (d == null);

        Professor p = new Professor();
        p.cadastrarProfessor(nome, cpf, d);
        usuarios.add(p);
        System.out.println("\nProfessor cadastrado com sucesso!\n");
        System.out.println("----------------------------------------");
    }


    public void cadastrarLivro() {
        Disciplina d;
        int qtdTotal;

        System.out.println("---------- Cadastro de Livro ----------");
        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        System.out.print("Informe o autor do livro: ");
        String autor = input.nextLine();

        do 
        {
            System.out.println("Informe a quantidade total de livro");
            qtdTotal = input.nextInt();
            input.nextLine();

            if (qtdTotal <= 0)
                System.out.println("\n\t\t!Informe uma quantidade não nula e positiva!\n");
        } 
        while (qtdTotal <= 0);
        
        do
        {   
            System.out.println("---------- Disciplinas ----------");
            System.out.println("Escolha a disciplina a ser atribuida: ");
            d = selecionarDisciplina();
        } 
        while (d == null);

        Livro novoLivro = new Livro();
        novoLivro.cadastrarLivro(titulo, autor, d, qtdTotal);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!\n");
        System.out.println("----------------------------------------");
    }

    public void realizarEmprestimo() 
    {
        if (usuarios.isEmpty())
            System.out.println("\n\t\t!Sem usuario cadastrado!");
        else if (livros.isEmpty())
            System.out.println("\n\t\t!Sem livro cadastrado!");

        System.out.println("---------- Realizar Emprestimo ----------");
        System.out.print("Informe o CPF do usuário: ");
        String cpf = input.nextLine();
        Usuario usuario = Buscador.buscarCpf(cpf, usuarios);

        if (usuario == null) {
            System.out.println("\n\t\t!Usuário não encontrado!\n");
            System.out.println("----------------------------------------");
            return;
        }

        if (usuario instanceof Professor) 
        {
            Professor p = (Professor) usuario;
            recomendarLivro(p);
        }

        listarLivros();

        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        Livro livroAlvo = Buscador.buscarLivro(titulo, livros);

        if (livroAlvo == null)
        {
            System.out.println("\n\t\t!Livro não encontrado!\n");
            System.out.println("----------------------------------------");
            return;
        }

        System.out.println("Quantidade livre: " + livroAlvo.getQtdLivre());
        System.out.printf("Quantidade maxima de livros para\nProfessor: %d\nAluno: %d\n", Professor.getMaxLivros(), Aluno.getMaxLivros());
        System.out.println("Quantidade de livros em posse do usuario: " + usuario.getQtdLivros());
        System.out.print("Informe a quantidade desejada de livro: ");
        byte qtdEmprestado = input.nextByte();
        input.nextLine();
        
        if ((usuario instanceof Aluno) &&
            ((qtdEmprestado + usuario.getQtdLivros()) 
                > Aluno.getMaxLivros()))
        {
            System.out.println("\n\t\t!Quantidade maxima de livros para aluno excedidia!\n");
            System.out.println("----------------------------------------");
            return;
        }
        else if ((qtdEmprestado + usuario.getQtdLivros()) 
            > Professor.getMaxLivros()) 
        {
            System.out.println("\n\t\tQuantidade maxima de livros para professor excedidia!\n");
            System.out.println("----------------------------------------");
            return;   
        }

        if (livroAlvo.temEstoque(qtdEmprestado)) 
        {
            Emprestimo novoEmprestimo = new Emprestimo();
            novoEmprestimo.pegarLivro(usuario, livroAlvo, qtdEmprestado, titulo);
            emprestimos.add(novoEmprestimo);
            usuario.pegarLivro(qtdEmprestado);
            System.out.printf("Empréstimo realizado com sucesso para: %s\n", usuario.getNome());
        } 
        else
            System.out.println("\n\t\t!Quantidade exedeu estoque!\n");
        System.out.println("----------------------------------------");
    }

    public void devolverEmprestimo() 
    {
        System.out.println("---------- Devolver Emprestimo ----------");
        System.out.print("Informe o id do emprestimo a ser devolvido: ");
        int id = input.nextInt();
        input.nextLine();
        Emprestimo e = Buscador.buscaEmprestimo(id, emprestimos);

        if (e != null && e.getAtivo()) 
        {
            e.devolverLivro("00/00/0000");
            System.out.println("Emprestimo devolvido com sucesso!\n");
        }
        else
            System.out.println("\n\t\tEmpréstimo ativo não encontrado para este id!\n");
        System.out.println("----------------------------------------");
    }

    public void listarUsuarios() 
    {
        System.out.println("\n---------- Lista de Usuários ----------");
        if (usuarios.isEmpty()) 
        {
            System.out.println("\n\t\tNenhum usuário cadastrado.\n");
            System.out.println("----------------------------------------");
        } 
        else 
        {
            for (Usuario u : usuarios) 
            {
                u.exibirDados();
                System.out.println("----------------------------------------");
            }
        }
    }

    public void listarLivros() 
    {
        System.out.println("\n---------- Acervo da Biblioteca ----------");
        if (livros.isEmpty())
        {
            System.out.println("\n\t\tNenhum livro no acervo.\n");
            System.out.println("----------------------------------------");
        }
        else 
        {
            for (Livro l : livros) 
            {
                l.exibirDados();
                System.out.println("----------------------------------------");
            }
        }
    }

    public void listarEmprestimos() 
    {
        System.out.println("\n---------- Histórico de Empréstimos ----------");

        if (emprestimos.isEmpty()) 
        {
            System.out.println("\n\t\tNenhum empréstimo registrado.\n");
            System.out.println("----------------------------------------");
        } 
        else 
        {
            for (Emprestimo e : emprestimos) 
            {
                Usuario u = Buscador.buscarCpf(e.getUsuario().getCpf(), usuarios);
                String status = e.getAtivo() ? "Ativo" : "Devolvido";
                System.out.println("ID: " + e.getId());
                System.out.println("Livro: " + e.getLivro().getTitulo());
                System.out.println("Quantidade: " + e.getQtdEmprestado());
                System.out.println("Usuário: " + u.getNome());
                System.out.println("Status: " + status);
                System.out.println("----------------------------------------");
            }
        }
    }
}