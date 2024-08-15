package clase1;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploMaps {
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1,1,10000.0));
        facturas.add(new Factura(1,2,20000.0));
        facturas.add(new Factura(1,1,10000.0));

        HashMap<Integer,Cliente> clientes = new HashMap<>();
        clientes.put(1, new Cliente(1,"Carlos"));
        clientes.put(2, new Cliente(2,"Juana"));

        HashMap<Integer, ResultadoDto> resultados = new HashMap<>();
        for(Factura f : facturas) {
            System.out.println(f.getIdCliente());
            if(resultados.get(f.getIdCliente()) == null) {
                String nombre = clientes.get(f.getIdCliente()).getNombre();
                resultados.put(f.getIdCliente(), new ResultadoDto(f.getIdFactura(),nombre,0.0));                
            }
            double tot = resultados.get(f.getIdCliente()).getImporte() + f.getImporte();
            resultados.get(f.getIdCliente()).setImporte(tot);
        }
        // imprimir el resultado
        for (Integer id : resultados.keySet()) {
            System.out.println(resultados.get(id));
        }        
    }
}

class Cliente {
    private int idCliente;
    private String nombre;
    Cliente(int idCliente,String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.idCliente;
    }
}

class Factura {
    private int idFactrua;
    private int idCliente;
    private double importe;
    public Factura(int idFactrua,int idCliente,double importe) {
        this.idFactrua = idFactrua;
        this.idCliente = idCliente;
        this.importe = importe;
    }   
    public int getIdFactura() {
        return this.idFactrua;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    public double getImporte() {
        return this.importe;
    }
}


class ResultadoDto {
    private int idCliente;
    private String nombre;
    private double importe;
    ResultadoDto(int idCliente,String nombre, double importe) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.importe = importe;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getImporte() {
        return this.importe;
    }
    void setImporte(double importe) {
        this.importe = importe;
    }
    @Override
    public String toString() {
        return this.idCliente + " " + this.nombre + " " + this.importe;
    }
}