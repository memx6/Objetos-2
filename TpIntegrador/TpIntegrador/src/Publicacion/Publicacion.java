package Publicacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Observable;

import Rankeo.Rankeo;
import Usuarios.Usuario;

public class Publicacion extends Observable{
    

	private Tipo tipoInmueble;
	private FormaDePago formaDePago;
	private Integer precio;
	private List<Foto> fotos = new ArrayList<Foto>();
	private List<Servicio> servicios= new ArrayList<Servicio>() ;
	private List<Rankeo> rankeos = new ArrayList<Rankeo>();
	private LocalDate fechaIn;
	private LocalDate fechaOut;
	private Usuario propietario;
	private Integer capacidad;
	private String pais;
	private String direccion;
	private String ciudad;
	private Integer superficie;
	
	public Publicacion (Tipo _inmueble , FormaDePago _formapago , Integer _precio , LocalDate _fechaIn ,
			            LocalDate _fechaOut , Usuario _user , Integer _capacidad , String _pais ,
			              String _dir , String _ciudad ,Integer _sup) {
		   
		       this.tipoInmueble = _inmueble;
		       this.formaDePago = _formapago;
		       this.precio = _precio;
		       this.fechaIn = _fechaIn;
		       this.fechaOut = _fechaOut;
		       this.propietario = _user;
		       this.capacidad = _capacidad;
		       this.pais = _pais;
		       this.direccion = _dir;
		       this.ciudad = _ciudad;
		       this.superficie = _sup;
		       
	}
	
	//getters
	public List<Servicio> obtenerServicios(){
		 return this.servicios;
	}
	
	public List<Foto> obtenerFotos(){
		  return this.fotos;
	}
	
	public Tipo obtenerTipoInmueble() {
		 return this.tipoInmueble; 
	   }
	
	public FormaDePago obtenerFormaDePago() {
		 return this.formaDePago;  
	}
	
	public Integer obtenerPrecio() {
		 return this.precio;
	}
	
	public LocalDate obtenerFechaIn() {
		 return this.fechaIn;
	}
	
	public LocalDate obtenerFechaOut() {
		 return this.fechaOut;
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
	
	public Integer obetenerSuperficie() {
		 return this.superficie;
	}
	public List<Rankeo> obtenerRankeos(){
		 return this.rankeos;
	}
	public void guardarPrecio(Integer _precio) {
		     if( _precio < this.obtenerPrecio()) {
		    	 this.precio = _precio;
		    	 this.notifyObservers("BajaDePrecio");
		     }else{
		    	 this.precio = _precio;
		     }
	 }
	
	
	//Patron Observer
	
	@Override
	public void notifyObservers(Object arg){
		this.setChanged();
		super.notifyObservers(arg);
	}
	
	//generalidades de la publicacion
	 public void agregarFoto(Foto _foto) {
		   this.obtenerFotos().add(_foto);
	 }
	 
	 public void agregarServicio(Servicio _serv) {
		   this.obtenerServicios().add(_serv);
	 }
	 
	 
	 public Integer precioEstadia(LocalDate _fechaIn , LocalDate fechaOut) {
		  Integer precioFinal = 0 ;	
		  for (LocalDate index : this.obtenerPeriodo(_fechaIn , fechaOut)) {
		 		 if( this.esfechaEspecial(index)) {
		 			     precioFinal +=  this.obtenerPrecio() * 2;
		 		 }else {
		 			  precioFinal +=  this.obtenerPrecio();
		 		 }
		 	}
		  return precioFinal;
         }
	 
	    
     public boolean esfechaEspecial(LocalDate _fecha) {
				return false;
	}

	public List<LocalDate> obtenerPeriodo(LocalDate fechaIn, LocalDate fechaOut){
   	    LocalDate retorno  = fechaIn ;
          List<LocalDate> periodo= new ArrayList<LocalDate>();
         
       	    while (retorno != this.obtenerFechaOut()) {
       	        periodo.add(retorno);
       	        retorno.plus(1, ChronoUnit.DAYS);
       	    }
          
           periodo.add(this.obtenerFechaOut());
           return periodo;
   		
     }
	
	 // rankeo
	
	public Double promedioPorCategoria(Categoria categoria) {
		return rankeos.stream().filter(rankeos->rankeos.obtenerCategoria() == categoria).mapToDouble(r->r.obtenerPuntaje()).sum() / 
				rankeos.stream().filter(rankeos->rankeos.obtenerCategoria() == categoria).count();
	}
	
	public Double promedioTotal() {
		return  rankeos.stream().mapToDouble((r->r.obtenerPuntaje())).sum() / rankeos.size();
	}

	 public void agregarRankeo(Rankeo rankeo) {
	        this.obtenerRankeos().add(rankeo);
		
	}
	 
	 //calendario
	 
	// public boolean esfechaDisponible(LocalDate fecha) {
	//	        return	this.calendario.
	// }
	
                     
}
