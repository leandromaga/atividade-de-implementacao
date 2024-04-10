package flyweight;

public class FiltroBrilho implements IFiltro{
    private final double valor;

    public FiltroBrilho(double valor) {
        this.valor = valor;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando filtro de brilho com valor " + valor);
    }
}
