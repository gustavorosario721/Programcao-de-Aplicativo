public class Account
{
    private String numeroConta;
    private String titular;
    private double saldo;

    public Account()
    {
    }

    public Account(String numeroConta, String titular, double saldo)
    {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double valor)
    {
        if (valor > 0)
        {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        }
        else
            System.out.println("Valor invalido! Deposito não realizado");
    }

    public void sacar(double valor)
    {
        if (valor < this.saldo)
        {
            int valorInt = (int) valor;

            System.out.println("Notas de 100: " + (valorInt / 100));
            valorInt %= 100;

            System.out.println("Notas de 50: " + (valorInt / 50));
            valorInt %= 50;

            System.out.println("Notas de 20: " + (valorInt / 20));
            valorInt %= 20;

            System.out.println("Notas de 10: " + (valorInt / 10));
            valorInt %= 10;

            System.out.println("Notas de 5: " + (valorInt / 5));
            valorInt %= 5;

            System.out.println("Notas de 2: " + (valorInt / 2));
            valorInt %= 2;

            System.out.println("Notas de 1: " + valorInt / 1);
            valorInt %= 1;

            System.out.println("Saque executado com sucesso!");
            this.saldo -= valor;
        }
        else
        {
            System.out.println("Valor de saque invalido!");
        }
    }

    public double getSaldo()
    {
        return this.saldo;
    }
}