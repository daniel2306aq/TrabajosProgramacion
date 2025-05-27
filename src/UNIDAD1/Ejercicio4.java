package UNIDAD1;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese su sueldo:");
        double sueldo = scanner.nextDouble();

        if (sueldo > 3000) {
        System.out.print("Debe abonar impuestos");
        }
        scanner.close();
    }

}