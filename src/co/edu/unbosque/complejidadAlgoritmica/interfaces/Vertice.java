package co.edu.unbosque.complejidadAlgoritmica.interfaces;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa los nodos
 * @authors JUAN DAVID IBAÑEZ ENCISO, JUAN DAVID PARDO REINA, SANTIAGO SUAREZ HERNANDEZ
 * @param <K> Par�metro que representa el ID de un v�rtice
 * @param <V> Par�metro que representa el ELEMENTO de un v�rtice
 */
public class Vertice implements IVertice<Object, Object>{
	/**
	 * @variable <v> Respresenta el valor del vertice 
	 * @variable <k> Respresenta el id del vertice 
	 * @variable <m> Respresenta el en verdadero si ya leyo el vertice y falso lo contrario (marca)
	 * @variable <l> Guardara el listado de sucesores. 
	 */
	Object v, k;
	boolean m;
	List<Object> l = new ArrayList<Object>();
	
	public Vertice(Object v, Object k){
		this.v = v;
		this.k = k;
	}
	
	/**
	 * Metodo que da el id del vertice
	 * @return el id del vertice
	 */
	public Object darId() {
		return k;
	}

	/**
	 * Metodo que da el valor/elemento del vertice
	 * @return el valor/elemento del vertice
	 */
	public Object darValor() {
		return v;
	}

	/**
	 * Metodo que indica si el vertice esta marcado
	 * @return el valor booleano de la marca
	 */	
	public boolean darMarca() {
		return m;
	}

	/**
	 * Metodo retorna el listado de Ids de los sucesores
	 * @return la lista de Ids
	 */	
	public List darSucesores() {
		return l;
	}

	/**
	 * Metodo que marca el vertice (True)
	 */
	public void marcar() { this.m = true; }

	/**
	 * Metodo que desmarca el vertice (False)
	 */
	public void desmarcar() {
		this.m = false;
	}

	public IArco darSucesor(Object idDestino) {

		return null;
	}

	public void darRecorridoEnProfundidad(List vertices) {
		// TODO Auto-generated method stub
		
	}

	public void darRecorridoPorAnchura(List vertices) {
		// TODO Auto-generated method stub
		
	}

	public boolean agregarSucesor(IArco sucesor) {
		// TODO Auto-generated method stub
		return false;
	}

	public IArco removerSucesor(Object idSucesor) {
		// TODO Auto-generated method stub
		return null;
	}

}
