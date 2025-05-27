package UNIDAD2;

public class EjemploPasoR {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 20);
        
        System.out.println("Antes de modificar:");
        System.out.println("Ancho: " + miRectangulo.ancho + ", Alto: " + miRectangulo.alto);
        
        modificarRectangulo(miRectangulo);
        
        System.out.println("Después de modificar:");
        System.out.println("Ancho: " + miRectangulo.ancho + ", Alto: " + miRectangulo.alto);
    }
    
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 30;  
        r.alto = 40;  
        System.out.println("Dentro del método modificarRectangulo:");
        System.out.println("Ancho: " + r.ancho + ", Alto: " + r.alto);
    }
}

class Rectangulo {
    int ancho;
    int alto;
    
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}