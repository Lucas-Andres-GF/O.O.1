package ar.edu.unlp.objetos.uno.ejercicio3_Presupuestos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Presupuesto {
	private Date  fecha; 
	private String cliente; 
	private ArrayList <Item> items; 
	
	public Presupuesto() {
		items = new ArrayList<Item>(); 
	}
	
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente; 
		return this; 
	}
	
	public void agregarItem (Item item) {
		items.add(item); 
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Item item : items) {
			total += item.costo(); 
		}
		return total; 
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

}
