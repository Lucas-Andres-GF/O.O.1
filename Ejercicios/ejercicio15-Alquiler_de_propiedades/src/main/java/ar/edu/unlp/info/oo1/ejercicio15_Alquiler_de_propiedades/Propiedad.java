package ar.edu.unlp.info.oo1.ejercicio15_Alquiler_de_propiedades;

import java.time.LocalDate;
import java.util.List;

public class Propiedad {
	private String nombre; 
	private String descripcion; 
	private String direccion;
	private double precXNoche; 
	private DateLapse fechaOcupada; 
	private List<Reserva> reservas; 
	
	public Propiedad(String nombre, String descripcion, String direccion, double precXNoche) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precXNoche = precXNoche; 
		this.fechaOcupada = null; 
	}
	
	public void ocuparPropiedad(DateLapse lapse) {
		this.fechaOcupada = lapse; 
	}
	
	public void liberarPropiedad() {
		this.fechaOcupada = null; 
	}
	
	public double getPrecioXNoche() {
		return this.precXNoche;
	}
	
	public boolean estaOcupada(DateLapse lapse) {
		return (lapse.includesDate(this.fechaOcupada.getFrom()) && lapse.includesDate(this.fechaOcupada.getTo())) ;  
	}
	
	public double calcularIngreso (lapse) {
		return 
	}
	
	
	
	
	
}
