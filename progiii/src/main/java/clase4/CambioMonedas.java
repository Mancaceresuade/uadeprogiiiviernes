package clase4;
import java.util.*;

public class CambioMonedas {
    // Función para encontrar la cantidad mínima de monedas
    public static List<Integer> encontrarMinimoMonedas(int[] monedas, int monto) {
        Arrays.sort(monedas);  // n log(n)
        List<Integer> resultado = new ArrayList<>(); // 1
        for (int i = monedas.length - 1; i >= 0; i--) {  // aprox. n
            while (monto >= monedas[i]) {
                monto -= monedas[i];
                resultado.add(monedas[i]);
            }
        }
        return resultado;
        // O(n log n  + n)   => O(n log n) + O(n) => max(O(n log n) + O(n)) =>  O(n log n)
    }

    public static void main(String[] args) {
        int[] monedas = { 1, 5, 10, 25 };
        int monto = 36;
        List<Integer> resultado = encontrarMinimoMonedas(monedas, monto);
        System.out.println("Monedas usadas para hacer " + monto + ": " + resultado);
    }
}