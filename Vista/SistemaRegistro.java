package Vista;

import Controlador.GestionLenguaje;
import java.util.Scanner;

public class SistemaRegistro {

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                // Mostrar el menú de opciones
                System.out.println("\n--- Sistema de Registro de Lenguajes de Programación ---");
                System.out.println("1. Agregar lenguaje");
                System.out.println("2. Buscar lenguaje");
                System.out.println("3. Eliminar lenguaje");
                System.out.println("4. Imprimir todos los lenguajes");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                
                switch (opcion) {
                    case 1 -> {
                        // Agregar un nuevo lenguaje
                        System.out.print("\nAño de creación: ");
                        int anio = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Característica principal: ");
                        String caracteristica = scanner.nextLine();
                        System.out.print("Nombre del lenguaje: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Utilización: ");
                        String utilizacion = scanner.nextLine();
                        
                        GestionLenguaje.AgregarLenguaje(anio, caracteristica, nombre, utilizacion);
                        System.out.println("Lenguaje agregado con éxito.");
                    }
                        
                    case 2 -> {
                        // Buscar un lenguaje por nombre
                        System.out.print("\nIngrese el nombre del lenguaje a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        var lenguaje = GestionLenguaje.BuscarLenguaje(nombreBuscar);
                        if (lenguaje != null) {
                            System.out.println("Lenguaje encontrado: " + lenguaje);
                        } else {
                            System.out.println("No se encontró el lenguaje.");
                        }
                    }
                        
                    case 3 -> {
                        // Eliminar un lenguaje por nombre
                        System.out.print("\nIngrese el nombre del lenguaje a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        boolean eliminado = GestionLenguaje.EliminarLenguaje(nombreEliminar);
                        if (eliminado) {
                            System.out.println("Lenguaje eliminado con éxito.");
                        } else {
                            System.out.println("No se encontró el lenguaje.");
                        }
                    }
                        
                    case 4 -> {
                        // Imprimir todos los lenguajes registrados
                        System.out.println("\nLista de lenguajes registrados:");
                        GestionLenguaje.ImprimirLenguajes();
                    }
                        
                    case 5 -> System.out.println("\nSaliendo del sistema...");
                        
                    default -> System.out.println("\nOpción no válida. Intente nuevamente.");
                }
            } while (opcion != 5); // Repetir el menú hasta que se seleccione la opción de salir
        }
    }
}