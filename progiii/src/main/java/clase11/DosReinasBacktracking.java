package clase11;

public class DosReinasBacktracking {

    static int N = 4; // Tamaño del tablero 4x4

    // Verifica si se puede colocar una reina en la posición (fila, col)
    public static boolean esSeguro(int tablero[][], int fila, int col) {
        // Verificar la fila actual
        for (int i = 0; i < N; i++) {
            if (tablero[fila][i] == 1 || tablero[i][col] == 1) {
                return false;
            }
        }
        
        // Verificar la diagonal superior izquierda e inferior derecha
        for (int i = fila, j = col; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        for (int i = fila, j = col; i < N && j < N; i++, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        
        // Verificar la diagonal superior derecha e inferior izquierda
        for (int i = fila, j = col; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        for (int i = fila, j = col; i < N && j >= 0; i++, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        
        // Si pasa todas las pruebas, es seguro colocar la reina
        return true;
    }

    // Resuelve el problema de las dos reinas usando backtracking
    public static void resolverDosReinas() {
        int tablero[][] = new int[N][N]; // Crear un tablero vacío
        colocarReina(tablero, 0, 0, 0); // Intentar colocar la primera reina
    }

    // Función recursiva para colocar reinas
    public static boolean colocarReina(int tablero[][], int fila, int col, int reinasColocadas) {
        if (reinasColocadas == 2) { // Si se han colocado dos reinas
            imprimirTablero(tablero);
            return true;
        }

        // Recorrer todas las filas y columnas para colocar las reinas
        for (int i = fila; i < N; i++) {
            for (int j = col; j < N; j++) {
                if (esSeguro(tablero, i, j)) {
                    // Colocar reina
                    tablero[i][j] = 1;

                    // Intentar colocar la siguiente reina
                    colocarReina(tablero, i, j + 1, reinasColocadas + 1);

                    // Backtrack: eliminar reina si no es solución
                    tablero[i][j] = 0;
                }
            }
            col = 0; // Reiniciar columna cuando pasamos a la siguiente fila
        }

        return false; // No se encuentra solución válida en esta rama
    }

    // Función para imprimir el tablero
    public static void imprimirTablero(int tablero[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print("R ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        resolverDosReinas();
    }
}