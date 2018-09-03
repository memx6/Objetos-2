package Usuarios;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Publicacion.Categoria;
import Publicacion.Publicacion;
import Rankeo.Rankeo;
import Reserva.Reserva;

public class Usuario {
	
	private String nombre;
	private String email;
	private Integer telefono;
	private List<Rankeo> rankeos;
	private List<Reserva> misReservas;
	
	public Usuario(String _nombre, String _email, Integer _telefono) {
		this.nombre=_nombre;
		this.email=_email;
		this.telefono=_telefono;
	}

	public Double promedioPorCategoria(Categoria categoria) {
		return rankeos.stream().filter(rankeos->rankeos.obtenerCategoria() == categoria).mapToDouble(r->r.obtenerPuntaje()).sum() / 
				rankeos.stream().filter(rankeos->rankeos.obtenerCategoria() == categoria).count();
	}
	
	public Double promedioTotal() {
		return  rankeos.stream().mapToDouble((r->r.obtenerPuntaje())).sum() / rankeos.size();
	}
	
	public List<Reserva> misReservasFuturas(){
		return misReservas.stream().filter(reserva->reserva.obtenerPublicacion().obtenerFechaIn().
				getDayOfYear() > LocalDate.now().getDayOfYear()).collect(Collectors.toList());
	}
	
	public List<Reserva> reservaPorCiudad(String _ciudad){
		return misReservas.stream().filter(reserva-> reserva.obtenerPublicacion().obtenerCiudad() == _ciudad).collect(Collectors.toList());	
	}
	
	public void rankearPublicacion(Publicacion _publicacion, Categoria _cat, Integer _puntaje){
		_publicacion.agregarRankeo(new Rankeo(_cat, _puntaje, this,_publicacion));
	}
	
	public void rankearUsuario(Usuario _usuario, Categoria _cat, Integer _puntaje){
		_usuario.agregarRankeo(new Rankeo(_cat, _puntaje, this, _usuario));
	}
	
	public void agregarRankeo(Rankeo _rankeo) {
		this.rankeos.add(_rankeo);
	}
	
	public void generarReserva( Publicacion _publicacion) {
		this.misReservas.add(new Reserva(this, _publicacion));
	}
	
	public Integer cantidadDeVecesQueReservo() {
		return  (int) this.misReservas.stream().filter(r-> r.obtenerInquilino()== this && r.obtenerEstado() == "Aceptada").count();
	}

	public String obtenerEmail() {
		return this.email;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
	
}
