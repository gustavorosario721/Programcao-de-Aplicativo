import java.util.Scanner;

public class BibliotecaTeste 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca();
        byte op = 0;

        while (op != 0)
        {
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Realizar Emprestimo");
            System.out.println("5 - Devolver Livro");
            System.out.println("6 - Listar Usuarios");
            System.out.println("7 - Listar Livros");
            System.out.println("8 - Listar Emprestimos");
            System.out.println("0 - Sair");

            op = input.nextByte();

            switch (op) 
            {
                case 1:
                    b1.cadastrarAluno();
                    break;
                case 2:
                    b1.cadastrarProfessor();
                    break;
                case 3:
                    b1.cadastrarLivro();
                    break;
                case 4:
                    b1.realizarEmprestimo();
                    break;
                case 5:
                    b1.devolverEmprestimo();
                case 6:
                    b1.listarUsuarios();
                    break;
                case 7:
                    b1.listarLivros();
                    break;
                case 8:
                    b1.listarEmprestimos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        }
    }    
}
