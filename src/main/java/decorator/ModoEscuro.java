package decorator;

public class ModoEscuro extends UsuarioDecorator {

    public ModoEscuro(Usuario usuario) {
        super(usuario);
    }

    public String getEfeitoPersonalizacao() {
        return "Escurecer elementos";
    }

    public String getNomePersonalizacao() {
        return "Modo Escuro";
    }

}
