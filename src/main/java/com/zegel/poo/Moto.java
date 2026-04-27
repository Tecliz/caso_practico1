package com.zegel.poo;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void acelerar() {
        velocidad += 40;
        System.out.println("Moto " + marca + " acelera rápido. Velocidad: " + velocidad);
    }
}