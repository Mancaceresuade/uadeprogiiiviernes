package clase6;

import java.util.ArrayList;
import java.util.List;


public class RecuperacionDeCaminos {

    public static int optimizarPresupuesto(int[] costos, int[] rendimientos, int presupuesto) {
        int n = costos.length;
        int[][] dp = new int[n + 1][presupuesto + 1];

        // Llenado de la tabla dp
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= presupuesto; j++) {
                if (costos[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - costos[i - 1]] + rendimientos[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Recuperación de los jugadores seleccionados
        List<Integer> jugadoresSeleccionados = new ArrayList<>();
        int i = n;
        int j = presupuesto;
        
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) { // Si es diferente, el jugador i fue seleccionado
                jugadoresSeleccionados.add(i - 1); // Almacenamos el índice del jugador
                j -= costos[i - 1]; // Reducimos el presupuesto disponible
            }
            i--; // Seguimos con el siguiente jugador
        }

        // Imprimir los jugadores seleccionados
        System.out.print("Jugadores seleccionados: ");
        for (int jugador : jugadoresSeleccionados) {
            System.out.print((jugador + 1) + " "); // Imprimir en base 1
        }
        System.out.println();

        return dp[n][presupuesto];
    }

    public static void main(String[] args) {
        int[] costos = {5, 3, 4};
        int[] rendimientos = {60, 50, 70};
        int presupuesto = 8;

        int rendimientoMaximo = optimizarPresupuesto(costos, rendimientos, presupuesto);
        System.out.println("Rendimiento máximo con el presupuesto " + presupuesto + " es: " + rendimientoMaximo);
    }
}
