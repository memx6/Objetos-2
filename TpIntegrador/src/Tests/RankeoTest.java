package Tests;

import static org.junit.Assert.*;
import static org.mockito.Mock.*;
import org.junit.Before;
import org.junit.Test;

import Tp.Categoria;
import Tp.Rankeo;
import Tp.Usuario;

public class RankeoTest {
   private Rankeo rank1;
   private Rankeo rank2;
   private Usuario userA;
   private Usuario userB;
   private Categoria cat1;
   private Categoria cat2;
   
   
   @Before
   public void setUp() {
	    userA= mock(Usuario.class);
	    userB= mock(Usuario.class);
	    rank1 = new Rankeo (cat1 ,10, userA , userB);
	    rank2 = new Rankeo (cat2 , 5, userB , userA);
	    when(userA.obtenerNombre()).theReturn("Fede");
	    when(UserB.obtenerNombre()).theReturn("Mauro");
	    when(cat1.obtenerNombre()).theReturn("Limpieza");
	    when(cat2.obtenerNombre()).theReturn("Atencion");
	    
   }
	@Test
	public void test() {
		assertEquals("Fede", rank1.obtenerRankeador());
		assertEquals("Mauro", rank1.obtenerRankeado());
		assertEquals( new Integer(10) , rank1.obtenerPuntaje());
		assertEquals("Limpieza", rank1.obtenerCategoria());
		
		assertEquals("Mauro", rank2.obtenerRankeador());
		assertEquals("Fede", rank2.obtenerRankeado());
		assertEquals(new Integer(5), rank2.obtenerPuntaje());
		assertEquals("Atencion", rank2.obtenerCategoria());
		
	}

}
