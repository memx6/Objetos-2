package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tp.Tipo;

public class TipoTest {
	private Tipo  inmueble1;
	private Tipo  inmueble2;
	private Tipo  inmueble3;
    
	@Before
	public void setUp() {
		inmueble1 = new Tipo ("Inmueble");
		inmueble2 = new Tipo ("PH");
		inmueble3 = new Tipo ("Apart");
	}
	
	@Test
	public void test() {
		assertEquals("Inmueble" , inmueble1.obtenerTipoInmueble());
		// assertEquals("inmueble" , inmueble1.obtenerTipoInmueble());
		assertEquals("PH", inmueble2.obtenerTipoInmueble());
		assertEquals("Apart", inmueble3.obtenerTipoInmueble());
		
	}

}
