import java.util.Scanner;

public class EjercicioClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt( );
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >num1 && num2 > num3) {
            System.out.println("El mayor es:" + num2);
        } else {
            System.out.println("El mayor es:" + num3);
        }
        scanner.close();
    } 
}