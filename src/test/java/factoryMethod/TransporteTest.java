package factoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;


public class TransporteTest {

    @Test
    public void deveRetornarExcecaoParaTransporteInexistente() {
        try {
            ITransporte transporte = TransporteFactory.obterTransporte("Trem");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de transporte inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarTransporteRodoviario() {
        ITransporte transporte = TransporteFactory.obterTransporte("Rodoviario");
        assertNotNull(transporte);
        assertEquals( 10.0, transporte.calcularCusto(100), 0.01);
    }

    @Test
    public void deveRetornarTransporteMaritimo() {
        ITransporte transporte = TransporteFactory.obterTransporte("Maritimo");
        assertNotNull(transporte);
        assertEquals(5.0, transporte.calcularCusto(100), 0.01);
    }

    @Test
    public void deveRetornarTransporteAereo() {
        ITransporte transporte = TransporteFactory.obterTransporte("Aereo");
        assertNotNull(transporte);
        assertEquals( 20.0, transporte.calcularCusto(100), 0.01);
    }
}
