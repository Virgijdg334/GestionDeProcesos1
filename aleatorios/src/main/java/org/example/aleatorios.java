package org.example;


import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidad = 40; // cantidad mínima de números a generar

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(101); // genera un número entre 0 y 100 inclusive
            System.out.println(numero);
        }
    }
}