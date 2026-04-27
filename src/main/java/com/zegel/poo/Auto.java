package com.zegel.poo;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("🚗 Auto " + marca + " acelera suavemente. Velocidad: " + velocidad);
    }
}