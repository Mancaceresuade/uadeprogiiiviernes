package clase1;

public class Ejemplo1_3 {
    public static void main(String[] args) {
        System.out.println(sumarEnteros(5));    
    }

    private static int sumarEnteros(int i) {
        if(i == 0) {
            return 0;
        }
        return sumarEnteros(i-1) + i;
    }


}
