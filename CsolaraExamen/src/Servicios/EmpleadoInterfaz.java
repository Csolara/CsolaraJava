package Servicios;

/*
 * Interfaz que contiene los metodos del empleado.
 * CSL - 07052024 
 */
public interface EmpleadoInterfaz {
	
	/*
	 * Metodo que valida un nuevo cliente introduciendo su DNI.
	 * CSL - 07052024 
	 */
	public void ValidarNuevoCliente();
	
	/*
	 * Metodo que imprime todas las citas medicas del dia que haya especificado el usuario.
	 * CSL - 07052024 
	 */
	public void ImprimirCitasMedicas();

}
