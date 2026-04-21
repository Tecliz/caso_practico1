package com.zegel;

public class Main {
    public static void main(String[] args) {
        // esto es un comentario
        /* 
        este es otro comentario
        este es otro comentario
        */
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
        System.out.println("Hello " + name);
        System.out.println("edad: " + edad);
        System.out.println("Is student: " + isStudent);
        System.out.println("Height: " + height);
        System.out.println("Peso: " + (peso + edad));
        System.out.println("Es mayor de edad: " + (edad >= 18));
        if (name  != "Zegel" && edad > 18) {
            System.out.println("Hola Zegel");
        } else {
            System.out.println("Hola desconocido");
        }
        if (name  != "Zegel" && edad > 18) {
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
    }
}
