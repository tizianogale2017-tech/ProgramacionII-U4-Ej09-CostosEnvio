package Ejercicio9_CostosEnvio;

public abstract class Transportista {
    private final String nombre;
    private final double tarifaBase;

    protected Transportista(String nombre, double tarifaBase) {
        if (nombre == null || nombre.isBlank() || tarifaBase < 0) {
            throw new IllegalArgumentException("Transportista inválido");
        }
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCostoEnvio(double pesoKg, double distanciaKm);

    protected void validar(double pesoKg, double distanciaKm) {
        if (pesoKg <= 0 || distanciaKm <= 0) {
            throw new IllegalArgumentException("Peso y distancia deben ser positivos");
        }
    }

    public String getNombre() { return nombre; }
    public double getTarifaBase() { return tarifaBase; }
}
