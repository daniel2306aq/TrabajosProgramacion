package UNIDAD2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];  
        int[][] kms = new int[3][7]; 
        int[] total_kms = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Introduce los kilómetros realizados por " + nombres[i] + " cada día:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < 7; j++) {
                total_kms[i] += kms[i][j];
            }
        }

        System.out.println("\nKilómetros realizados por cada conductor:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }

        scanner.close();
    }
}
