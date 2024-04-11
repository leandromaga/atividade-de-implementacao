package factoryMethod;

public class TransporteRodoviario implements ITransporte{
    @Override
    public double calcularCusto(double distancia) {
        double custo = distancia * 0.1;
        System.out.println("Custo do transporte rodoviário: " + custo);
        return custo;
    }
}
