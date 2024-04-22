package decorator;

public class UsuarioBase implements Usuario{

    public String interfaceUsuario;

    public UsuarioBase() {
    }

    public UsuarioBase(String interfaceUsuario) {
        this.interfaceUsuario = interfaceUsuario;
    }

    public String getInterfaceUsuario() {
        return interfaceUsuario;
    }

    public String getPersonalizacao() {
        return "Interface padrão";
    }



}
