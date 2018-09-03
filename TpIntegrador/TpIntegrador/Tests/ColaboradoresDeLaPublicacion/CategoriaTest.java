package ColaboradoresDeLaPublicacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Publicacion.Categoria;

public class CategoriaTest {
   private Categoria c1;
   private Categoria c2;
   private Categoria c3;
   
   @Before
   public void setUp() {
	   c1 = new Categoria("Limpieza");
	   c2 = new Categoria("Trato personal");
	   c3 = new Categoria("Conformidad");
	   
   }
	@Test
	public void test() {
		assertEquals("Limpieza", c1.obtenerNombre());
		assertEquals("Trato personal", c2.obtenerNombre());
		assertEquals("Conformidad", c3.obtenerNombre());
	
	}

}
