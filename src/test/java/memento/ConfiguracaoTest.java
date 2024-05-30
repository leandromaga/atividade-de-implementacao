package memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfiguracaoTest {

    @Test
    public void deveArmazenarEstados() {
        Configuracao configuracao = new Configuracao();
        configuracao.setEstado(ConfiguracaoEstadoTemaClaro.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoIdiomaIngles.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoTemaEscuro.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoIdiomaPortugues.getInstance());
        assertEquals(4, configuracao.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Configuracao configuracao = new Configuracao();
        configuracao.setEstado(ConfiguracaoEstadoTemaClaro.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoIdiomaIngles.getInstance());
        configuracao.restaurarEstado(0);
        assertEquals(ConfiguracaoEstadoTemaClaro.getInstance(), configuracao.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Configuracao configuracao = new Configuracao();
        configuracao.setEstado(ConfiguracaoEstadoTemaClaro.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoIdiomaIngles.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoTemaClaro.getInstance());
        configuracao.setEstado(ConfiguracaoEstadoIdiomaIngles.getInstance());
        configuracao.restaurarEstado(2);
        assertEquals(ConfiguracaoEstadoTemaClaro.getInstance(), configuracao.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Configuracao configuracao = new Configuracao();
            configuracao.restaurarEstado(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
