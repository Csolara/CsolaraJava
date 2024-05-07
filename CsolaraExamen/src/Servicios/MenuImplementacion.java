package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	public int MENU() {

		Scanner sc = new Scanner(System.in);

		int opcionseleccionada;

		System.out.println("####################");
		System.out.println("0. Cerrar aplicacion.");
		System.out.println("1. Empleados.");
		System.out.println("2. Clientes.");
		System.out.println("####################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
	}

	public int EMPLEADOS() {

		Scanner sc = new Scanner(System.in);

		int opcionseleccionada;

		System.out.println("####################");
		System.out.println("0. Validar nuevo cliente.");
		System.out.println("1. Imprimir citas médicas para un dia especifico.");
		System.out.println("####################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
	}
	
	public int CLIENTES() {
		
		Scanner sc = new Scanner(System.in);

		int opcionseleccionada;

		System.out.println("####################");
		System.out.println("0. Registro de cliente.");
		System.out.println("1. Solicitud de cita médica.");
		System.out.println("2. Consultar citas medicas para un intervalo de tiempo.");
		System.out.println("####################");

		opcionseleccionada = sc.nextInt();
		return opcionseleccionada;
	}
}
