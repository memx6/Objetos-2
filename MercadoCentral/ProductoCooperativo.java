package MercadoCentral;

public class ProductoCooperativo extends Producto{
	

	Float precio() {
		return super.precio() * 1.10f   ;  /*falta calculo */
	}

}
