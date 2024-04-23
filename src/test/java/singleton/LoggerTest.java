package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {


    @Test
    public void deveRetornarId1() {
        assertEquals("1", LoggerAplicacao.getInstance().getId());
    }

    @Test
    public void deveRetornarHoraAtual() {
        assertEquals(LoggerAplicacao.getInstance().getHora(), LoggerAplicacao.getInstance().getHora());
    }

    @Test
    public void deveRetornarDescricaoErro() {
        LoggerAplicacao.getInstance().setDescricao("Erro");
        assertEquals("Erro", LoggerAplicacao.getInstance().getDescricao());
    }

    @Test
    public void loggerSingleton() {
        assertNotNull(LoggerAplicacao.getInstance());
    }

    @Test
    public void loggerDestroyer() {
        assertNull(LoggerAplicacao.getInstance().loggerDestroyer());
    }

    @Test
    public void deveSalvarLogNoSistema() {
        LoggerAplicacao.getInstance().salvarLogNoSistema("logSingleton.txt");
    }



}
