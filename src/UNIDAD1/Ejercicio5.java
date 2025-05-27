package UNIDAD1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.print("El primer numero es mayor que el segundo");
        } else if (numero1 < numero2) {
            System.out.print("El primer numero es menor que el segundo");
        }
        scanner.close();
    }
}
