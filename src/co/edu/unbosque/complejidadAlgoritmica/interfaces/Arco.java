package co.edu.unbosque.complejidadAlgoritmica.interfaces;


/**
 * Interface que modela la declaraci�n de un Arco
 * @author  JUAN DAVID IBAÑEZ ENCISO, JUAN DAVID PARDO REINA, SANTIAGO SUAREZ HERNANDEZ
 */
public class Arco implements IArco{

	IVertice vo, vd;
	double c;
	
	/**
	 * Metodo que retorna el costo del arco
	 * @return el costo del arco
	 */
	 public Arco(Object vo, Object vd, double c){
		this.vo =(IVertice) vo;
		this.vd =(IVertice) vd;
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
