package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class appTest {

	public static int[][] lectorArchivos(String dato) throws FileNotFoundException, IOException 
	{
		JFileChooser file = new JFileChooser();
		file.showOpenDialog(file);
		File archivo = file.getSelectedFile();	
        FileReader f = new FileReader(archivo);
        FileReader f2 = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        BufferedReader b2 = new BufferedReader(f2);
        int columnas = 0;
        int filas = 1;
        
        String cadena;
        
        
        
        while((cadena=b.readLine()) != null)
        {
        	cadena = cadena.trim();
        	if(cadena.equals(dato)){
            	if((cadena=b.readLine()).contains(",")){
            		String[] arrTemporal = cadena.split(",");
            		columnas = arrTemporal.length;
            		while((cadena=b.readLine()).contains(",")) {
            			filas ++;
            		}
            	}
            }
        }
        
        
        int [][] matriz = new int[filas][columnas];
        String[] matrizLinea;
        
        
        while((cadena=b2.readLine()) != null)
        {
        	cadena = cadena.trim();
        	if(cadena.equals(dato)){
            	int i =0;
            	while((cadena=b2.readLine()).contains(",")){
            		matrizLinea = cadena.split(",");
    	        	for (int j = 0; j < columnas; j++) {
    	        		int actual = Integer.parseInt(matrizLinea[j].trim());
            			matriz[i][j] = actual;
    				}
    	        	i++;
            	}
            }
        }
        
        
        for(int i=0 ; i < filas; i++)
        {
        	for(int j=0; j < columnas; j++){
        		System.out.println("["+i+"]["+j+"]"+" = "+matriz[i][j] + " ");
        	}
        }
        
        return matriz;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		lectorArchivos("Grafo.arcos");
	}

}
