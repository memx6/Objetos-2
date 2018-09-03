package ColaboradoresDeLaPublicacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Publicacion.Servicio;

public class ServicioTest {
	private Servicio serv1;
	private Servicio serv2;
	private Servicio serv3;

	@Before
	public void setUp() {
		serv1 = new Servicio("WIFI");
		serv2 = new Servicio("TV");
		serv3 = new Servicio("Caja de seguridad");
	}
	@Test
	public void test() {
		
		assertEquals("WIFI" , serv1.obtenerServicio());
		assertEquals("TV", serv2.obtenerServicio());
		assertEquals("Caja de seguridad", serv3.obtenerServicio());
		
	}

}
