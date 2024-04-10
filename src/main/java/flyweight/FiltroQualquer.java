package flyweight;

public class FiltroQualquer implements IFiltro{
    private final String nome;
    private final double valor;

    public FiltroQualquer(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando filtro: " + nome + " com valor: " + valor);
    }
}
