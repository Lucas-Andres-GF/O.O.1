package ar.edu.unlp.info.oo1.ejercicio14_Intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from; 
	private LocalDate to; 
	
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	//Retorna la fecha de inicio del rango
	public LocalDate getFrom() {
		return this.from; 
	}
	
	//“Retorna la fecha de fin del rango”
	public LocalDate getTo() {
		return this.to; 
	}
	
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int)from.until(to, ChronoUnit.DAYS); 
	}
	
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to 
	//del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		if (other == null) {
			return false; 
		}
		return other.isAfter(from) && other.isBefore(to); 
	}
	
	
}
