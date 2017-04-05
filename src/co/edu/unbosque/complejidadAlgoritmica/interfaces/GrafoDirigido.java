package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.util.List;

/**
 * Created by JUANDAVID on 2/04/17.
 */
public class GrafoDirigido implements IGrafoDirigido{
    int orden = 0;

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
        return false;
    }


    public IVertice eliminarVertice(Object idVertice) {
        return null;
    }


    public boolean agregarArco(Object idOrigen, Object idDestino, double costoArco) {
        return false;
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
}
