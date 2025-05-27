package UNIDAD2;

import java.util.Random;
public class EjemploDinamico {
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println(findMax(5, 10, 3)); // Salida: 10
        System.out.println(findMax(20, 15, 25)); // Salida: 25
    }
}