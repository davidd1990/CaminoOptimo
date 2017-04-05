package co.edu.unbosque.complejidadAlgoritmica.interfaces;

/**
 * Interface que modela la declaraci?n de un Arco
 * @author Pedro Guillermo
 * @param <K> Par?metro que representa el ID de un v?rtice
 * @param <V> Par?metro que representa el ELEMENTO de un v?rtice
 */
public interface IArco<K,V>
{
	/**
	 * M?todo que retorna el costo del arco
	 * @return el costo del arco
	 */
	public double darCosto();
	
	/**
	 * M?todo que retorna el v?rtice origen del arco
	 * @return el v?rtice origen del arco
	 */
	public IVertice<K, V> darOrigen();
	
	/**
	 * M?todo que retorna el v?rtice destino del arco
	 * @return el v?rtice destino del arco
	 */
	public IVertice<K, V> darDestino();
}
