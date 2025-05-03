package com.example;

// Transmilenio.java
public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    public Transmilenio(String tipo, String ruta, int numeroParadas, double distanciaRecorrida, int tiempoRecorrido) {
        super(tipo, ruta);
        this.numeroParadas = numeroParadas;
        this.distanciaRecorrida = distanciaRecorrida;
        this.tiempoRecorrido = tiempoRecorrido;
    }

    public double calcularTarifaTransmilenio() {
        // Ejemplo: tarifa fija + 50 por cada parada
        tarifa = 2200 + (numeroParadas * 50);
        return tarifa;
    }

    public void mostrarRuta() {
        System.out.println("Ruta del Transmilenio:");
        System.out.println("Ruta: " + ruta + ", Paradas: " + numeroParadas);
    }
}

