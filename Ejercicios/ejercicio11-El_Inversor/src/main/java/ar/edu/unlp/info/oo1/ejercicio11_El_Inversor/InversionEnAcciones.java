package ar.edu.unlp.info.oo1.ejercicio11_El_Inversor;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double valorActual() {
		return this.getCantidad() * this.getValorUnitario(); 
	}
	
}
