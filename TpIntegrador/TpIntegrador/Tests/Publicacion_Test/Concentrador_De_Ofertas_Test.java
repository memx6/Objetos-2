package Publicacion_Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;

import Publicacion.ConcentradorDeOfertas;
import Publicacion.HomePagePublisher;
import Publicacion.Publicacion;


public class Concentrador_De_Ofertas_Test {

		private ConcentradorDeOfertas concentrador;
		private HomePagePublisher homePage;
		private Publicacion publicacion;

		@Before
		public void setUp() throws Exception {
			publicacion = mock(Publicacion.class);
			homePage = mock(HomePagePublisher.class);
			concentrador = new ConcentradorDeOfertas( homePage);
		}

		@Test
		public void test_cuandoSeLlamaAUpdateDeUnConcentradorDeOfertasSePublicaElMensajeCorrecto() {
			when(publicacion.obtenerTipoInmueble().obtenerTipoInmueble()).thenReturn("monoambiente");
			when(publicacion.obtenerPrecio()).thenReturn(new Integer(1000));
			
			concentrador.update(publicacion, "BajaDePrecio");
			verify(homePage, times(1)).publish("No te pierdas esta oferta: Un inmueble monoambiente a tan sólo 1000 pesos");
		}

	}
