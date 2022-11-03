package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	private Email email; 
	private Archivo archivo; 
	@BeforeEach
	void setUp() throws Exception {
		email = new Email("Bienvenido", "Hola, espero que es bien."); 
	}

	@Test 
	public void testAgregarAdjunto () {
		archivo = new Archivo("PC");
		email.agregarAdjunto(archivo);
		assertTrue(email.getAdjuntos().contains(archivo));
	}
	
	
	@Test
	public void testGetTamaño() {
		archivo = new Archivo("Lucas"); 
		email.agregarAdjunto(archivo);
		assertEquals(40, email.getTamaño());
	}
	
	@Test
	public void testContiene() {
		assertTrue(email.contiene("espero"));
		assertFalse(email.contiene("Pedro"));
		
	}

}
