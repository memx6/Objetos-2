package Tp;

import java.util.ArrayList;

public class Busqueda {
	
	public ArrayList<Publicacion> buscarPublicacion(Criterio criterio , ArrayList<Publicacion> _array){
		 return criterio.aplicarFiltro(_array);
		
	}

}
