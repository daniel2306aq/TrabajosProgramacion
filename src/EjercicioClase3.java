import java.util.Scanner;

public class EjercicioClase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccionar una operación");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingrese la opción: ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("La división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}