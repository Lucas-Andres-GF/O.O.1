package ar.edu.unlp.objetos.uno.ejercicio2_Balanza;

import java.util.Date;

public class Ticket {
	private Date fecha; 
	private Integer cantidadDeProductos; 
	private double pesoTotal; 
	private double precioTotal; 
	
	public double impuesto() {
		return 21 * precioTotal; 
	}
	
}
