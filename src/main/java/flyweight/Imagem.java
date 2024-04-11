package flyweight;

import static flyweight.FabricaFiltro.obterFiltro;

public class Imagem {
    public void aplicarFiltro(String nome, double valor) {
        IFiltro filtro = obterFiltro(nome, valor);
        filtro.aplicar();
    }
}
