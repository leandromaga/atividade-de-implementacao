package factoryMethod;

public class TransporteMaritimo implements ITransporte{
    @Override
    public double calcularCusto(double distancia) {
        double custo = distancia * 0.05;
        System.out.println("Custo do transporte marítimo: " + custo);
        return custo;
    }
}
