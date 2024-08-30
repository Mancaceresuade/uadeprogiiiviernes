package clase4;
import java.util.*;

public class Ejemplo1 {
    // Función para encontrar la cantidad mínima de monedas
    public static boolean cambioExacto(int[] monedas, int monto) {
        Arrays.sort(monedas);
        for (int i = monedas.length - 1; i >= 0; i--) {
            while (monto >= monedas[i]) {
                monto -= monedas[i];
            }
        }
        return monto==0;
    }

    public static void main(String[] args) {
        int[] monedas = { 1, 5, 10, 25 };
        int monto = 36;
        System.out.println(cambioExacto(monedas, monto));
    }
}
