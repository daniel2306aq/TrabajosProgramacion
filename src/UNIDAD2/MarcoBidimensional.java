public class MarcoBidimensional {
    public static void main(String[] args) {
        // 1. Crear tabla bidimensional 5x15 llamada 'marco'
        int[][] marco = new int[5][15];
        
        // 2. Recorrer todas las filas y columnas
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                // 3. Verificar si estamos en un borde
                if (i == 0 || i == marco.length - 1 || 
                    j == 0 || j == marco[i].length - 1) {
                    marco[i][j] = 1; // Bordes externos
                } else {
                    marco[i][j] = 0; // Interior
                }
            }
        }
        
        // Mostrar la tabla con un encabezado
        System.out.println("Tabla bidimensional (marco):");
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}