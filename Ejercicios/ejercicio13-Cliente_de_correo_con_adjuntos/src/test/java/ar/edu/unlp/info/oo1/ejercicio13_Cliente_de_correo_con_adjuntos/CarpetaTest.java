package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {

	private Carpeta carpeta; 
	private Email email; 
	private Email email2; 
	
	@BeforeEach
	void setUp() throws Exception {
		carpeta = new Carpeta("Nueva carpeta"); 
	}

	@Test
	void testRemover() {
		email = new Email("Hola", "Buen dia"); 
		carpeta.agregar(email); 
		assertTrue(carpeta.seEncuentra(email));
		carpeta.remover(email);
		assertFalse(carpeta.seEncuentra(email));
	}
	
	@Test
	void testAgregar() {
		email = new Email("Hola", "Buen dia");
		carpeta.agregar(email);
		assertTrue(carpeta.seEncuentra(email));
	}
	
	@Test
	void testBuscar() {
		email = new Email("Hola", "Buen dia");
		carpeta.agregar(email);
		Email emailNuevo = carpeta.buscar("Hola"); 
		assertEquals(emailNuevo, email);
	}
	
	@Test
	void testGetTamaño() {
		email = new Email("Bienvenidos", "Hola"); 
		email2 = new Email("Buenos dias", "Chau"); 
		carpeta.agregar(email);
		carpeta.agregar(email2);
		assertEquals(30, carpeta.getTamaño());
	}
	
	@Test
	void testSeEncuentra() {
		email = new Email("Bienvenidos", "Hola");
		carpeta.agregar(email);
		assertTrue(carpeta.seEncuentra(email));
	}
}
