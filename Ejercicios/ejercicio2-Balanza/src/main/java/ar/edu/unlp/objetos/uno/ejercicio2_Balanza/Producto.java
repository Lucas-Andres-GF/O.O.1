package ar.edu.unlp.objetos.uno.ejercicio2_Balanza;

public class Producto {
	private double peso; 
	private double precioPorKilo; 
	private String descripcion; 
	
	public Producto() {
		this.peso = 0; 
		this.precioPorKilo = 0; 
		this.descripcion = ""; 
	}
	
	public double getPrecio() {
		return this.getPeso() * this.getPrecioPorKilo(); 
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
