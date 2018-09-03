package Publicacion_Test;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Publicacion.FormaDePago;
import Publicacion.Foto;
import Publicacion.Publicacion;
import Publicacion.Servicio;
import Publicacion.Tipo;
import Usuarios.Usuario;

import static org.mockito.Mockito.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class PublicacionTest {
	
	private Publicacion publicacion ;
	private Publicacion publicacion2;
	private Tipo tipoInmueble;
	private FormaDePago efectivo;
	private List<Servicio> servicios = new ArrayList<Servicio>();
	private List<Foto>  fotos;
	private Integer precio;
	private LocalDate fechaIn;
	private LocalDate fechaOut;
	private Usuario user ;
	private Integer capacidad;
	private String pais;
	private String ciudad;
	private String direccion;
	private Integer superficie;
	private Foto jpg1;
	private Servicio serv1 ;
	
	@Before
	public void setUp() {
		
		//Dot
	    tipoInmueble = mock(Tipo.class);
	    efectivo = mock(FormaDePago.class);
	    precio = 200;
	    user = mock(Usuario.class);
	    fechaIn = LocalDate.now();
	    fechaOut = LocalDate.now();
	    capacidad = 4;
	    pais = "Argentina";
	    ciudad = "Wilde";
	    direccion = "Mitre";
	    superficie = 200;
	    jpg1 = mock(Foto.class);
	    serv1 = mock(Servicio.class);
	    publicacion = new Publicacion (tipoInmueble, efectivo , precio , fechaIn , fechaOut ,user ,capacidad , pais , ciudad , direccion , superficie);
		when(tipoInmueble.obtenerTipoInmueble().thenReturn("Depto"));
	    
	    
	
	}


	
		 
	@Test
	 public void testPruebaPublicacion() {
		publicacion.agregarFoto(jpg1);
	    publicacion.agregarServicio(serv1);
	
		
	    assertEquals(1, publicacion.obtenerFotos().size());
	    assertEquals(1, publicacion.obtenerServicios().size());
		assertEquals(new Integer(4), publicacion.obtenerCapacidad());
		assertEquals(new Integer(200), publicacion.obtenerPrecio());
		assertEquals(new Integer(200), publicacion.obetenerSuperficie());
		assertEquals("Mitre" , publicacion.obtenerDireccion());
		assertEquals("Argentina", publicacion.obtenerPais());
		assertEquals("Wilde", publicacion.obtenerCiudad());
		
		
	
	}

}
