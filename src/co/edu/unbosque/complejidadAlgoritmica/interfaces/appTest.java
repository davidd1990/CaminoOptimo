package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class appTest {

	GrafoDirigido grafo = new GrafoDirigido();


	public File leearArchivo(){
		JFileChooser file = new JFileChooser();
		file.showOpenDialog(file);
		File archivo = file.getSelectedFile();

		return archivo;
	}

	public  int[][] lectorArchivos(String dato, File archivo) throws FileNotFoundException, IOException
	{

        FileReader f = new FileReader(archivo);
        FileReader f2 = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        BufferedReader b2 = new BufferedReader(f2);
        int columnas = 0;
        int filas = 1;
        
        String cadena;

        
        int [][] matriz = new int[filas][columnas];
        String[] matrizLinea = new String[0];
        
        
        while((cadena=b2.readLine()) != null)
        {
        	cadena = cadena.trim();
        	if(cadena.equals(dato)){
            	int i =0;
            	while((cadena=b2.readLine()).contains(",")){
					matrizLinea = cadena.split(",");
            		if(matrizLinea.length == 2){
						grafo.agregarVertice(matrizLinea[0], matrizLinea[1]);
					}else{
            			grafo.agregarArco(matrizLinea[0], matrizLinea[1], Double.parseDouble(matrizLinea[2]));
					}


    	        	i++;
            	}
            }
        }
        
        

        return matriz;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		appTest a = new appTest();
		File f = a.leearArchivo();
		a.lectorArchivos("Grafo.nodos", f);
		a.lectorArchivos("Grafo.arcos", f);
	}

}
