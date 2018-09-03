package Tp;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Usuario {
	
	private String nombre;
	private String email;
	private Integer telefono;
	private Propietario propietario;
	private ArrayList<Rankeo> rankeos;
	private ArrayList<Reserva> misReservas;
	
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
	
	public Stream<Reserva> misReservasFuturas(){
		return misReservas.stream().filter(reserva->reserva.obtenerPublicacion().obtenerFechaIN().getDayOfYear() > LocalDateTime.now().getDayOfYear());
	}
	
	public Stream<Reserva> reservaPorCiudad(String _ciudad){
		return misReservas.stream().filter(reserva-> reserva.obtenerPublicacion().obtenerCiudad() == _ciudad);
	}

	public String obtenerNombre() {
		return this.nombre;
	}
	
	//public void rankearPublicacion(Publicacion _publicacion, Categoria _cat, Integer _puntaje);
	
	//public void rankearUsuario(Usuario _usuario, Categoria _cat, Integer _puntaje);
	
	
	
}
