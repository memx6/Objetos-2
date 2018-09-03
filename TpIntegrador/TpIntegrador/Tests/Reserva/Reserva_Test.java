package Reserva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Publicacion.Publicacion;
import Usuarios.Usuario;

public class Reserva_Test {
   private  Reserva reserva1; 
   private  Reserva reserva2;
   private  Publicacion publi1;
   private Publicacion publi2;
   private Usuario user1;
   private Usuario user2;
   
   @Before
   public void setUp() {
	  publi1 = Mockito.mock(Publicacion.class);
	  publi2 = Mockito.mock(Publicacion.class);
	  user1 = Mockito.mock(Usuario.class);
	  user2 = Mockito.mock(Usuario.class);
	  
	  reserva1 = new Reserva(user1 , publi1);
	  reserva2 = new Reserva(user2,publi2);
	  
   }
	@Test
	public void test_Cambio_Estado() {
		reserva1.guardarEstado("Cancelado");
		assertEquals (reserva1.obtenerEstado() , "Cancelado");
		reserva2.guardarEstado("Pendiente");
		assertEquals (reserva2.obtenerEstado() , "Pendiente");
	}

}
