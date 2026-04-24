package com.zegel.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CalculadorEcommerce {

    public void procesarVenta(String pais) {
        var tasasImpuesto = new HashMap<String, Double>();
        tasasImpuesto.put("PE", 0.18);
        tasasImpuesto.put("US", 0.07);
        tasasImpuesto.put("EU", 0.20);

        double precioProducto = 100.0;

        double total = calacularPrecioFinal(precioProducto, pais, tasasImpuesto);
        System.out.println("Precio final para " + pais + ": " + total);
    }

    public double calacularPrecioFinal(double precio, String pais, HashMap<String, Double> tasasImpuesto) {
        if(tasasImpuesto.containsKey(pais)) {
            var tasa = tasasImpuesto.get(pais);
            return precio * (1 + tasa);
        } else {
            return precio;
        }
    }

    public void procesarPedido() {
        // 1. Una lista de precios
        var precios = new ArrayList<Double>();
        precios.add(10.50);
        precios.add(20.00);
        precios.add(5.99);

        // 2. Un cliente fijo
        final var nombreCliente = "Mateo";
        
        // 3. Calcular el totaldouble total = 0.0;
        var total = 0.0;
        for (var precio : precios) {
            total += precio;
        }

        System.out.println("Cliente: " + nombreCliente + " - Total: " + total);
    }
}
