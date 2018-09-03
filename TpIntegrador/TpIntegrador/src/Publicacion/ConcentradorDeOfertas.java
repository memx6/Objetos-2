package Publicacion;

import java.util.List;

import java.util.Observable;
import java.util.Observer;
import Publicacion.HomePagePublisher;
import Publicacion.Publicacion;

//import java.time.LocalDate;

public class ConcentradorDeOfertas implements Observer {
		private List<Publicacion> inmueblesDeInteres;
		private HomePagePublisher homePage;
		
		public ConcentradorDeOfertas(HomePagePublisher homePagePublisher){
			this.homePage = homePagePublisher;
		}
		public void interesadoEn (Publicacion unaPubli) {
			this.inmueblesDeInteres.add(unaPubli);
		}
		public List<Publicacion> obtenerInmueblesDeInteres(){
			return this.inmueblesDeInteres;
		}
		
		/*
		 * Recibe la notificacion su observable con el argumento modificado para realizar el envio del publish a la HomePagePublisher
		 */
		@Override
		public void update(Observable unaPubli, Object arg) {
		//homePage.publish("No te pierdas esta oferta: Un inmueble"+ unaPubli.obtenerTipoInmueble() + " a tan sólo" + unaPubli.obtenerPrecio() + "pesos");
			Publicacion publicacion = (Publicacion) unaPubli;
			if (arg.toString().equals("BajaDePrecio")){
				homePage.publish("No te pierdas esta oferta: Un inmueble "+ publicacion.obtenerTipoInmueble()+ " a tan sólo " + publicacion.obtenerPrecio().toString()+ " pesos");
			}
		}
}






