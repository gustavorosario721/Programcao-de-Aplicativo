public class Aluno 
{
    private String nome;
    private double[] notas = new double[3];

    public Aluno()
    {

    }

    public Aluno(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNotas(double[] notas)
    {
        for (double elemento : notas)
        {
            if (elemento < 0 || elemento > 10)
            {
                System.out.printf("Valor %.2f invalido", elemento);
                return;
            }
        }

        for (int i = 0; i < notas.length; i++)
        {
            this.notas[i] = notas[i];
        }
    }

    public double[] getNotas()
    {
        return this.notas;
    }

    public void calcularMedia()
    {
        double media;
        double total = 0;
        for (double elemento : notas)
        {
            total += elemento;
        }

        media = total / notas.length;

        System.out.println("Aluno " + getNome());
        System.out.println("Total das notas armazenadas " + total);
        System.out.printf("Media do aluno %.2f", media);

        if (resultado(media))
            System.out.println("Aluno aprovado");
        else
            System.out.println("Aluno reprovado!");
    }

    public boolean resultado(double media)
    {
        if (media >= 7)
            return true;
        else
            return false;
    }
}