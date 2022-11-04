package ar.edu.unlp.info.oo1.ejercicio14_Intervalo_de_tiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ClaseLocalDate {
	public static void main(String[] args) {
		LocalDate fechaPiso = LocalDate.of(1975, 1, 1); 
		LocalDate fechaTecho = LocalDate.of(2003, 1, 1); 
		LocalDate nuevaFecha = LocalDate.of(2007, 4, 25); 
		NuevoDateLapse dateLapse = new NuevoDateLapse(fechaPiso, fechaTecho); 
		System.out.println("La fecha final es: " + dateLapse.getTo());
		System.out.println("La fecha esta entre el piso y techa: " + dateLapse.includesDate(nuevaFecha));
	}
}
