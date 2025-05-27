package UNIDAD1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingrese un numero entre el 1 y el 99:");
    int numero = scanner.nextInt();
    if (numero >= 10){
        System.out.println("El numero tiene dos digitos");
    } else {
        System.out.println("El numero tiene un digito");
    }
    scanner.close();
    }
}
