package Tp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Criterio {

	       private String ciudad;
	       private LocalDateTime fechaIn;
	       private LocalDateTime fechaOut;
	       
	       
	       public String obtenerCiudad() {
	    	    return this.ciudad;
	       }
	       
	       public LocalDateTime obtenerFechaIn() {
	    	    return this.fechaIn;
	       }
	       
	       public LocalDateTime obtenerFechaOut() {
	    	    return this.fechaOut;
	       }
	       
	       public abstract Boolean aplicarFiltro(ArrayList<Publicacion> _array);
	       
}
