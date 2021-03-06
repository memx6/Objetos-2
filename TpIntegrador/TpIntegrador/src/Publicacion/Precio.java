package Publicacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Precio {

	private Double _precioBase;
	private ArrayList<Ajuste> _ajustes;
	public Precio(Double precioBase) {
		_precioBase = precioBase;
		_ajustes = new ArrayList<Ajuste>();
	}

	public Double obtenerPrecioBase() {
		return _precioBase;
	}

	public Double obtenerPrecioEn(LocalDate fecha) {
		if (_ajustes.stream().anyMatch((ajuste) -> ajuste.contieneFecha(fecha))){
			//Solo se permite un ajuste por periodo
			return _ajustes.stream()
				.filter((ajuste) -> ajuste.contieneFecha(fecha))
				.findFirst().get().obtenerPrecioEn(fecha);
		}
		else{
			return this.obtenerPrecioBase();
		}
	}

	public void modificarPrecioBase(Double nuevoPrecio) {
		_precioBase = nuevoPrecio;		
	}

	public void ingresarAjuste(Ajuste ajuste) {
		_ajustes.add(ajuste);		
	}
}
