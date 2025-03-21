import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo de hasta tres cifras: ");
        int numero = scanner.nextInt();
        if ( numero > 0 && numero < 10) {
            System.out.println("El numero tiene una cifra");
        } else if ( numero >= 10 && numero < 100){
            System.out.println("El numero tiene dos cifras");
        } else if ( numero >= 100 && numero < 1000){
            System.out.println("El numero tiene tres cifras");
        } else {
            System.out.println("Error: el numero no es positivo o tiene mas de tres cifras");
        }
        }
    }