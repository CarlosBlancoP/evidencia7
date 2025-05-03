package com.example;

// TransportePublico.java
public class TransportePublico {
    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido; // en minutos

    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public double calcularTarifa() {
        // Tarifa base genérica (puede ser sobreescrita o extendida)
        return tarifa;
    }

    public double calcularDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        return tiempoRecorrido;
    }
}

