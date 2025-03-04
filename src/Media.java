import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ingrese un numero");
            int num1 = scanner.nextInt();
            System.out.println("ingrese un numero");
            int num2 = scanner.nextInt();
            System.out.println("ingrese un numero");
            int num3 = scanner.nextInt();
            int sum = (num1 + num2 + num3);
            float promedio = sum / 3 ;

            System.out.println("la media es : " + promedio);
        }

    }

}

