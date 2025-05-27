package UNIDAD1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su porcentaje de respuestas correctas que a obtenido: ");
        int porcentaje = scanner.nextInt();
        if (porcentaje >= 90) {
            System.out.print("Nivel máximo");
        } else if (porcentaje >= 75 && porcentaje < 90) {
            System.out.print("Nivel medio");
        } else if (porcentaje >= 50 && porcentaje < 75) {
            System.out.print("Nivel regular");
        } else if (porcentaje < 50) {
            System.out.print("Fuera de nivel");
        }
        scanner.close();    
    }
}
