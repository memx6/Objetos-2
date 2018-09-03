package Tp;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Propietario {
	
	private Integer antiguedad;
	private ArrayList<Reserva> reservas;
	
	public Propietario(Integer _antiguedad) {
		this.antiguedad = _antiguedad;
	}
	
	public Integer cantidadDeVecesQueAlquilo(){
		return this.reservas.size();
	}
	
	public void contestarReserva(Reserva _reserva, String _estado) {
		_reserva.guardarEstado(_estado);
	}

	public ArrayList<Reserva> reservasPendientes(){
		return this.reservas.stream().filter(r->r.obtenerEstado() == 'Pendiente');
	}
}
