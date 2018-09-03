package Usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Reserva.Reserva;


public class Propietario {
	
	private Integer antiguedad;
	private ArrayList<Reserva> reservas;
	private Usuario usuario;
	
	public Propietario(Integer _antiguedad) {
		this.antiguedad = _antiguedad;
	}
	
	public Integer cantidadDeVecesQueAlquilo(){
		return this.reservas.size();
	}
	
	public void contestarReserva(Reserva _reserva, String _estado) {
		_reserva.guardarEstado(_estado);
	}

	public List<Reserva> reservasPendientes(){
		return this.reservas.stream().filter(r->r.obtenerEstado() == "Pendiente").collect(Collectors.toList());
	}
	
	
}
