package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

	private ClienteDeCorreo cliente; 
	private Email email; 
	private Carpeta nuevaCarpeta; 
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new ClienteDeCorreo(); 
	}

	@Test
	void testAgregarCarpeta() {
		nuevaCarpeta = new Carpeta("Lucas");
		cliente.agregarCarpeta(nuevaCarpeta);
		assertTrue(cliente.getCarpetas().contains(nuevaCarpeta)); 
	}
	
	@Test
	void testRecibir() {
		email = new Email("Bienvenidos", "Buenos dias"); 
		cliente.recibir(email);
		assertEquals(email, cliente.buscar("Bienvenidos"));
	}
	
	@Test
	void testMover() {
		email = new Email("Bienvenidos", "Buenos dias"); 
		nuevaCarpeta = new Carpeta("Lucas");
		cliente.recibir(email);
		cliente.mover(email, cliente.getInbox(), nuevaCarpeta);
		assertTrue(nuevaCarpeta.seEncuentra(email));
	}
	
	@Test
	void testBuscar() {
		email = new Email("Bienvenidos", "Buenos dias"); 
		nuevaCarpeta = new Carpeta("Lucas"); 
		nuevaCarpeta.agregar(email);
		cliente.agregarCarpeta(nuevaCarpeta);
		Email emailNuevo = cliente.buscar("dias");
		assertEquals(email, emailNuevo);
	}
	
	@Test
	void testEspacioOcupado() {
		email = new Email("Bienvenidos", "Buenos dias"); 
		nuevaCarpeta = new Carpeta("Lucas"); 
		nuevaCarpeta.agregar(email);
		cliente.agregarCarpeta(nuevaCarpeta);
		assertEquals(22, cliente.espacioOcupado());
	}
	
}
