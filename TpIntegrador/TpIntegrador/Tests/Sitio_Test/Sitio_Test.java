package Sitio_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import Publicacion.Categoria;
import Publicacion.FormaDePago;
import Publicacion.Publicacion;
import Publicacion.Servicio;
import Publicacion.Tipo;
import SitioWeb.Sitio;
import Usuarios.Usuario;

public class Sitio_Test {
	
	private Sitio sitio;
	private FormaDePago  efectivo;
	private Categoria cat1;
	private Servicio servi;
	private Publicacion publi1;
	private Publicacion publi2;
	private Tipo tipo;
	private Usuario user1;
	private Usuario user2;
	
	@Before 
	public void setUp() {
		sitio = new Sitio();
		efectivo = mock(FormaDePago.class);
		cat1 = mock(Categoria.class);
		servi = mock(Servicio.class);
		publi1 = mock(Publicacion.class);
		publi2 = mock(Publicacion.class);
		tipo = mock(Tipo.class);
		user1 = mock(Usuario.class);
		user2 = mock(Usuario.class);
		when (efectivo.obtenerNombre()).thenReturn("Tarjeta");
		when (cat1.obtenerNombre()).thenReturn("limpio");
		when (tipo.obtenerTipoInmueble()).thenReturn("Ph");
	}
	@Test
	public void test_deAltas() {
		sitio.darAltaCategoria(cat1);
		assertEquals(sitio.obtenerCategorias().size(), 1);
		sitio.darAltaServicio(servi);
		assertEquals(sitio.obtenerServicios().size(), 1);
		sitio.darAltaTipoInmueble(tipo);
		assertEquals(sitio.obtenerTipoDeInmuebles().size(), 1);
	}
	@Test
	public void test_De_Obtencion_De_Colaboradores() {
		sitio.darAltaCategoria(cat1);
		assertEquals(sitio.obtenerCategorias() , );
		sitio.darAltaServicio(servi);
		assertEquals(sitio.obtenerServicios(), servi);
		sitio.darAltaTipoInmueble(tipo);
		assertEquals(sitio.obtenerTipoDeInmuebles(), tipo);
		
	}
}
