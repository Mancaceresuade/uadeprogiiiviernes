package clase1;

public class TorresDeHanoi {
    // Método recursivo para resolver las Torres de Hanoi
    public static int resolverHanoi(int n, char origen, char auxiliar, char destino) {
    if (n == 1) {
    System.out.println("Mover disco 1 desde " + origen + " hasta " + destino);
    return 1;
    }
    int movimientos = 0;
    movimientos += resolverHanoi(n - 1, origen, destino, auxiliar);
    System.out.println("Mover disco " + n + " desde " + origen + " hasta " + destino);
    movimientos += 1;
    movimientos += resolverHanoi(n - 1, auxiliar, origen, destino);
    return movimientos;
    }
    public static void main(String[] args) {
    int n = 5; // Número de discos
    int movimientos = resolverHanoi(n, 'A', 'B', 'C'); // A es el origen, B es el auxiliar, C es el destino
    System.out.println("Número total de movimientos: " + movimientos);
    }
}