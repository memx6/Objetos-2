package Tp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Publicacion {
    
	private Tipo tipoInmueble;
	private FormaDePagoTest formaDePago;
	private Integer precio;
	private ArrayList<Foto> fotos = new ArrayList<Foto>();
	private ArrayList<Servicio> servicios= new ArrayList<Servicio>() ;
	private ArrayList<Rankeo> rankeos = new ArrayList<Rankeo>();
	private LocalDateTime horaIn;
	private LocalDateTime horaOut;
	private Usuario propietario;
	private Integer capacidad;
	private String pais;
	private String direccion;
	private String ciudad;
	private Integer superficie;
	
	public Publicacion (Tipo _inmueble , FormaDePagoTest _formapago , Integer _precio , LocalDateTime _horaIn ,
			            LocalDateTime _horaOut , Usuario _user , Integer _capacidad , String _pais ,
			              String _dir , String _ciudad ,Integer _sup) {
		   
		       this.tipoInmueble = _inmueble;
		       this.formaDePago = _formapago;
		       this.precio = _precio;
		       this.horaIn = _horaIn;
		       this.horaOut = _horaOut;
		       this.propietario = _user;
		       this.capacidad = _capacidad;
		       this.pais = _pais;
		       this.direccion = _dir;
		       this.ciudad = _ciudad;
		       this.superficie = _sup;
		       
	}
	
	//getters
	public ArrayList<Servicio> obtenerServicios(){
		 return this.servicios;
	}
	
	public ArrayList<Foto> obtenerFotos(){
		  return this.fotos;
	}
	
	public Tipo getInmueble() {
		 return this.tipoInmueble; 
	   }
	
	public FormaDePagoTest obtenerFormaDePago() {
		 return this.formaDePago;  
	}
	
	public Integer obtenerPrecio() {
		 return this.precio;
	}
	
	public LocalDateTime obtenerHoraIn() {
		 return this.horaIn;
	}
	
	public LocalDateTime obtenerHoraOut() {
		 return this.horaOut;
	}
	
	public Usuario obtenerPropietario() {
		 return this.propietario;
	}
	
	public Integer obtenerCapacidad() {
		 return this.capacidad;
	}
	
	public String obtenerPais() {
		 return this.pais;
	}
	
	public String obtenerDireccion() {
		 return this.direccion;
	}
	
	public String obtenerCiudad() {
		 return this.ciudad;
	}
	
	public Integer obetenrSuperficie() {
		 return this.superficie;
	}
	public ArrayList<Rankeo> obtenetRankeos(){
		 return this.rankeos;
	}
	
	
	//acciones:
	 public void agregarFoto(Foto _foto) {
		   this.obtenerFotos().add(_foto);
	 }
	 
	 public void agregarServicio(Servicio _serv) {
		   this.obtenerServicios().add(_serv);
	 }
	
	
                     
}
