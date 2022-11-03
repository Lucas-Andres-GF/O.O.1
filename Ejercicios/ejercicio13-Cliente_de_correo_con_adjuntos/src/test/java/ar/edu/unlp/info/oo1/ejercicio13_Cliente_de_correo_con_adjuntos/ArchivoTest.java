package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

	private Archivo archivo; 
	
	@BeforeEach
	public void setUp() throws Exception {
		archivo = new Archivo("Clientes"); 
	}

	@Test
	public void testGetTamaño() {
		assertEquals(8, archivo.getTamaño());
	}
	
}
