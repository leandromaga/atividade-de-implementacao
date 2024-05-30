package memento;

public class ConfiguracaoEstadoTemaEscuro implements ConfiguracaoEstado{

    private ConfiguracaoEstadoTemaEscuro() {
    }

    private static ConfiguracaoEstadoTemaEscuro instance = new ConfiguracaoEstadoTemaEscuro();

    public static ConfiguracaoEstadoTemaEscuro getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Escuro";
    }



}
