package ar.edu.unlp.info.oo1.ejercicio8_Distribuidora;

import java.util.ArrayList;
import java.util.List;


public class Distribuidora {
	private double precioKWh; 
	private List<Usuario> usuarios; 
	
	public Distribuidora () {
		this.precioKWh(0);
		usuarios = new ArrayList<Usuario>(); 
	}
	
	public Distribuidora (double precioKWh) {
		usuarios = new ArrayList<Usuario>(); 
		this.precioKWh(precioKWh);  
	}
	
	public void agregarUsuario(Usuario usuario) {
		if (!this.usuarios.contains(usuario)) {
			this.getUsuarios().add(usuario); 
		}
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios; 
	}
	
	public List<Factura> facturar() {
		return this.usuarios.stream().map((usuario) -> usuario.facturarEnBaseA(precioKWh)).toList(); 
	}
	
	public double consumoTotalActiva() {
		return this.getUsuarios().stream().
			mapToDouble((usuario) -> usuario.ultimoConsumoActiva()).sum(); 
	}
	
	public double getPrecioKW() {
		return precioKWh;
	}

	public void precioKWh(double precio) {
		this.precioKWh = precio; 
	}
	
}
