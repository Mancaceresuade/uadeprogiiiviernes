package clase1;

public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println(suma(10));
    }
    static int suma(int n) {
        if (n == 0) { // Caso base: O(1)
            return 0;
        }
        return n + suma(n - 1); // Llamada recursiva: T(n-1) + O(1)
    }

}
