package ejercicio5;

public class Factura {
	int numeroFactura;
	
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public Factura(int numeroFactura) {
		super();
		this.numeroFactura = numeroFactura;
	}
	@Override
	public String toString() {
		return "Factura nº: ****" + numeroFactura + " ****";
	}
	
	
}
