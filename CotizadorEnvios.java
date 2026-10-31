package Ejercicio9_CostosEnvio;

public class CotizadorEnvios {
    public double cotizar(Transportista transportista, double pesoKg, double distanciaKm) {
        return transportista.calcularCostoEnvio(pesoKg, distanciaKm);
    }

    public void compararOpciones(Transportista[] opciones, double pesoKg, double distanciaKm) {
        for (Transportista t : opciones) {
            System.out.printf("%-20s -> $ %,10.2f%n", t.getNombre(), cotizar(t, pesoKg, distanciaKm));
        }
    }
}
