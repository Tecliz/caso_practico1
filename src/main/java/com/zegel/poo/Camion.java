package com.zegel.poo;

public class Camion extends Vehiculo {
    private double toneladas;

    public Camion(String marca, String modelo, double toneladas) {
        super(marca, modelo);
        this.toneladas = toneladas;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("🚛 Camión " + marca + " acelera lento por su peso. Velocidad: " + velocidad);
    }
}