package com.zegel.poo;

public class Admin extends Usuario {

    public Admin(String nombre, String email, String password) {
        super(nombre, email, password);
    }

    public void resetearPassword(String nueva) {
        cambiarPassword(nueva);
    }
}