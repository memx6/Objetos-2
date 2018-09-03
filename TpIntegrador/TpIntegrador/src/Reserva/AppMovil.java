package Reserva;


import Reserva.PopUpWindow;
import java.util.Observable;
import java.util.Observer;
import Reserva.Reserva;

public class AppMovil implements Observer {
	

	private PopUpWindow popUpWindow;
	
	public AppMovil(PopUpWindow window) {
		this.popUpWindow = window;
	}
	/*
	 * Recibe la notificacion su observable con el argumento modificado para realizar el envio del popUp
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		Reserva reservaDeInteres = (Reserva) arg0;
		if (arg1.toString().equals("Cancelada")){
			popUpWindow.popUp("El/la" + reservaDeInteres.tipoDeInmueble() + "que te interesa se ha liberado! Corre a reservarlo!", "Azul", 36);
		}
	}
	
}
