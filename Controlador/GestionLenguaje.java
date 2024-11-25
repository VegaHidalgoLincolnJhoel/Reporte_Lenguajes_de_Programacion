package Controlador;

import Modelo.LenguajeProgramacion;
import java.util.Arrays;

public class GestionLenguaje {

    private static final int FACTOR_CRECIMIENTO = 2; // Factor de crecimiento dinámico
    private static LenguajeProgramacion[] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int ContadorLenguajes = 0;

    // Agregar un lenguaje al arreglo
    public static void AgregarLenguaje(int AñoCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        if (ContadorLenguajes >= ArregloLenguajes.length) {
            ArregloLenguajes = Arrays.copyOf(ArregloLenguajes, ArregloLenguajes.length * FACTOR_CRECIMIENTO);
        }
        ArregloLenguajes[ContadorLenguajes++] = new LenguajeProgramacion(AñoCreacion, CaracteristicaPrincipal, Nombre, Utilizacion);
    }

    // Buscar lenguaje por nombre
    public static LenguajeProgramacion BuscarLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equals(Nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null; // Lenguaje no encontrado
    }

    // Eliminar lenguaje por nombre (devuelve booleano)
    public static boolean EliminarLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equals(Nombre)) {
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < ContadorLenguajes - 1; j++) {
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[--ContadorLenguajes] = null; // Reducir tamaño
                return true; // Eliminación exitosa
            }
        }
        return false; // No se encontró el lenguaje
    }

    // Obtener el arreglo de lenguajes
    public static LenguajeProgramacion[] GetArregloLenguajes() {
        return Arrays.copyOf(ArregloLenguajes, ContadorLenguajes); // Devuelve una copia hasta el contador actual
    }

    // Imprimir lenguajes almacenados en formato de tablas tipo excel
    public static void ImprimirLenguajes() {
        System.out.printf("%-20s %-20s %-30s %-20s%n", "Nombre", "Año de Creación", "Característica Principal", "Utilización");
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < ContadorLenguajes; i++) {
            LenguajeProgramacion lp = ArregloLenguajes[i];
            System.out.printf("%-20s %-20d %-30s %-20s%n", lp.getNombre(), lp.getAñoCreacion(), lp.getCaracteristicaPrincipal(), lp.getUtilizacion());
        }
    }
}