package com.zegel.poo;

public abstract class MetodoPago {

    String titular;

    MetodoPago() {
    }
    
    MetodoPago(String titular) {
        this.titular = titular;
    }
    
    public abstract void procesarPago(double monto);

}
