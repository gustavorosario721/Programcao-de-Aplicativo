public class AccountTest 
{
    public static void main(String args[])
    {
        Account account1 = new Account("294294", "Obama", 1000);
        
        System.out.println("Saldo atual: " + account1.getSaldo());

        account1.deposito(-3904);
        System.out.println("Saldo atual: " + account1.getSaldo());

        account1.deposito(1000);
        System.out.println("Saldo atual: " + account1.getSaldo());

        account1.sacar(256);
        System.out.println("Saldo atual: " + account1.getSaldo());
    }    
}
