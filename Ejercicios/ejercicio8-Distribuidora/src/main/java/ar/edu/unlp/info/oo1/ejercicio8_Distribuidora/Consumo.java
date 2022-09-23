package ar.edu.unlp.info.oo1.ejercicio8_Distribuidora;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha; 
	private double consumoEnergiaActiva; 
	private double consumoEnergiaReactiva; 
	
	public Consumo () {
		this.setConsumoEnergiaActiva(0);
		this.setConsumoEnergiaReactiva(0);
		this.setFecha(null);
	}
	
	public Consumo (LocalDate fecha, int consumoEnergiaActiva, int consumoEnergiaReactiva) {
		this.setFecha(fecha);
		this.setConsumoEnergiaActiva(consumoEnergiaActiva);
		this.setConsumoEnergiaReactiva(consumoEnergiaReactiva);
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.getConsumoEnergiaActiva() * precioKWh; 
	}


	public double factorDePotencia() {
		return (this.getConsumoEnergiaActiva() / 
				(Math.sqrt(
					Math.pow(consumoEnergiaActiva,2) +
					Math.pow(consumoEnergiaReactiva,2)
					))
				); 
	}
		
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}
	
	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
}

