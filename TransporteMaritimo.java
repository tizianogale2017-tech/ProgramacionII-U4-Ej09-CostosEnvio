package Ejercicio9_CostosEnvio;

public class TransporteMaritimo extends Transportista {
    private static final double POR_KG = 30;
    private static final double POR_KM = 0.5;
    private static final double PESO_MINIMO_KG = 50;

    public TransporteMaritimo() {
        super("Transporte Marítimo", 8000);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        // La carga marítima se cobra como mínimo por 50 kg.
        double pesoFacturable = Math.max(pesoKg, PESO_MINIMO_KG);
        return getTarifaBase() + pesoFacturable * POR_KG + distanciaKm * POR_KM;
    }
}
