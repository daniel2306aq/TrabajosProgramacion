package UNIDAD2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] original = new String[5];
        String[] inverso = new String[5];

        for (int i = 0; i < original.length; i++) {
            System.out.print("Introduce una cadena: ");
            original[i] = scanner.nextLine();
        }

        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }

        System.out.println("Vector en orden inverso:");
        for (String s : inverso) {
            System.out.println(s);
        }

        scanner.close();
    }
}
