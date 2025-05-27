package UNIDAD1;

import java.util.Scanner;
public class PracticaClase{

    public static void main(String[] args) throws Exception{
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese su altura: ");
            double altura = scanner.nextDouble();


            System.out.println("sus datos ingresados son: su nombre es: " + nombre +" , su edad es: " + edad +" , su altura es:" + altura);
        }
    }
}