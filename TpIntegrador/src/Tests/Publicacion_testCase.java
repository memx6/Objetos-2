package Tests;
import org.mockito.Mock;


import Tp.Foto;
import Tp.Publicacion;
import Tp.Servicio;
import Tp.Tipo;
import Tp.Usuario;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Publicacion_testCase {
	
	private Publicacion publicacion ;
	private Publicacion publicacion2;
	private Tipo tipoInmueble;
	private FormaDePagoTest efectivo;
	private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
	private ArrayList<Foto>  fotos;
	private Integer precio;
	private LocalDateTime fechaIn;
	private LocalDateTime fechaOut;
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
	    tipoInmueble = mockito(Tipo.class);
	    efectivo = mock(FormaDePagoTest.class);
	    precio = 200;
	    user = mock(Usuario.class);
	    fechaIn = mock(LocalDateTime.class);
	    fechaOut = mock(LocalDateTime.class);
	    capacidad = 4;
	    pais = "Argentina";
	    ciudad = "Wilde";
	    direccion = "Mitre";
	    superficie = 200;
	    jpg1 = mock(Foto.class);
	    serv1 = mock(Servicio.class);
	    
		//sut
		
		publicacion = new Publicacion (tipoInmueble, efectivo , precio , fechaIn , fechaOut ,user, 
				                        capacidad , pais , ciudad , direccion , superficie);
		}
	
		 
	@Test
	public void test() {
		publicacion.agregarFoto(jpg1);
		
		equals(publicacion.obtenerFotos().size() == 1);
		
		publicacion.agregarServicio(serv1);
		equals(publicacion.obtenerServicios().size() == 1);
		assertEquals(true , true);
	}

}
 