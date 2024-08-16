package clase1;

import java.util.*;

public class Ejemplo {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Map<Integer,Cliente> clientes = new HashMap<>();
        clientes.put(100,new Cliente(100,"Carlos"));
        clientes.put(101,new Cliente(101,"Juan"));
        // System.out.println(clientes.get(100));
        for(Integer i : clientes.keySet()) {
            System.out.println(clientes.get(i));
        }
    }
}

class Cliente {
    private int id;
    private String nombre;
    public Cliente(int id,String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

