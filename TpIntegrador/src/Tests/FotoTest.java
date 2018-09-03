package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tp.Foto;

public class FotoTest {
	  private Foto jpg1;
	  private Foto jpg2;
	  private Foto jpg3;
	
	  @Before 
	  
	  public void setUp() {
		   jpg1= new Foto("jpg1");
		   jpg2= new Foto("Jpg2");
		   jpg3= new Foto("jpg3");
		   
	  }

	@Test
	public void testFoto() {
		assertEquals ("jpg1", jpg1.obtenerNombre());
		assertEquals( "Jpg2", jpg2.obtenerNombre());
		assertEquals( "jpg3", jpg3.obtenerNombre());
		
		
	}

}
