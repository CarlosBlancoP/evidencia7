package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Bus
        Bus bus = new Bus("Bus Urbano", "Ruta 10", 40, 12.5, 35);
        bus.mostrarInformacion();
        System.out.println();

        // Metro
        Metro metro = new Metro("Metro Medellín", "Línea A", 18, 15.0, 25);
        metro.mostrarMapa();
        System.out.println("Tarifa Metro: $" + metro.calcularTarifaMetro());
        System.out.println("Tiempo: " + metro.calcularTiempoRecorrido() + " minutos");
        System.out.println();

        // Transmilenio
        Transmilenio tm = new Transmilenio("Transmilenio Bogotá", "Troncal Caracas", 20, 10.0, 30);
        tm.mostrarRuta();
        System.out.println("Tarifa Transmilenio: $" + tm.calcularTarifaTransmilenio());
        System.out.println("Distancia: " + tm.calcularDistanciaRecorrida() + " km");
    }
}
