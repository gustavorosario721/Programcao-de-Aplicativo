import java.util.List;

public class Buscador 
{
    public static Usuario buscarCpf(String cpf, List<Usuario> usuarios)
    {
        for (Usuario c : usuarios) 
        {
            if (c.getCpf().equals(cpf))
                return c;
        }

        return null;
    }

    public static Aluno buscarMatricula(String matricula, List<Usuario> usuarios)
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

    public static Livro buscarLivro(String titulo, List<Livro> livros)
    {
        for (Livro l : livros)
        {
            if (l.getTitulo().equalsIgnoreCase(titulo))
                return l;
        }
        return null;
    }

    public static Emprestimo buscaEmprestimo(int id, List<Emprestimo> emprestimos)
    {
        for (Emprestimo emprestimo : emprestimos) 
        {
            if (emprestimo.getId() == id) 
                return emprestimo;   
        }

        return null;
    }
}
