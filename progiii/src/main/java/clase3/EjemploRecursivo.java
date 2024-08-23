package clase3;

public class EjemploRecursivo {
    public static void main(String[] args) {
        int[] numeros = {4};
        System.out.println(mayor(numeros));
    }
    private static int mayor(int[] numeros) {
        return mayor(numeros,0, numeros[0]);
    }
    private static int mayor(int[] numeros, int i, int mayor) {
        if(i == numeros.length) return mayor;
        if(numeros[i]>mayor) {
            mayor = numeros[i];
        } 
        return mayor(numeros,i+1,mayor);
    }   
}
