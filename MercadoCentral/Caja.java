
package MercadoCentral;

import java.util.ArrayList;

public class Caja {
	private Float montoAPagar;
	private ArrayList <Producto> productos;
	
	public Float montoAPagar() {
		return montoAPagar;
	}
	
	public void registrarProducto(Producto prod) {
		productos.add(prod);
		montoAPagar += prod.precio();
		
	}
}