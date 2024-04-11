package factoryMethod;

public class TransporteFactory {
    public static ITransporte obterTransporte(String tipo) {
        switch (tipo) {
            case "Rodoviario":
                return new TransporteRodoviario();
            case "Maritimo":
                return new TransporteMaritimo();
            case "Aereo":
                return new TransporteAereo();
            default:
                throw new IllegalArgumentException("Tipo de transporte inexistente");
        }
    }
}
