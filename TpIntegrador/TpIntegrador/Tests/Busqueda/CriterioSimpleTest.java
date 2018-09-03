package Busqueda;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class CriterioSimpleTest {
    private Criterio_Simple criterio1;
    private Criterio_Simple criterio2;
    
    @Before
    public void setUp() {
    	criterio1 = new Criterio_Simple ( "Cordoba" , LocalDate.now(), LocalDate.now());
    	criterio2 = new Criterio_Simple ("Mendoza", LocalDate.now(), LocalDate.now());
    
    	
    }
	@Test
	public void test() {
		criterio1.guardarCapacidad(4);
		criterio1.guardarPrecioMax(200);
		criterio1.guardarPrecioMin(20);
		
		assertEquals(new Integer(4) , criterio1.obtenerCapacidad());
		assertEquals(new Integer( 200), criterio1.obtenerPrecioMax());
		assertEquals(new Integer(20), criterio1.obtenerPrecioMin());
		assertEquals("Cordoba", criterio1.obtenerCiudad());
		assertEquals(LocalDate.now() , criterio1.obtenerFechaIn());
		assertEquals(LocalDate.now(), criterio1.obtenerFechaOut());
		assertEquals("Mendoza", criterio2.obtenerCiudad());
		assertEquals(LocalDate.now() , criterio2.obtenerFechaIn());
		assertEquals(LocalDate.now(), criterio2.obtenerFechaOut());
	}
}	
	
	

