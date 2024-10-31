package clase12;

import java.util.ArrayList;

public class Almacen {
	private Integer Id;
	private String nombre;
	ArrayList<Integer> destinos
		= new ArrayList<>();
	
	
	
	public ArrayList<Integer> getDestinos() {
		return destinos;
	}

	public void agregarDestino(Integer destino) {
		destinos.add(destino);
	}
	
	public Almacen(Integer id, String nombre) {
		super();
		Id = id;
		this.nombre = nombre;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Almacen [Id=" + Id + ", nombre=" + nombre + ", destinos=" + destinos + "]";
	}
	
	
}
