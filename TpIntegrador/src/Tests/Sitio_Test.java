package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Tp.FormaDePago;
import Tp.Publicacion;
import Tp.Sitio;

public class Sitio_Test {
	
	private Sitio sitio;
	private FormaDePago  efectivo;
	private Publicacion publicacion;
	
	@Before 
	public void setUp() {
		sitio = new Sitio();
		efectivo = mock(FormaDePago.class);
		publicacion = mock(Publicacion.class);
		
	}
	@Test
	public void test() {
		when (sitio.realizarReserva(efectivo, publicacion))
		}

}
