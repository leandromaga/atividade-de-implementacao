package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaFiltro {
    private static final Map<String, IFiltro> filtros = new HashMap<>();

    public static IFiltro obterFiltro(String nome, double valor) {
        String chave = nome + "_" + valor;
        IFiltro filtro = filtros.get(chave);
        if (filtro == null) {
            filtro = new FiltroQualquer(nome, valor);
            filtros.put(chave, filtro);
        }
        return filtro;
    }
    public static int getTotalFiltros() {
        return filtros.size();
    }
}
