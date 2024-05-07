package Servicios;

import java.util.Scanner;

import Dtos.CitasDto;

/*
 * Clase que implementa la interfaz del empleado.
 * CSL - 07052024 
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {
	
	public void ValidarNuevoCliente() {
		
		CitasDto listacitas = new CitasDto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el DNI que desea validar: ");
		String DNIValidar = sc.next();
		
		if(listacitas.isValidacion() == false && DNIValidar == listacitas.getDNI()) {
			
			System.out.println("El cliente ha sido validado.");
			listacitas.setValidacion(true);
			
		}else {
			
			System.out.println("El dni introducido no existe.");
			
		}		
	}
	
	public void ImprimirCitasMedicas() {		
		
		
		
	}
}
