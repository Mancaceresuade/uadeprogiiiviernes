package clase12;

public class App {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		Almacen centroDistribucion = new Almacen(0,"Centro Distribucion");
		centroDistribucion.agregarDestino(1);
		centroDistribucion.agregarDestino(2);
		centroDistribucion.agregarDestino(3);
		grafo.agregarAlmacen(centroDistribucion);
		
		grafo.DFS(0);
		grafo.BFS(0);

	}

}
