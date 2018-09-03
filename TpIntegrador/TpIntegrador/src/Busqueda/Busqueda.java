package Busqueda;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Publicacion.Publicacion;

public class Busqueda {
	
	public List<Publicacion> buscarPublicacion(Criterio criterio , List<Publicacion> _array){
		  return criterio.aplicarFiltro(_array);
		 }

}
