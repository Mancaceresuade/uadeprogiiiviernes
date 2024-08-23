package clase3;

public class Ejemplo1 {
    public static void main(String[] args) {
        int[] numeros = {4,6,8};
        System.err.println(suma(numeros));
    }
    private static int suma(int[] numeros) {
        return suma(numeros,0, numeros.length);
    }
    private static int suma(int[] numeros, int i, int f) {
        if(i == f-1) return numeros[i];
        int mitad = (i+f)/2;
        int izq = suma(numeros,i,mitad);
        int der = suma(numeros,mitad,f);
        return izq+der;
    }
}
