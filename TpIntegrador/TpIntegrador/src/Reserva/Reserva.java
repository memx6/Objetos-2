package Reserva;

import Publicacion.Publicacion;
import Publicacion.Tipo;
import Usuarios.Usuario;
import java.util.Observable;

public class Reserva extends Observable{
	
	private String estado = "Pendiente";
	private Publicacion publicacion;
	private Usuario inquilinoInteresado;

	public Reserva(Usuario inquilino, Publicacion _publicacion ){
		this.inquilinoInteresado= inquilino;
		this.publicacion=_publicacion;
	}
	
	public Usuario obtenerInquilino() {
		return this.inquilinoInteresado;
	}
	
	public Publicacion obtenerPublicacion() {
		return this.publicacion;
	}

	public String obtenerEstado() {
		return this.estado;
	}
	
	public String tipoDeInmueble() {
		return this.publicacion.obtenerTipoInmueble().toString();
	}
	
	public Usuario obtenerPropietario() {
		return this.publicacion.obtenerPropietario();
	}
	
	/*
	 * Setea el estado de la reserva y notifica a los observadores si el estado cargado es "Cancelada" 
	 */
	public void guardarEstado(String _estado) {
		if ( _estado == "Cancelada") {
			this.estado = _estado;
			this.notifyObservers("Cancelada");
			}else {
				this.estado = _estado;
			}
	}
	
	/*
	 * Cambia el estado a "Cancelada" y notifica a los observadores de la cancelacion de la misma
	 */
	public void cancelarReserva() {
		this.guardarEstado("Cancelada");
		this.notifyObservers("Cancelada");
	}
	
	/*
	 * @see java.util.Observable#notifyObservers(java.lang.Object)
	 */
	@Override
	public void notifyObservers(Object arg){
		this.setChanged();
		super.notifyObservers(arg);
	}

	

}