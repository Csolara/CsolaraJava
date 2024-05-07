package Dtos;

public class ClienteDto {
	
	String fecha = "dd-MM-yyyy";

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ClienteDto(String fecha) {
		super();
		this.fecha = fecha;
	}

	public ClienteDto() {
		super();
	}

	@Override
	public String toString() {
		return "ClienteDto [fecha=" + fecha + "]";
	}
	
	
}
