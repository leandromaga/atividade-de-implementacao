package flyweight;

public class Imagem {
    public void aplicarFiltro(String tipo, double valor) {
        IFiltro filtro = FabricaFiltro.obterFiltro(tipo, valor);
        filtro.aplicar();
    }
}
