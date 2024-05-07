package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.CitasDto;
import Dtos.ClienteDto;
import Servicios.ClienteImplementacion;
import Servicios.ClienteInterfaz;
import Servicios.EmpleadoImplementacion;
import Servicios.EmpleadoInterfaz;
import Servicios.FicheroImplementacion;
import Servicios.FicheroInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

/*
 * Clase principal de la aplicacion.
 * CSL - 07052024 
 */
public class Inicio {

	 public static List<CitasDto> listacitas = new ArrayList<CitasDto>();
	 public static List<ClienteDto> listaclientes = new ArrayList<ClienteDto>();
	
	 
	/*
	 * Metodo principal de la aplicacion.
	 * CSL - 07052024 
	 */
	public static void main(String[] args) {		
		
		FicheroInterfaz fi = new FicheroImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		ClienteInterfaz ci = new ClienteImplementacion();
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			int recogido = mi.MENU();
			switch(recogido) {
			case 0:				
				String mensaje1 = ("Cerrar aplicacion.");
				fi.FICHERO(mensaje1);
				cerrarMenu = true;
				break;
			case 1:
				int recogido2 = mi.EMPLEADOS();
				String mensaje2 = ("Empleados.");
				fi.FICHERO(mensaje2);
				switch(recogido2) {
				case 0:
					ei.ValidarNuevoCliente();
					String mensaje3 = ("Validar nuevo cliente.");
					fi.FICHERO(mensaje3);
					break;
				case 1:
					
					String mensaje4 = ("Imprimir citas médicas para un dia especifico.");
					fi.FICHERO(mensaje4);
					break;
				default:
					System.out.println("La opcion que ha seleccionado no coincide con ninguna");
					break;
				}
				break;
			case 2:
				int recogido3 = mi.CLIENTES();
				String mensaje3 = ("Clientes.");
				fi.FICHERO(mensaje3);
				switch(recogido3) {
				case 0:
					ci.RegistroCliente();
					String mensaje4 = ("Registro de cliente.");
					fi.FICHERO(mensaje4);
					break;
				case 1:
					ci.SolicitudCitaMedica();
					String mensaje5 = ("Solicitud de cita médica.");
					fi.FICHERO(mensaje5);
					break;
				case 2:
					
					String mensaje6 = ("Consultar citas medcas para un intervalo de tiempo.");
					fi.FICHERO(mensaje6);
					break;
				default:
					System.out.println("La opcion que ha seleccionado no coincide con ninguna");
					break;
				}
				break;				
			default:
				System.out.println("La opcion que ha seleccionado no coincide con ninguna");
				break;
			}
		}

	}

}
