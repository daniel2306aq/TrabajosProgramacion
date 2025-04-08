import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int numero = scanner.nextInt();
        if ( numero > 0){
            System.out.print("El numero es positivo ");
        } else if ( numero < 0){
            System.out.print("El numero es negativo ");
        } else {
            System.out.print("El numero es cero");
        }
        scanner.close();
        }
    }