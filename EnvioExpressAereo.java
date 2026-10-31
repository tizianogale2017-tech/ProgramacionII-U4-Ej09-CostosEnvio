package Ejercicio9_CostosEnvio;

public class EnvioExpressAereo extends Transportista {
    private static final double POR_KG = 400;
    private static final double POR_KM = 6;
    private static final double RECARGO_URGENCIA = 1.25;

    public EnvioExpressAereo() {
        super("Express Aéreo", 4000);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        return (getTarifaBase() + pesoKg * POR_KG + distanciaKm * POR_KM) * RECARGO_URGENCIA;
    }
}
