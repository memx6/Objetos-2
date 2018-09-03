package SitioWeb;
import java.util.ArrayList;
import java.util.List;

import Busqueda.Busqueda;
import Busqueda.Criterio;
import Publicacion.Categoria;
import Publicacion.FormaDePago;
import Publicacion.Publicacion;
import Publicacion.Servicio;
import Publicacion.Tipo;
import Reserva.Reserva;
import Usuarios.Usuario;

public class Sitio {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Servicio> servicios = new ArrayList<Servicio>();
	private List<Tipo> tiposDeInmuebles = new ArrayList<Tipo>();
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	private List<Reserva> reservas = new ArrayList<Reserva>();
	private MailServer servidorDeMail;
	private Busqueda _busqueda;
	
	public Sitio(MailServer mail) {
		this.servidorDeMail = mail;
	}
	public void realizarReserva(FormaDePago _formaDePago, Publicacion unaPublicacion) {
		
	}
	public void cancelarReserva (Reserva unaReserva) {
		unaReserva.guardarEstado("Cancelado");
		reservas.remove(unaReserva);
		this.servidorDeMail.sendMail(unaReserva.obtenerInquilino().obtenerEmail(),
				unaReserva.obtenerInquilino().obtenerNombre(), "Reserva cancelada");
			//Notificar a los observadores.
	}
	/* 
	 * Busca en las publicaciones del sitio las publicaciones que cumplan con los criterios de busqueda seleccionados
	 */
	public List<Publicacion> buscarPublicacion(Criterio unCriterioDeBusqueda){
		return this._busqueda.buscarPublicacion(unCriterioDeBusqueda,this.obtenerPublicaciones());
	}
	/*
	 * Crea un nuevo tipo de servicio
	 */
	public void darAltaServicio (Servicio unServicio) {
		this.servicios.add(unServicio);		
	}
	
	public List<Servicio> obtenerServicios() {
		return this.servicios;
	}
	/*
	 * Crea un nuevo tipo de Categoria
	 */
	public void darAltaCategoria(Categoria unaCategoria) {
		this.categorias.add(unaCategoria);
	}
	
	public List<Categoria> obtenerCategorias() {
		return this.categorias;
	}
	/*
	 * Da de alta un nuevo tipo de inmueble
	 */
	public void darAltaTipoInmueble(Tipo unTipo) {
		this.tiposDeInmuebles.add(unTipo);
	}
	
	public List<Tipo> obtenerTipoDeInmuebles() {
		return this.tiposDeInmuebles;
	}
	/*
	 * Agrega un nuevo usuario a la lista de usuarios
	 */
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public List<Usuario> obtenerUsuarios(){
		return this.usuarios;
	}
	
	public List <Reserva> obtenerReservas(){
		return this.reservas;
	}
	
	public void agregarPublicacion(Publicacion publicacion) {
		this.publicaciones.add(publicacion);
	}
	
	public List<Publicacion> obtenerPublicaciones(){
		return this.publicaciones;
	}
	
	//public ArrayList<Usuario> topTenInquilinos(){
	//	this.obtenerUsuarios().stream().map(u ->u.cantidaDeVecesQueAlquile())
	//}
	//public ArrayList<Publicacion> inmueblesLibres(){
		
	//}
	public void agregarPublicacionesPendientes() {
		
	}

}



