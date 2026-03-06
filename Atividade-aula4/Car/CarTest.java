public class CarTest 
{
    public static void main(String args[])
    {
        Car car1 = new Car("Chevrolet", 300);
        System.out.printf("Velocidade máxima do carro: %d%n", car1.getVelocidadeMaxima());

        car1.acelerar(301);
        car1.acelerar(200);
        System.out.printf("Velocidade atual do carro: %d%n", car1.getVelocidadeAtual());

        car1.acelerar(50);
        System.out.printf("Velocidade atual do carro: %d%n", car1.getVelocidadeAtual());

        car1.frear(251);

        car1.frear(50);
        System.out.printf("Velocidade atual do carro: %d%n", car1.getVelocidadeAtual());

        car1.acelerar(100);
        car1.frear(45);
        System.out.printf("Velocidade atual do carro: %d%n", car1.getVelocidadeAtual());
    }    
}
