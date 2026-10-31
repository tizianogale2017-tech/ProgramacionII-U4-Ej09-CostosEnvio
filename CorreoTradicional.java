package Ejercicio9_CostosEnvio;

public class CorreoTradicional extends Transportista {
    private static final double POR_KG = 120;
    private static final double POR_KM = 2;

    public CorreoTradicional() {
        super("Correo Tradicional", 1500);
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        return getTarifaBase() + pesoKg * POR_KG + distanciaKm * POR_KM;
    }
}
