package ar.edu.unlp.info.oo1.ejercicio15_Alquiler_de_propiedades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre; 
	private String dni; 
	private String direccion;
	private List<Propiedad> propiedades; 
	private List<Reserva> reservas; 
	
	public Usuario(String nombre, String dni, String direccion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.propiedades = new ArrayList<Propiedad>(); 
		this.reservas = new ArrayList<Reserva>(); 
	} 
	
	public void añadirReserva(Reserva reserva) {
		this.reservas.add(reserva); 
	}
	
	public List<Reserva> getReservas (){
		return this.reservas; 
	}
	
	public double getIngresos() {
		return this.propiedades.stream().map(prop -> prop.)
	}
	
	
}
