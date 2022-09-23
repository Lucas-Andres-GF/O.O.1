package ar.edu.unlp.info.oo1.ejercicio8_Distribuidora;


import java.util.ArrayList;
import java.util.List;


public class Usuario {
	private String domicilio; 
	private String nombre; 
	private List<Factura> facturas; 
	private List<Consumo> consumos; 

	public Usuario() {
		this.setNombre(null);
		this.setDomicilio(null);
		facturas = new ArrayList<Factura>(); 
		consumos = new ArrayList<Consumo>(); 
	}
	
	public Usuario(String nombre, String domicilio) {
		this.setNombre(nombre);
		this.setDomicilio(domicilio);
		facturas = new ArrayList<Factura>(); 
		consumos = new ArrayList<Consumo>(); 
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion); 
	}
	
	public Consumo ultimoConsumo() {
		return this.getConsumos().stream().max((consumo1, consumo2) -> consumo1.getFecha().compareTo(consumo2.getFecha())).orElse(null); 
	}
	
	public double ultimoConsumoActiva() {
		if (this.ultimoConsumo() != null) {
			return this.ultimoConsumo().getConsumoEnergiaActiva(); 
		}		
		return 0; 
	}
	
	public String getDomicilio() {
		return domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public Factura facturarEnBaseA(double precioKWh) {
		if (this.ultimoConsumo() != null) {
			if (this.ultimoConsumo().factorDePotencia() > 0.8) {
				return new Factura(this.ultimoConsumo().costoEnBaseA(precioKWh), 10, this);
			}
			return new Factura(this.ultimoConsumo().costoEnBaseA(precioKWh), 0, this);
		}
		return new Factura(0, 0, null); 
	}

	public List<Factura> facturas(){
		return this.facturas; 
	}
	
}
