package ar.edu.unlp.objetos.uno.ejercicio3_Presupuestos;

public class Item {
	private String datalle; 
	private Integer cantidad; 
	private double costoUnitario; 
	
	public Item () {
		this.cantidad = 0; 
		this.costoUnitario = 0; 
		this.datalle = ""; 
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad; 
	}

	public String getDatalle() {
		return datalle;
	}

	public Item detalle(String datalle) {
		this.datalle = datalle;
		return this; 
	}

	public Item cantidad(Integer cantidad) {
		this.cantidad = cantidad;
		return this; 
	}
	
	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}

	public Integer getCantidad() {
		return cantidad;
	}
	
	
}
