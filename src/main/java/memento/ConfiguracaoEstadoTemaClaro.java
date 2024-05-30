package memento;

public class ConfiguracaoEstadoTemaClaro implements ConfiguracaoEstado{

    private ConfiguracaoEstadoTemaClaro() {
    }

    private static ConfiguracaoEstadoTemaClaro instance = new ConfiguracaoEstadoTemaClaro();

    public static ConfiguracaoEstadoTemaClaro getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Simples";
    }
}
