package com.zegel;

import com.zegel.collections.CalculadorEcommerce;
import com.zegel.collections.HashEjemplos;
import com.zegel.collections.ListasEjemplo;
import com.zegel.poo.*;
import com.zegel.ia.ProcesadorDatos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String name = "Zegel";
        int edad = 0;
        int peso = 50;
        boolean isStudent = false;
        double height = 0.0;
        edad = edad + 1;
        edad++;
        edad--;
        edad -= 2;
        edad = edad - 1;
        int x = 5;
        int y = x > 5 ? 200 : 30;
        System.out.println("Hello " + name);
        System.out.println("edad: " + edad);
        System.out.println("Peso: " + String.valueOf(peso));
        System.out.println("Is student: " + isStudent);
        System.out.println("Height: " + height);
        System.out.println("Peso: " + (peso + edad));
        System.out.println("Es mayor de edad: " + (edad >= 18));
        if (name != "Zegel" && edad > 18) {
            System.out.println("Hola Zegel");
        } else {
            System.out.println("Hola desconocido");
        }
        if (name != "Zegel" && edad > 18) {
            System.out.println("Hola Zegel");
        } else if (isStudent) {
            System.out.println("Hola estudiante");
        } else {
            System.out.println("Hola desconocido");
        }
        switch (name) {
            case "Zegel":
            case "Juan":
                System.out.println("Hola Juan");
                break;
            default:
                System.out.println("Hola desconocido");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }
        while (isStudent) {
            System.out.println("Soy estudiante");
            isStudent = false;
        }
        do {
            System.out.println("Soy estudiante");
        } while (isStudent);
        try {
            sum(1, 0, 2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        MetodoPago tarjetaCredito = new TarjetaCredito("Zegel", "1234 5678 9012 3456", "12/25");
        MetodoPago paypal = new PayPal("Zegel", "zegel@example.com");
        double monto = 100.0;
        tarjetaCredito.procesarPago(monto);
        paypal.procesarPago(monto);

        ListasEjemplo listasEjemplo = new ListasEjemplo();
        listasEjemplo.imprimirDiasSemana();
        listasEjemplo.agregarProductos();
        listasEjemplo.imprimirProductosInicienConLetra("M");
        listasEjemplo.imprimirProductosInicienConLetraStream("M");

        HashEjemplos hashEjemplos = new HashEjemplos();
        hashEjemplos.agregarUsuario();
        hashEjemplos.imprimirUsuariosConectados();
        hashEjemplos.agregarProducto();
        hashEjemplos.imprimirProductos();
        hashEjemplos.imprimirProductosMas10PorcientePrecioStream();

        CalculadorEcommerce calculadorEcommerce = new CalculadorEcommerce();
        calculadorEcommerce.procesarVenta("PE");
        calculadorEcommerce.procesarVenta("US");
        calculadorEcommerce.procesarVenta("EU");

        System.out.println("\n--- EJEMPLO DE STREAMS (IA) ---");
        System.out.println("Ejecuta: java -cp target/classes com.zegel.ia.ProcesadorDatos");

        // ========== CASO 1: VEHÍCULOS ==========
        System.out.println("\n=== Sistema de Vehículos ===");
        Vehiculo[] vehiculos = {
            new Auto("Toyota", "Corolla", 4),
            new Moto("Honda", "CBR", false),
            new Camion("Volvo", "FH16", 20.5)
        };
        for (Vehiculo v : vehiculos) {
            v.acelerar();
        }

        // ========== CASO 2: USUARIOS ==========
        System.out.println("\n=== Sistema de Usuarios ===");
        Admin admin = new Admin("Ricardo", "admin@zegel.pe", "1234");
        Cliente cliente = new Cliente("Ana", "ana@zegel.pe", "abcd");
        admin.verPerfil();
        admin.resetearPassword("nueva123");
        cliente.verPerfil();

    } 

    public int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) throws Exception {
        return a / b + c;
    }

} 