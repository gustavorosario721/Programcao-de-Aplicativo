public class Car 
{
    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Car()
    {
        this.marca = "Generica";
        this.velocidadeMaxima = 200;
        this.velocidadeAtual = 0;
    }

    public Car(String marca, int velocidadeMaxima)
    {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor)
    {
        if (valor >= 0 && (valor + velocidadeAtual) <= velocidadeMaxima)
        {
            this.velocidadeAtual += valor;
        }
        else
            System.out.println("Aceleração excedeu a velocidade máxima");
    }

    public void frear(int valor)
    {
        if (valor >= 0 && valor <= velocidadeAtual)
            this.velocidadeAtual -= valor;
        else
            System.out.println("Valor de frenagem excedeu a velecidade atual");
    }

    public int getVelocidadeAtual()
    {
        return this.velocidadeAtual;
    }

    public int getVelocidadeMaxima()
    {
        return this.velocidadeMaxima;
    }
}
