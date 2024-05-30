package memento;

public class ConfiguracaoEstadoIdiomaPortugues implements ConfiguracaoEstado{

    private ConfiguracaoEstadoIdiomaPortugues() {
    }

    private static ConfiguracaoEstadoIdiomaPortugues instance = new ConfiguracaoEstadoIdiomaPortugues();

    public static ConfiguracaoEstadoIdiomaPortugues getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Salvo";
    }
}
