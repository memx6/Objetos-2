package MercadoCentral;

public class Servicio extends Factura{

	private int costoUnidadConsumida;
	private int unidadesConsumidas;
	
	public void setServicio (int unidades, int costoUnidad) {
		unidadesConsumidas = unidades;
		costoUnidadConsumida = costoUnidad;
	}
	public int montoAPagar() {
		return (this.costoUnidadConsumida * this.unidadesConsumidas);
	}
	
	public void registrarPago() {
		
	}
}
