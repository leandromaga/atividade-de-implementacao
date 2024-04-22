package decorator;

public abstract class UsuarioDecorator implements Usuario{

    private Usuario usuario;

    public String personalizacao;

    public UsuarioDecorator(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract String getEfeitoPersonalizacao();

    public String getInterfaceUsuario() {
        return this.usuario.getInterfaceUsuario() + this.getEfeitoPersonalizacao();
    }

    public abstract String getNomePersonalizacao();

    public String getPersonalizacao() {
        return this.usuario.getPersonalizacao() + "/" + this.getNomePersonalizacao();
    }

    public void setPersonalizacao(String personalizacao) {
        this.personalizacao = personalizacao;
    }

}
