package com.zegel.poo;

public class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public void verPerfil() {
        System.out.println("Nombre: " + nombre + " | Email: " + email);
    }

    protected void cambiarPassword(String nueva) {
        this.password = nueva;
        System.out.println("Contraseña cambiada correctamente.");
    }
}