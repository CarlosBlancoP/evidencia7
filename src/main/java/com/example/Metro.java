package com.example;

// Metro.java
public class Metro extends TransportePublico {
    private int numeroEstaciones;

    public Metro(String tipo, String ruta, int numeroEstaciones, double distanciaRecorrida, int tiempoRecorrido) {
        super(tipo, ruta);
        this.numeroEstaciones = numeroEstaciones;
        this.distanciaRecorrida = distanciaRecorrida;
        this.tiempoRecorrido = tiempoRecorrido;
    }

    public double calcularTarifaMetro() {
        // Ejemplo: tarifa = 2500 fijo sin importar estaciones
        tarifa = 2500;
        return tarifa;
    }

    public void mostrarMapa() {
        System.out.println("Mapa de ruta del metro:");
        System.out.println("Ruta: " + ruta + ", Estaciones: " + numeroEstaciones);
    }
}

