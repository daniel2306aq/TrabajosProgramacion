package UNIDAD1;

import java.util.Scanner;

public class Logico1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el primer número:");
            double numero1 = scanner.nextDouble();
            
            System.out.println("Introduce el segundo número:");
            double numero2 = scanner.nextDouble();
            
            System.out.println("Introduce el tercer número:");
            double numero3 = scanner.nextDouble();
            
            // Calcular la media
            double media = (numero1 + numero2 + numero3) / 3;
            
            // Mostrar el resultado
            System.out.println("La media de los tres números es: " + media);
        }
    }
}