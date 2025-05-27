package UNIDAD2;

public class EjModificarCadena {
    public static void main(String[] args) {
        String mensaje = "Hola Mundo";
        
        System.out.println("Antes de modificar: " + mensaje);
        
        modificarCadena(mensaje);
        
        System.out.println("Después de modificar: " + mensaje);
    }
    
    public static void modificarCadena(String texto) {
        System.out.println("Dentro del método (antes de modificar): " + texto);
        
        texto = texto.toUpperCase();
        
        System.out.println("Dentro del método (después de modificar): " + texto);
    }
}