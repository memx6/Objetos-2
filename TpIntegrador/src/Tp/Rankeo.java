package Tp;

public class Rankeo {
	private Categoria categoria;
	private Integer puntaje;
	private Usuario rankeador;
	private Usuario rankeado;
	
	public Rankeo (Categoria _cat  , Integer _puntaje , Usuario _usuario1 , Usuario _usuario2) {
		              this.categoria = _cat;
		              this.puntaje= _puntaje;
		              this.rankeador = _usuario1;
		              this.rankeado = _usuario2;
	}
	
	
	public Categoria obtenerCategoria() {
		    return this.categoria;
	}
	
	public Integer obtenerPuntaje() {
		   return this.puntaje;
	}
	
	public Usuario obtenerRankeador() {
		   return this.rankeador;
	}
	
	public Usuario obtenerRankeado() {
		   return this.rankeado;
	}
	

}
