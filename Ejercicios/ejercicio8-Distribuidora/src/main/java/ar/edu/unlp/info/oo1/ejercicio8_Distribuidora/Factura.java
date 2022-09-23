package ar.edu.unlp.info.oo1.ejercicio8_Distribuidora;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva; 
	private double descuento; 
	private LocalDate fecha; 
	private Usuario usuario; 
	
	public Factura () {
		this.setDescuento(0);
		this.setMontoEnergiaActiva(0);
		this.setFecha(null);
		this.setUsuario(null);
	}
	
	public Factura (double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.setMontoEnergiaActiva(montoEnergiaActiva);
		this.setDescuento(descuento);
		this.setUsuario(usuario);
		this.setFecha(LocalDate.now());
	}
	
	public double montoTotal() {
		return (this.getMontoEnergiaActiva() - 
				(this.getMontoEnergiaActiva() * this.getDescuento() / 100)
		); 
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public void setMontoEnergiaActiva(double montoEnergiaActiva) {
		this.montoEnergiaActiva = montoEnergiaActiva;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
