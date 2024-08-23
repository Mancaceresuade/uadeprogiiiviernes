package clase3;

import java.util.ArrayList;
import java.util.*;
public class EjemploStream {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(10);
        numeros.add(14);
        numeros.add(12);
        numeros.forEach(n -> System.out.println(n));
        numeros.stream().filter(s -> s == 12).forEach(n -> System.out.println(n));
        // System.out.println(numeros.stream().reduce((a,c)->a+c));
    }    
}
