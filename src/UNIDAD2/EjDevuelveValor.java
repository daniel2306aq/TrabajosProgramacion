package UNIDAD2;

public class EjDevuelveValor {
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println("Valor original: " + numero);
        
        incrementar(numero);
        System.out.println("Después de llamar a incrementar (sin usar retorno): " + numero);
        
        numero = incrementar(numero);
        System.out.println("Después de asignar el valor retornado: " + numero);
    }
    
    public static int incrementar(int x) {
        x = x + 1;  
        System.out.println("Dentro del método incrementar: " + x);
        return x;    
    }
}