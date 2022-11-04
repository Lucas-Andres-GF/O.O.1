package ar.edu.unlp.info.oo1.ejercicio14_Intervalo_de_tiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NuevoDateLapseTest {
	NuevoDateLapse dateLapse; 
	LocalDate fechaPiso; 
	LocalDate fechaTecho; 
	
	@BeforeEach
	void setUp() throws Exception {
		fechaPiso = LocalDate.of(1950, 7, 15); 
		fechaTecho = LocalDate.of(2005, 11, 7); 
		dateLapse = new NuevoDateLapse(fechaPiso, fechaTecho); 
	}

	@Test
	void testsizeInDays() {
		assertEquals(20204, dateLapse.sizeInDays());
		assertNotEquals(10000, dateLapse.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		LocalDate nuevaFecha = LocalDate.of(2001, 12, 12); 
		assertTrue(dateLapse.includesDate(nuevaFecha));
		nuevaFecha = LocalDate.of(2007, 1, 1); 
		assertFalse(dateLapse.includesDate(nuevaFecha));
	}

}