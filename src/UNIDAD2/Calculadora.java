
package UNIDAD2;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Probar suma de dos enteros
        int resultado1 = calc.sumar(5, 10);
        System.out.println("Suma de dos enteros (5 + 10): " + resultado1);

        // Probar suma de tres enteros
        int resultado2 = calc.sumar(3, 7, 2);
        System.out.println("Suma de tres enteros (3 + 7 + 2): " + resultado2);

        // Probar suma de dos números tipo double
        double resultado3 = calc.sumar(4.5, 2.3);
        System.out.println("Suma de dos doubles (4.5 + 2.3): " + resultado3);
    }

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos doubles
    public double sumar(double a, double b) {
        return a + b;
    }
}