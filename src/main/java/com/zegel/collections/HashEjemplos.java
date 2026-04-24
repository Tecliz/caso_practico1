package com.zegel.collections;

import java.util.*;

public class HashEjemplos {

    // no permite elementos duplicados
    Set<Integer> usuariosConectados = new HashSet<>();
    public void agregarUsuario() {
        usuariosConectados.add(100);
        usuariosConectados.add(200);
        usuariosConectados.add(300);
        usuariosConectados.add(100);//ignorado
    }
    public void imprimirUsuariosConectados() {
        System.out.println(usuariosConectados.stream().count());
    }

    Map<String, Double> productosPrecios = new HashMap<>();
    public void agregarProducto() {
        productosPrecios.put("Manzana", 0.5);
        productosPrecios.put("Banana", 0.3);
        productosPrecios.put("Naranja", 0.4);
    }
    public void imprimirProductos() {
        for (Map.Entry<String, Double> entry : productosPrecios.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
        }
    }

    public void imprimirProductosStream() {
        productosPrecios.forEach((producto, precio) -> System.out.println("Producto: " + producto + ", Precio: " + precio));
    }

    public void imprimirProductosMas10PorcientePrecioStream() {
        productosPrecios.entrySet().stream()
            .map(e -> e.getKey() + " nuevo precio: " + (e.getValue() * 1.10))
            .forEach(System.out::println);
    }

}
