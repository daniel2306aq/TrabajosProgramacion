package UNIDAD2;

import java.util.Scanner;

public class EjercicioGrupal {
    public static void main(String[] args) {
        int numeroEstudiantes = 5; 
        int numeroAsignaturas = 3; 
        double promedioMinimoAprobacion = 3.0; 

        String[] nombresEstudiantes = new String[numeroEstudiantes]; 
        String[] identificacionesEstudiantes = new String[numeroEstudiantes]; 
        double[][] calificacionesEstudiantes = new double[numeroEstudiantes][numeroAsignaturas]; 

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombresEstudiantes[i] = input.nextLine();

            System.out.println("Ingrese la identificacion del estudiante " + (i + 1) + ":");
            identificacionesEstudiantes[i] = input.nextLine();

            System.out.println("Ingrese las " + numeroAsignaturas + " notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < numeroAsignaturas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                calificacionesEstudiantes[i][j] = input.nextDouble();
            }
            input.nextLine(); 
        }

        System.out.println("\nReporte Final:");
        for (int i = 0; i < numeroEstudiantes; i++) {
            double sumaNotas = 0;
            for (int j = 0; j < numeroAsignaturas; j++) {
                sumaNotas += calificacionesEstudiantes[i][j];
            }
            double promedioNotas = sumaNotas / numeroAsignaturas;

            String estado;
            if (promedioNotas >= promedioMinimoAprobacion) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }

            System.out.println(nombresEstudiantes[i] + " (ID: " + identificacionesEstudiantes[i] +
                    ") - Promedio: " + String.format("%.2f", promedioNotas) + " - Estado: " + estado);
        }

        input.close(); 
    }
}