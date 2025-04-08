import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else {
            System.out.println("El segundo número es mayor.");
        }

        scanner.close();
    }
}