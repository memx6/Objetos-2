package ColaboradoresDeLaPublicacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Publicacion.FormaDePago;

public class FormaDePagoTest {
	private FormaDePago efectivo;
	private FormaDePago tarjeta;
	private FormaDePago debito;
	
	@Before 
	
	public void setUp() {
		 efectivo = new FormaDePago("Efectivo");
		 tarjeta = new FormaDePago("Tarjeta");
		 debito = new FormaDePago("Debito");
	}
	
	@Test
	public void test() {
		assertEquals ("Efectivo", efectivo.obtenerNombre());
		
		assertEquals ("Tarjeta" , tarjeta.obtenerNombre());
		
		assertEquals ("Debito"  ,debito.obtenerNombre());
		
	}

}
