package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUANDAVID on 2/04/17.
 */
public class GrafoDirigido implements IGrafoDirigido{
    int orden = 0;
    ArrayList <IArco> arcos = new ArrayList<IArco>();
    ArrayList<IVertice> vertices = new ArrayList<IVertice>();
    

    /**
     * M?todo que retorna el orden (cantidad de nodos) del Grafo.
     * @return el orden del Grafo
     */
    public int darOrden() {
        return orden;
    }

    /**
     * M?todo que retorna el v?rtice correspondiente al Id indicado.
     * @param idVertice id del v?rtice a ser retornado.
     * @return el v?rtice correspondiente al id ingresado. Null si no existe.
     */
    public IVertice darVertice(Object idVertice) {
        return null;
    }


    public IArco darArco(Object idOrigen, Object idDestino) {
    	
        return null;
    }


    public boolean agregarVertice(Object idVertice, Object infoVertice) {
    	IVertice vertice = new Vertice(idVertice,infoVertice);
    	vertices.add(vertice);
    	
        return true;
    }


    public IVertice eliminarVertice(Object idVertice) {
        return null;
    }


  


    public IArco eliminarArco(Object idOrigen, Object idDestino) {
    	
        return null;
    }


    public List<IVertice> darRecorridoEnProfundidad(Object idOrigen) {
        return null;
    }


    public List<IVertice> darRecorridoPorAnchura(Object idOrigen) {
    	return null;
    }

    @Override
    public boolean agregarArco(Object idOrigen, Object idDestino, double costoArco) {
    	IArco arco = new Arco(idOrigen,idDestino,costoArco);
    	arcos.add(arco);
    	return true;

    }
}
