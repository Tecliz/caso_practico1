package com.zegel.ia;

import java.util.Arrays;
import java.util.List;

public class ProcesadorDatos {

    public static void main(String[] args) {
        // Crear lista de productos
        var productos = Arrays.asList(
                new Producto("Laptop", 1200.00),
                new Producto("Mouse", 25.00),
                new Producto("Teclado", 75.00),
                new Producto("Monitor", 350.00),
                new Producto("Auriculares", 45.00),
                new Producto("Webcam", 120.00)
        );

        System.out.println("=== PRODUCTOS ORIGINALES ===");
        productos.forEach(System.out::println);

        System.out.println("\n=== PROCESAMIENTO CON STREAMS ===");
        procesarProductosConStreams(productos);

        System.out.println("\n=== COMPARACIÓN: SIN STREAMS ===");
        procesarProductosSinStreams(productos);
    }

    // Método con Streams (recomendado)
    public static void procesarProductosConStreams(List<Producto> productos) {
        var totalConDescuento = productos.stream()
                .filter(p -> p.getPrecio() > 50)                    // Filtrar productos > $50
                .map(p -> p.getPrecio() * 0.90)                     // Aplicar descuento del 10%
                .mapToDouble(Double::doubleValue)                   // Convertir a DoubleStream
                .sum();                                              // Obtener total

        System.out.println("Productos filtrados (> $50) con descuento del 10%:");
        productos.stream()
                .filter(p -> p.getPrecio() > 50)
                .forEach(p -> {
                    var precioConDescuento = p.getPrecio() * 0.90;
                    System.out.printf("  %s: $%.2f → $%.2f%n",
                            p.getNombre(), p.getPrecio(), precioConDescuento);
                });

        System.out.printf("Total final con descuento: $%.2f%n", totalConDescuento);
    }

    // Método sin Streams (enfoque tradicional)
    public static void procesarProductosSinStreams(List<Producto> productos) {
        double totalConDescuento = 0.0;

        System.out.println("Productos filtrados (> $50) con descuento del 10%:");
        for (Producto p : productos) {
            if (p.getPrecio() > 50) {
                double precioConDescuento = p.getPrecio() * 0.90;
                System.out.printf("  %s: $%.2f → $%.2f%n",
                        p.getNombre(), p.getPrecio(), precioConDescuento);
                totalConDescuento += precioConDescuento;
            }
        }

        System.out.printf("Total final con descuento: $%.2f%n", totalConDescuento);
    }
}
