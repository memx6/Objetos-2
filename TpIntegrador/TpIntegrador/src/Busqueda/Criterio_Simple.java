package Busqueda;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import Publicacion.Publicacion;

public class Criterio_Simple extends Criterio  {
       
		private Integer precioMax = null;
		private Integer precioMin = null;
		private Integer capacidad = null;
	
	
	   public Criterio_Simple(String str , LocalDate _fechaIn , LocalDate fechaOut) {
		      super(str , _fechaIn ,fechaOut);
		    
	   }
	  
	    public void guardarPrecioMax(Integer precio) {
			  this.precioMax = precio;
		}
		public void guardarPrecioMin(Integer precio){
			  this.precioMin = precio;
		}
		public void guardarCapacidad(Integer capacidad) {
			 this.capacidad = capacidad;
		}  
		
		public Integer obtenerPrecioMax() {
			 return this.precioMax;
		}

		public List<Publicacion> aplicarFiltro(List<Publicacion> _array) {
			return  _array.stream().filter(p-> p.obtenerCiudad() == this.obtenerCiudad()
		    		                     && p.obtenerFechaIn() == this.obtenerFechaIn() 
		    		                     && p.obtenerFechaOut() == this.obtenerFechaOut()
										 && p.obtenerCapacidad() == this.capacidad
										 && p.obtenerPrecio() > this.precioMin
										 && p.obtenerPrecio() < this.precioMax).collect(Collectors.toList());
					                    
	   }

		public Integer obtenerCapacidad() {
		
			return this.capacidad;
		}

		public Integer obtenerPrecioMin() {
			 return this.precioMin;
		}
	
}
