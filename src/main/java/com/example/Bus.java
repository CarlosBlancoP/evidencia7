package com.example;

// Bus.java
public class Bus extends TransportePublico {
    private int capacidad;

    public Bus(String tipo, String ruta, int capacidad, double distanciaRecorrida, int tiempoRecorrido) {
        super(tipo, ruta);
        this.capacidad = capacidad;
        this.distanciaRecorrida = distanciaRecorrida;
        this.tiempoRecorrido = tiempoRecorrido;
    }

    public double calcularTarifaBus() {
        // Ejemplo: tarifa = base + 100 por cada km
        tarifa = 2000 + (distanciaRecorrida * 100);
        return tarifa;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ruta: " + ruta);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Distancia: " + calcularDistanciaRecorrida() + " km");
        System.out.println("Tiempo: " + calcularTiempoRecorrido() + " minutos");
        System.out.println("Tarifa: $" + calcularTarifaBus());
    }
}
