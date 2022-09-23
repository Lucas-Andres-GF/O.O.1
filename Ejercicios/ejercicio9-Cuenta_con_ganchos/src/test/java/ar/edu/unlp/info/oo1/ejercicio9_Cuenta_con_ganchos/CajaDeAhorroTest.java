package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {

	private CajaDeAhorro cajaDeAhorro; 
	private CajaDeAhorro cajaDeAhorro2; 
	
	@BeforeEach
	void setUp() throws Exception {
		cajaDeAhorro = new CajaDeAhorro(); 
		cajaDeAhorro2 = new CajaDeAhorro(); 
	}

	@Test
	void testCreacion() {
		assertEquals(0, cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testDepositar() {
		cajaDeAhorro.depositar(500);
		assertEquals(500 - 500 * 0.02, cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testExtraer() {
		cajaDeAhorro.depositar(500);
		cajaDeAhorro.extraerDinero(450);
		assertEquals(31, cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testTranferir() {
		cajaDeAhorro.depositar(1000);
		cajaDeAhorro.transferirDinero(500, cajaDeAhorro2);
		System.out.println(cajaDeAhorro.getSaldo());
		System.out.println(cajaDeAhorro2.getSaldo());
//		assertEquals(480, cajaDeAhorro.getSaldo());
//		assertEquals(490, cajaDeAhorro2.getSaldo());
	}
	
}
