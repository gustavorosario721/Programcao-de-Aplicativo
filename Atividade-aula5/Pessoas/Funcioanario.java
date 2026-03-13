public class Funcioanario extends Pessoa
{
    private String cargo;

    Funcioanario(String nome, int idade, String cargo)
    {
        super(nome, idade);
        this.cargo = cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }

    public String getCargo() 
    {
        return this.cargo;
    }
}
