package UNIDAD2;

public class ModificacionArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        System.out.println("Array antes de modificar:");
        mostrarArray(numeros);
        
        modificarArray(numeros);
        
        System.out.println("Array después de modificar:");
        mostrarArray(numeros);
    }
    
    public static void modificarArray(int[] arr) {
        System.out.println("Modificando array dentro del método...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; 
        }
    }
    
    public static void mostrarArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}