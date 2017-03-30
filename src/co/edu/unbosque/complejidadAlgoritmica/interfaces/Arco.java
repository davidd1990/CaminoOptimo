package co.edu.unbosque.complejidadAlgoritmica.interfaces;


/**
 * Interface que modela la declaraci�n de un Arco
 * @author  JUAN DAVID IBAÑEZ ENCISO, JUAN DAVID PARDO REINA, SANTIAGO SUAREZ HERNANDEZ
 * @param <vo> Parametro que representa el vertice de origen
 * @param <vd> Parametro que representa el vertice de destino
 * @param <c>  Parametro que respresenta el costo del arco
 */
public class Arco implements IArco{

	IVertice vo, vd;
	Double c;
	
	/**
	 * Metodo que retorna el costo del arco
	 * @return el costo del arco
	 */
	void Arco (Vertice vo, Vertice vd, Double c){
		this.vo = vo;
		this.vd = vd;
		this.c = c;
	}
	
	/**
	 * Metodo que retorna el vertice origen del arco
	 * @return el vertice origen del arco
	 */
	public double darCosto() {
		return c;
	}

	/**
	 * Metodo que retorna el vertice origen del arco
	 * @return el vertice origen del arco
	 */
	public IVertice darOrigen() {
		return vo;
	}

	/**
	 * Metodo que retorna el vertice destino del arco
	 * @return el vertice destino del arco
	 */
	public IVertice darDestino() {
		return vd;
	}

}
