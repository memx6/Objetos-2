package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tp.Administrador;

public class Administrador_Test {
	private Administrador admin;
	private Sitio sitio;
	private Categoria cat1;
	private Servicio servi;
	private Publicacion publi1;
	private Publicacion publi2;
	private TipoDeInmueble tipo;
	
	@Before 
	public void setUp() {
		admin = new Administrador();
		sitio = mock(Sitio.class);
		cat1 = mock(Categoria.class);
		servi = mock(Servicio.class);
		publi1 = mock(Publicacion.class);
		publi2 = mock(Publicacion.class);
		tipo = mock(TipoDeInmueble.class);
	}
	@Test
	public void test() {
		when(cat1.nombre().thenReturn("limpo"));
		admin.darAltaCategoria(cat1);
		
		when(servi.nombre().thenReturn("wifi"));
		admin.darAltaServicio(servi);
		
		when(tipo.nombre().thenReturn("Ph"));
		admin.darAltaTipoInmueble(tipo);
		
		
	}
}


