package ar.edu.unlp.info.oo1.ejercicio15_Alquiler_de_propiedades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OOBNB {
	private List<Usuario> usuarios; 
	private List<Propiedad> propiedades; 
	private List<Reserva> reservas; 
	
	public OOBNB() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registarUsuario(String nombre, String dni, String dir) {
		Usuario user = new Usuario(nombre, dni, dir); 
		usuarios.add(user); 
		return user; 
	}
	
	public Propiedad registrarPropiedad (String nombre, String desc, String dir, double precXNoche) {
		Propiedad prop = new Propiedad(nombre, desc, dir, precXNoche); 
		this.propiedades.add(prop); 
		return prop; 
	}
	
	public List<Propiedad> disponibles (DateLapse lapse){
		return this.propiedades.stream().filter(prop -> ! prop.estaOcupada(lapse)).collect(Collectors.toList()); 
	}
	
	public Reserva reservar (Propiedad prop, DateLapse lapse, Usuario user) {
		if (prop.estaOcupada(lapse)) {
			return null; 
		}
		Reserva reserva = new Reserva(prop, lapse, user); 
		prop.ocuparPropiedad(lapse);
		user.añadirReserva(reserva);
		this.reservas.add(reserva); 
		return reserva; 
	}
	
	public void eliminarReserva (Reserva reserva) {
		if (reserva.sePuedeEliminar()) {
			this.reservas.remove(reserva); 
			reserva.getPropiedad().liberarPropiedad();
		}
	}
	
	public List<Reserva> reservasDeUsuario(Usuario user){
		return user.getReservas(); 
	}
	
	public double calcularIngresos(Usuario user, DateLapse lapse) {
		return user.getIngresos(lapse); 
	}
}
