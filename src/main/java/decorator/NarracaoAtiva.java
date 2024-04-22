package decorator;

public class NarracaoAtiva extends UsuarioDecorator {

    public NarracaoAtiva(Usuario usuario) {
        super(usuario);
    }

    public String getEfeitoPersonalizacao() {
        return "Narracao Ativa";
    }

    public String getNomePersonalizacao() {
        return "Narracao";
    }


}
