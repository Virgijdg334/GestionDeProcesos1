package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números a ordenar (introduce una letra o 'fin' para terminar):");

        // Leer números hasta que el usuario escriba algo que no sea entero
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numeros.add(scanner.nextInt());
            } else {
                // si la entrada no es un número, detenemos la lectura
                break;
            }
        }

        scanner.close();

        // Ordenar la lista
        Collections.sort(numeros);

        // Mostrar resultado
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
