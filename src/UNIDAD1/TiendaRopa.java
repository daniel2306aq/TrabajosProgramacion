public class TiendaRopa {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuento del 15%
        double descuento = 0.15;
        
        // Calcular precios con descuento del 15%
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonConDescuento = precioPantalon * (1 - descuento);
        
        // Calcular el total de una camiseta y un pantalón
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento;
        
        // Descuento adicional del 5% para la segunda camiseta
        double descuentoAdicional = 0.05;
        double precioSegundaCamisetaConDescuento = precioCamisetaConDescuento * (1 - descuentoAdicional);
        
        // Calcular el total con la segunda camiseta
        double precioTotalConSegundaCamiseta = precioTotal + precioSegundaCamisetaConDescuento;
        
        // Mostrar resultados
        System.out.println("Precio con descuento del 15% - Camiseta: $" + precioCamisetaConDescuento);
        System.out.println("Precio con descuento del 15% - Pantalón: $" + precioPantalonConDescuento);
        System.out.println("Precio total de una camiseta y un pantalón: $" + precioTotal);
        System.out.println("Precio con descuento adicional del 5% - Segunda camiseta: $" + precioSegundaCamisetaConDescuento);
        System.out.println("Precio total con segunda camiseta: $" + precioTotalConSegundaCamiseta);
    }
}