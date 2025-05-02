package UNIDAD2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce el nombre del alumno (o '*' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) break;

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        int maxEdad = edades.stream().max(Integer::compare).orElse(0);
        System.out.println("\nAlumnos con mayor edad (" + maxEdad + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        scanner.close();
    }
}
