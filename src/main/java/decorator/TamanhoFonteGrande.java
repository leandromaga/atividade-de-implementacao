package decorator;

public class TamanhoFonteGrande extends UsuarioDecorator{

    public TamanhoFonteGrande(Usuario usuario) {
        super(usuario);
    }

    public String getEfeitoPersonalizacao() {
        return "Fonte grande";
    }

    public String getNomePersonalizacao() {
        return "Tamanho da fonte";
    }



}
