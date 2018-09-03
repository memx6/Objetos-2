package Tp;

public class Servicio {
     private String servicio;
     
     public Servicio(String  _serv) {
    	 
    	  this.servicio = _serv;
    	  
     }
     
     public String obtenerServicio() {
    	 return this.servicio;
     }
     
     public void guardarServicio(String _serv) {
    	 this.servicio = _serv;
     }
}
