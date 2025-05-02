package UNIDAD2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        double menorTemp = tempMin[0];
        for (int i = 1; i < 5; i++) {
            if (tempMin[i] < menorTemp) {
                menorTemp = tempMin[i];
            }
        }
        System.out.println("\nDías con menor temperatura mínima (" + menorTemp + "):");
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        double tempBusqueda = scanner.nextDouble();
        boolean encontrado = false;
        System.out.println("Días con temperatura máxima igual a " + tempBusqueda + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == tempBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima.");
        }

        scanner.close();
    }
}
