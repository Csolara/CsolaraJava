package Servicios;

import java.time.LocalDate;
import java.util.Scanner;

import Dtos.CitasDto;
import Dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {

	public void RegistroCliente() {

		CitasDto citas = new CitasDto();

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el DNI: ");
		citas.setDNI(sc.next());
		
		System.out.println("Introduzca el nombre: ");
		citas.setNombre(sc.next());

		System.out.println("Introduzca los apellidos: ");
		citas.setApellidos(sc.next());
		
		citas.setNombreCompleto(citas.getApellidos() + " " + citas.getNombre());		
		
		LocalDate fechaRegistro = LocalDate.now();
		citas.setInstante(fechaRegistro);
		
		System.out.println("======DATOS======");
		System.out.println("Nombre completo: " + citas.getNombreCompleto());	
		System.out.println("DNI: " + citas.getDNI());		
		System.out.println("Fecha del registro: " + citas.getInstante());
		System.out.println("=================");		

	}
	

	public void SolicitudCitaMedica() {
		
		CitasDto citas = new CitasDto();
		ClienteDto clientes = new ClienteDto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el DNI del ciente: ");
		String DNI = sc.next();
		
		if(DNI == citas.getDNI() && citas.isValidacion() == true) {
			
			int recogido = ESPECIALIDAD();
			switch(recogido) {
			case 0:
				System.out.println("Ha seleccionado Psicología, indique la hora y la fecha a la que desea la cita (dd-MM-yyyy): ");
				 clientes.setFecha(sc.next());
				break;
			case 1:
				System.out.println("Ha seleccionado Traumatología, indique la hora y la fecha a la que desea la cita (dd-MM-yyyy): ");
				clientes.setFecha(sc.next());
				break;
			case 2:
				System.out.println("Ha seleccionado Fisioterapia, indique la hora y la fecha a la que desea la cita (dd-MM-yyyy): ");
				clientes.setFecha(sc.next());
				break;
			default:
				System.out.println("La opcion que ha seleccionado no coincide con ninguna.");
				break;
			}
			
		}else {
			
			System.out.println("El DNI introduzico no existe.");
			
		}

	}
	
	public int ESPECIALIDAD() {
		
		Scanner sc = new Scanner(System.in);

		int opcionseleccionada;

		System.out.println("####################");
		System.out.println("0. Psicología.");
		System.out.println("1. Traumatología.");
		System.out.println("2. Fisioterapia.");
		System.out.println("####################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
		
	}

	public void ConsultaCitasMedicas() {

	}
}
