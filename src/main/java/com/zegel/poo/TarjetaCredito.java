package com.zegel.poo;

public class TarjetaCredito extends MetodoPago {

    private String numeroTarjeta;
    private String fechaVencimiento;

    TarjetaCredito() {
    }

    public TarjetaCredito(String titular, String numeroTarjeta, String fechaVencimiento) {
        super(titular);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por monto: " + monto);
    }

    // Getters y setters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

}
