public class Main 
{
    public static void main(String[] args) 
    {
        Funcioanario f1 = new Funcioanario("Jeovane", 30, "Professor");
        f1.exibirDados();
        System.out.println("Cargo: " + f1.getCargo());

        System.out.println();

        Cliente c1 = new Cliente("Gustavo", 19, "dkadkajdk@dfa.com");
        c1.exibirDados();
        System.out.println("Email: " + c1.getEmail());
    }
}
