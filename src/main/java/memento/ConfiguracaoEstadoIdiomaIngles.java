package memento;

public class ConfiguracaoEstadoIdiomaIngles implements ConfiguracaoEstado {

    private ConfiguracaoEstadoIdiomaIngles() {
    }

    private static ConfiguracaoEstadoIdiomaIngles instance = new ConfiguracaoEstadoIdiomaIngles();

    public static ConfiguracaoEstadoIdiomaIngles getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Padrão";
    }

}
