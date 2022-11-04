package ar.edu.unlp.info.oo1.ejercicio15_Alquiler_de_propiedades;

import java.time.LocalDate;

public class Reserva {
	private Propiedad propiedad; 
	private DateLapse lapse; 
	private Usuario user;
	
	public Reserva(Propiedad propiedad, DateLapse lapse, Usuario user) {
		super();
		this.propiedad = propiedad;
		this.lapse = lapse;
		this.user = user;
	} 
	
	public double getPrecio () {
		return this.propiedad.getPrecioXNoche() * this.lapse.sizeInDays(); 
	}
	
	public boolean sePuedeEliminar() {
		return LocalDate.now().compareTo(this.lapse.getFrom()) < 0; 
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
}
