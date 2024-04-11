package factoryMethod;

public class TransporteAereo implements ITransporte{
    @Override
    public double calcularCusto(double distancia) {
        double custo = distancia * 0.2;
        System.out.println("Custo do transporte aéreo: " + custo);
        return custo;
    }
}
