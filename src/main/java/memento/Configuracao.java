package memento;

import java.util.ArrayList;
import java.util.List;

public class Configuracao {

    private ConfiguracaoEstado estado;

    private List<ConfiguracaoEstado> memento = new ArrayList<>();

    public ConfiguracaoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ConfiguracaoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restaurarEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ConfiguracaoEstado> getEstados() {
        return this.memento;
    }






}
