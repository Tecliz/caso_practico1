package com.zegel.poo;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }
}