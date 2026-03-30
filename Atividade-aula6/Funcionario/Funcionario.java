public class Funcionario
{
    private String nome;
    private double salarioAnual;

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setSalario(double salario) 
    {
        this.salarioAnual = salario;
    }

    public double getSalario() 
    {
        return salarioAnual;
    }

    public double calcularSalario()
    {
        return salarioAnual / 12;
    }
}