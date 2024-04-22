package decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class interfaceUsuarioTest {

    @Test
    void deveRetornarInterfaceUsuarioBase() {
        Usuario usuario = new UsuarioBase("Interface Base");
        assertEquals("Interface Base", usuario.getInterfaceUsuario());
    }


}
