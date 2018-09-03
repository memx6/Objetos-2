package Tp;
import java.util.ArrayList;

public class Sitio {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Servicio> servicios;
	private ArrayList<Tipo> tiposDeInmuebles;
	private ArrayList<Categoria> categorias;
	private ArrayList<Publicacion> publicaciones;
	private ArrayList<Reserva> reservas;
	
	public void realizarReserva(FormaDePago _formaDePago, Publicacion unaPublicacion) {
		
	}
	public void enviarReservar (Reserva unaReserva) {
		
	}
	public void cancelarReservar (Reserva unaReserva) {
		this.reservas.stream().unaReserva.cambiarEstado("Cancelado")
		
	}
	public ArrayList<Publicacion> buscarPublicacion(Criterio unCriterioDeBusqueda){
	}

}
