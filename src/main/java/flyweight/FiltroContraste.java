package flyweight;

public class FiltroContraste implements IFiltro{
    private double valor;

    public FiltroContraste(double valor) {
        this.valor = valor;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando filtro de contraste com valor " + valor);
    }
}
