package Servicios;

/*
 * Interfaz que contiene todos los metodos del cliente.
 * CSL - 07052024 
 */
public interface ClienteInterfaz {	
	
	/*
	 * Metodo que registra un nuevo cliente pidiendo por pantalla la informacion necesaria.
	 * CSL - 07052024 
	 */
	public void RegistroCliente();
	
	/*
	 * Metodo que pide por pantalla el DNI y en caso de ser correcto muestra un menu para seleccionar la especialidad que desee el usuario.
	 * CSL - 07052024 
	 */
	public void SolicitudCitaMedica();
	
	/*
	 * Menu de la especialidad.
	 * CSL - 07052024 
	 */
	public int ESPECIALIDAD();
	
	/*
	 * Metodo quesolicita un DNI y dos fechas y mostrara todas las citas medicas en ese intervalo de tiempo.
	 * CSL - 07052024 
	 */
	public void ConsultaCitasMedicas();

}
