package Dtos;

import java.time.LocalDate;

public class CitasDto {
	
	String Nombre = "aaaaa";
	String Apellidos = "bbbbb";
	String NombreCompleto = Apellidos + Nombre;
	String DNI = "12345678Z";
	LocalDate Instante;	
	boolean Validacion = false;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public LocalDate getInstante() {
		return Instante;
	}

	public void setInstante(LocalDate instante) {
		Instante = instante;
	}

	public boolean isValidacion() {
		return Validacion;
	}

	public void setValidacion(boolean validacion) {
		Validacion = validacion;
	}

	public CitasDto(String nombre, String apellidos, String nombreCompleto, String dNI, LocalDate instante,
			boolean validacion) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		NombreCompleto = nombreCompleto;
		DNI = dNI;
		Instante = instante;
		Validacion = validacion;
	}

	public CitasDto() {
		super();
	}

	@Override
	public String toString() {
		return "CitasDto [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", NombreCompleto=" + NombreCompleto
				+ ", DNI=" + DNI + ", Instante=" + Instante + ", Validacion=" + Validacion + "]";
	}	
}
