package Busqueda;

import java.time.LocalDate;
import java.util.List;

import Publicacion.Publicacion;

public abstract class Criterio {

	       private String ciudad;
	       private LocalDate fechaIn;
	       private LocalDate fechaOut;
	       
	       public Criterio ( String _srt , LocalDate _date1 , LocalDate _date2) {
	    	     this.ciudad = _srt;
	    	     this.fechaOut =_date2;
	    	     this.fechaIn = _date1;
	    	     
	       }
	       
	       public String obtenerCiudad() {
	    	    return this.ciudad;
	       }
	       
	       public LocalDate obtenerFechaIn() {
	    	    return this.fechaIn;
	       }
	       
	       public LocalDate obtenerFechaOut() {
	    	    return this.fechaOut;
	       }
	       
	       public abstract List<Publicacion>  aplicarFiltro(List<Publicacion> array);
	       
}
