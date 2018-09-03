package MercadoCentral;

public abstract class Producto  {

	private Float _precio;
	
	public void setPrecio(Float unPrecio) {
		_precio = unPrecio;
	}
	
	Float precio() {
		return _precio;
	}

}
