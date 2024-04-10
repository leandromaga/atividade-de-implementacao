package flyweight;

public class Main {
    public static void main(String[] args) {
        Imagem imagem1 = new Imagem();
        Imagem imagem2 = new Imagem();


        imagem1.aplicarFiltro("brilho", 0.5);
        imagem2.aplicarFiltro("brilho", 0.5);
        imagem1.aplicarFiltro("teste", 1.0);

        imagem1.aplicarFiltro("contraste", 1.2);
        imagem2.aplicarFiltro("contraste", 1.2);

    }
}
