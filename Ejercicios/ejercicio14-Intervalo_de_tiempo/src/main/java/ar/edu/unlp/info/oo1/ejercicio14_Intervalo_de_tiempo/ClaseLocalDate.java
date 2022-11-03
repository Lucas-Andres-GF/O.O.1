package ar.edu.unlp.info.oo1.ejercicio14_Intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ClaseLocalDate {
	public static void main(String[] args) {
		LocalDate fechaPiso = LocalDate.of(1975, 1, 1); 
		LocalDate fechaTecho = LocalDate.of(2003, 1, 1); 
		DateLapse dateLapse = new DateLapse(fechaPiso, fechaTecho); 
		System.out.println(dateLapse.getFrom());
		System.out.println(dateLapse.getTo());
		System.out.println("Se encuentra dentro de las fechas: " + dateLapse.includesDate(LocalDate.of(1999, 1, 1)));
	}
}
