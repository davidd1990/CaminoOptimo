package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.util.List;


/**
 * Interface que modela la declaraci?n de un Grafo Dirigido
 * @author Pedro Guillermo
 * @param <K> Par?metro que representa el ID de un v?rtice
 * @param <V> Par?metro que representa el ELEMENTO de un v?rtice
 */
public interface IGrafoDirigido<K,V> 
{
	/**
	 * M?todo que retorna el orden (cantidad de nodos) del Grafo.
	 * @return el orden del Grafo
	 */
	public int darOrden();
	
	/**
	 * M?todo que retorna el v?rtice correspondiente al Id indicado.
	 * @param idVertice id del v?rtice a ser retornado. 
	 * @return el v?rtice correspondiente al id ingresado. Null si no existe.
	 */
	public IVertice<K, V> darVertice(K idVertice);
	
	/**
	 * M?todo que retorna un Arco a partir de los ids de sus v?rtices origen y destino
	 * @param idOrigen id del v?rtice origen
	 * @param idDestino id del v?rtice destino
	 * @return el Arco correspondiente a los v?rtices ingresados. Null si no hay Arco.
	 */
	public IArco<K,V> darArco(K idOrigen, K idDestino);
	
	/**
	 * M?todo que agrega un v?rtice al Grafo
	 * @param idVertice id del v?rtice a ser agregado
	 * @param infoVertice informaci?n a contenerse en el v?rtice
	 * @return true si se agreg? sin problemas. False si ya exist?a en el grafo o si no 
	 * se pudo agregar por cualquier motivo.
	 */
	public boolean agregarVertice(K idVertice, V infoVertice);
	
	/**
	 * M?todo que elimina un v?rtice del Grafo
	 * @param idVertice id del v?rtice que se va a eliminar
	 * @return el v?rtice eliminado o Null si no exist?a.
	 */
	public IVertice<K,V> eliminarVertice(K idVertice);
	
	/**
	 * M?todo que agrega un arco al Grafo
	 * @param idOrigen id del v?rtice origen
	 * @param idDestino id del v?rtice destino
	 * @param costoArco costo del Arco 
	 * @return true si se pudo agregar sin inconvenientes, o false si ya exist?a.
	 */
	public boolean agregarArco(K idOrigen, K idDestino, double costoArco);
	
	/**
	 * M?todo que elimina un arco del Grafo
	 * @param idOrigen id del v?rtice origen
	 * @param idDestino id del v?rtice destino
	 * @return el arco eliminado o Null si no exist?a
	 */
	public IArco<K,V> eliminarArco(K idOrigen, K idDestino);
	
	/**
	 * M?todo que retorna una colecci?n de v?rtices correspondientes al DFS 
	 * @param idOrigen id del v?rtice origen del recorrido
	 * @return una colecci?n con los v?rtices correspondientes al DFS
	 */
	public List<IVertice<K, V>> darRecorridoEnProfundidad(K idOrigen);
	
	/**
	 * M?todo que retorna una colecci?n de v?rtices correspondientes al BFS 
	 * @param idOrigen id del v?rtice origen del recorrido
	 * @return una colecci?n con los v?rtices correspondientes al BFS
	 */
	public List<IVertice<K, V>> darRecorridoPorAnchura(K idOrigen);
}
