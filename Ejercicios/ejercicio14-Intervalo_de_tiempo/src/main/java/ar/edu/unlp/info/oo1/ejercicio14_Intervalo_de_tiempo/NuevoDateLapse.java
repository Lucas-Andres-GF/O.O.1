package ar.edu.unlp.info.oo1.ejercicio14_Intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NuevoDateLapse {
	private LocalDate from; 
	private int sizeInDays; 
	
	
	
	public NuevoDateLapse(LocalDate from, LocalDate to) {
		super();
		this.from = from;
		this.sizeInDays = (int)from.until(to, ChronoUnit.DAYS);
	}

	//Retorna la fecha de inicio del rango
	public LocalDate getFrom() {
		return this.from; 
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);  
	}
	
	public int sizeInDays() {
		return this.sizeInDays; 
	}
	
	public boolean includesDate(LocalDate other) {
		if (other == null) {
			return false; 
		}
		return this.from.isBefore(other) && this.from.plusDays(sizeInDays).isAfter(other); 
	}
	
}
