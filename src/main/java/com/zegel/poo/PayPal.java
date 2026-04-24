package com.zegel.poo;

public class PayPal extends MetodoPago {

    private String email;

    PayPal() {
    }

    public PayPal(String titular, String email) {
        super(titular);
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por monto: " + monto);
    }

    // Getters y setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
