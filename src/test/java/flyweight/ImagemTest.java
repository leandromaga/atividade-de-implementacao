package flyweight;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ImagemTest {
    @Test
    public void testAplicarFiltros() {

        Imagem imagem1 = new Imagem();
        Imagem imagem2 = new Imagem();

        imagem1.aplicarFiltro("Brilho", 0.5);
        imagem1.aplicarFiltro("Contraste", 1.2);
        imagem1.aplicarFiltro("Saturação", 0.8);

        imagem2.aplicarFiltro("Brilho", 0.5);
        imagem2.aplicarFiltro("Contraste", 1.2);
        imagem2.aplicarFiltro("Saturação", 0.8);

        assertEquals(3, FabricaFiltro.getTotalFiltros());
    }

}
