package clase11;

public class DisenoInterioresBacktracking {

    static int N = 4; // Tamaño del tablero 4x4

    // Función para verificar si la ubicación de un escritorio es válida
    public static boolean esSeguroEscritorio(int tablero[][], int fila, int col) {
        // Verificar fila
        for (int i = 0; i < N; i++) {
            if (tablero[fila][i] == 1) {
                return false;
            }
        }
        // Verificar columna
        for (int i = 0; i < N; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    // Función para verificar si la ubicación de una silla es válida
    public static boolean esSeguroSilla(int tablero[][], int fila, int col) {
        // Verificar fila
        for (int i = 0; i < N; i++) {
            if (tablero[fila][i] == 2) {
                return false;
            }
        }
        // Verificar columna
        for (int i = 0; i < N; i++) {
            if (tablero[i][col] == 2) {
                return false;
            }
        }
        return true;
    }

    // Función para resolver el problema
    public static void resolverDisenoInteriores() {
        int[][] tablero = new int[N][N]; // Crear un tablero vacío
        colocarEscritorios(tablero, 0, 0); // Iniciar colocando los escritorios
    }

    // Función recursiva para colocar escritorios
    public static boolean colocarEscritorios(int[][] tablero, int fila, int escritoriosColocados) {
        if (escritoriosColocados == 4) { // Si hemos colocado 4 escritorios, pasar a colocar sillas
            colocarSillas(tablero, 0, 0);
            return true;
        }

        for (int i = fila; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (esSeguroEscritorio(tablero, i, j)) {
                    // Colocar escritorio
                    tablero[i][j] = 1;
                    
                    // Recursión para colocar el siguiente escritorio
                    colocarEscritorios(tablero, i + 1, escritoriosColocados + 1);
                    
                    // Backtrack: quitar escritorio
                    tablero[i][j] = 0;
                }
            }
        }

        return false; // No hay solución válida en esta rama
    }

    // Función recursiva para colocar sillas
    public static boolean colocarSillas(int[][] tablero, int fila, int sillasColocadas) {
        if (sillasColocadas == 4) { // Si se han colocado 4 sillas, imprimir el tablero
            imprimirTablero(tablero);
            return true;
        }

        for (int i = fila; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (esSeguroSilla(tablero, i, j) && tablero[i][j] == 0) {
                    // Colocar silla
                    tablero[i][j] = 2;
                    
                    // Recursión para colocar la siguiente silla
                    colocarSillas(tablero, i + 1, sillasColocadas + 1);
                    
                    // Backtrack: quitar silla
                    tablero[i][j] = 0;
                }
            }
        }

        return false; // No hay solución válida en esta rama
    }

    // Función para imprimir el tablero
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print("E "); // Escritorio
                } else if (tablero[i][j] == 2) {
                    System.out.print("S "); // Silla
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        resolverDisenoInteriores();
    }
}
