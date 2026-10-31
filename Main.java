package Ejercicio9_CostosEnvio;

public class Main {
    public static void main(String[] args) {
        CotizadorEnvios cotizador = new CotizadorEnvios();
        Transportista[] opciones = {new CorreoTradicional(), new EnvioExpressAereo(), new TransporteMaritimo()};

        System.out.println("Paquete de 8 kg a 1200 km:");
        cotizador.compararOpciones(opciones, 8, 1200);

        try {
            cotizador.cotizar(opciones[0], -3, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
