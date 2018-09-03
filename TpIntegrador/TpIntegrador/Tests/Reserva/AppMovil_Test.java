package Reserva;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import Reserva.PopUpWindow;
import Reserva. Reserva;

public class AppMovil_Test {
	private AppMovil app;
	private Reserva reservaDeInteres;
	private PopUpWindow window;
	
	@Before 
	public void setUp() throws Exception{
		window = mock(PopUpWindow.class);
		app = new AppMovil(window);
		reservaDeInteres = mock(Reserva.class);
	}
	
	@Test
	public void test_LaAppMovilAlRecibirUnaReservaCanceladaMuestraSuCorrectoMensajeDePopUpWindow() {
		when(reservaDeInteres.tipoDeInmueble()).thenReturn(" ph ");
		app.update(reservaDeInteres, "Cancelada");
		
		verify(window, times(1)).popUp("El/la ph que te interesa se ha liberado! Corre a reservarlo!", "Azul", 36);
	}
}


