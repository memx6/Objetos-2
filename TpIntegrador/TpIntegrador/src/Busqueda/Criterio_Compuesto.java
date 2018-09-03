package Busqueda;
import java.time.LocalDate;
import java.util.List;

import Publicacion.Publicacion;

public class Criterio_Compuesto  extends Criterio{
	private List<Criterio> criterios;

 	public Criterio_Compuesto(String _srt, LocalDate _date1, LocalDate _date2) {
		super(_srt, _date1, _date2);
	}


	
	public List<Publicacion> aplicarFiltro(List<Publicacion> publi){
		List<Publicacion> resto = publi;
		for (Criterio index : this.criterios) {
			     index.aplicarFiltro(resto);
		}
		return  resto;
		
		          
	}

}
