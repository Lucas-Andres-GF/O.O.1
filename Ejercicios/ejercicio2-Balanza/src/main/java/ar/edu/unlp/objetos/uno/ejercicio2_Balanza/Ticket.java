package ar.edu.unlp.objetos.uno.ejercicio2_Balanza;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha; 
	private Integer cantidadDeProductos; 
	private double pesoTotal; 
	private double precioTotal; 
	
	public double impuesto() {
		return (21 * precioTotal / 100); 
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha() {
		this.fecha = LocalDate.now(); 
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = this.impuesto() + pesoTotal ;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
