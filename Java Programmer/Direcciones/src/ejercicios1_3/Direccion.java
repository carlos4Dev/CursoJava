package ejercicios1_3;

public class Direccion {
	private String pais;
	private String ciudad;
	private String codigoPostal;
	
	public Direccion(String pais, String ciudad, String codigoPostal) {
		super();
		this.ciudad = ciudad;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Ciudad = " + ciudad + ", País= " + pais + ", Codigo "
				+ "Postal= " + codigoPostal;
	}
	
	
	
}
