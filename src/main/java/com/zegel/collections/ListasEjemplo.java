package com.zegel.collections;

import java.util.ArrayList;
import java.util.List;

public class ListasEjemplo {

    // Arrays
    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    
    public void imprimirDiasSemana() {
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
    }

    List<String> productos = new ArrayList<>();

    public void agregarProductos() {
        productos.add("Manzana");
        productos.add("Banana");
        productos.add("Naranja");
        productos.add("Pera");
        productos.add("Uva");
        productos.add("Melón");
    }

    public void imprimirProductosInicienConLetra(String letra) {
        for (String producto : productos) {
            if (producto.startsWith(letra)) {
                System.out.println(producto);
            }
        }
    }
    
    public void imprimirProductosInicienConLetraStream(String letra) {
        productos.stream()
                .filter(producto -> producto.startsWith(letra))
                .forEach(System.out::println);
    }

}
