package ColaboradoresDeLaPublicacion;


import static org.junit.Assert.*;
import static org.mockito.Mock.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import Publicacion.Categoria;
import Rankeo.Rankeo;
import Usuarios.Usuario;

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
	    cat1 = mock(Categoria.class);
	    cat2 = mock(Categoria.class);
	    rank1 = new Rankeo (cat1 ,10, userA , userB);
	    rank2 = new Rankeo (cat2 , 5, userB , userA);
	    when(userA.obtenerNombre()).thenReturn("Fede");
	    when(userB.obtenerNombre()).thenReturn("Mauro");
	    when(cat1.obtenerNombre()).thenReturn("Limpieza");
	    when(cat2.obtenerNombre()).thenReturn("Atencion");
	    
   }
	@Test
	public void test_RankeadoresYRankeados() {
		assertEquals(userA.obtenerNombre(), rank1.obtenerRankeador().obtenerNombre());
		assertEquals(userB.obtenerNombre(), rank1.obtenerRankeado().obtenerNombre());
		
		assertEquals(userB.obtenerNombre(), rank2.obtenerRankeador().obtenerNombre());
		assertEquals(userA.obtenerNombre(), rank2.obtenerRankeado().obtenerNombre());
	}
	@Test
	public void test_ObtencionDePuntaje() {
		assertEquals( new Integer(10) , rank1.obtenerPuntaje());
		assertEquals(new Integer(5), rank2.obtenerPuntaje());
	}
	@Test
	public void test_ObtencionDeCategoria() {
		assertEquals("Limpieza", rank1.obtenerCategoria().obtenerNombre());
		assertEquals("Atencion", rank2.obtenerCategoria().obtenerNombre());
	}

}
