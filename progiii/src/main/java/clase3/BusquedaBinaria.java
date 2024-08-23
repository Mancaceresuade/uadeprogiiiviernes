package clase3;

public class BusquedaBinaria {
    public static int busquedaBinaria(int[] arr, int target) {
        return busquedaBinariaRecursiva(arr, 0, arr.length - 1, target);
    }

    private static int busquedaBinariaRecursiva(int[] arr, int inicio, int fin, int target) {
        if (inicio > fin) {
            return -1; // El elemento no está presente
        }
        
        int medio = inicio + (fin - inicio) / 2;
        
        if (arr[medio] == target) {
            return medio; // Elemento encontrado
        } else if (arr[medio] > target) {
            return busquedaBinariaRecursiva(arr, inicio, medio - 1, target); // Buscar en la mitad inferior
        } else {
            return busquedaBinariaRecursiva(arr, medio + 1, fin, target); // Buscar en la mitad superior
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int resultado = busquedaBinaria(arr, target);
        
        if (resultado == -1) {
            System.out.println("Elemento no presente en el arreglo.");
        } else {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        }
    }
}
