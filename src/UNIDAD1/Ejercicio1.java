import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        Float numero1 = scanner.nextFloat();
        
        System.out.println("Ingrese el segundo numero: ");
        Float numero2 = scanner.nextFloat();
        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        System.out.println("La suma de los numeros es:" + suma
        );
        System.out.println("La resta de los numeros es:" + resta
        );        
        System.out.println("La multiplicacion de los numeros es:" + multiplicacion
        );
        System.out.println("La division de los numeros es:" + division
        );
        scanner.close();
    }
}