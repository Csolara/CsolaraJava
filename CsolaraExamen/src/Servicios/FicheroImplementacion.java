package Servicios;

import java.io.FileWriter;
import java.time.LocalDate;

/*
 * Clase que implementa la interfaz del fichero.
 * CSL - 07052024 
 */
public class FicheroImplementacion implements FicheroInterfaz {	

	public void FICHERO(String texto) {
		
		String fichero = "C:\\Users\\Profesor\\Desktop\\log-07052024.txt";

		LocalDate fecha = LocalDate.now();		

		try {

			FileWriter escribir = new FileWriter(fichero, true);

			escribir.write(fecha + " " + texto + "\n");

			escribir.close();

		} catch (Exception e) {
			
		}
	}	
}
