package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaFiltro {
    private static final Map<String, IFiltro> filtros = new HashMap<>();

    public static IFiltro obterFiltro(String tipo, double valor) {
        String chave = tipo + "_" + valor;
        IFiltro filtro = filtros.get(chave);
        if (filtro == null) {
            switch (tipo) {
                case "brilho":
                    filtro = new FiltroBrilho(valor);
                    break;
                case "contraste":
                    filtro = new FiltroContraste(valor);
                    break;

                default:
                    throw new IllegalArgumentException("Tipo de filtro desconhecido: " + tipo);
            }
            filtros.put(chave, filtro);
        }
        return filtro;
    }
}
