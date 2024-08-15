package clase1;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        // un map es un diccionario, TAD  diccionario<Clave,Valor> 
        // invariante de representación: la clave no tiene duplicados
        HashMap<Integer,String> capitulos = new HashMap<>();
        capitulos.put(100,"Capitulo 100");
        capitulos.put(101, "Capitulo 101");
        System.out.println(capitulos.get(101));
        for(Integer i: capitulos.keySet()) {
            System.out.println(capitulos.get(i));
        }
    }
}
