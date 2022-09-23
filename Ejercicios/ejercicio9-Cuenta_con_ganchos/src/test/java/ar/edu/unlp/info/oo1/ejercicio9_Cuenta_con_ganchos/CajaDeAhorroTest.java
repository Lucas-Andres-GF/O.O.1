package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {

	private Cuenta cajaDeAhorro; 
	private Cuenta cajaDeAhorro2; 
	private Cuenta cuentaCorriente; 
	
	@BeforeEach
	void setUp() throws Exception {
		cajaDeAhorro = new CajaDeAhorro(); 
		cajaDeAhorro2 = new CajaDeAhorro(); 
		cuentaCorriente = new CuentaCorriente(); 
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
		cajaDeAhorro.extraer(450);
		assertEquals(31, cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testTransferir() {
		cajaDeAhorro.depositar(1000);
		cajaDeAhorro.transferirACuenta(500,cajaDeAhorro2);
		assertEquals(470, cajaDeAhorro.getSaldo());
		assertEquals(490, cajaDeAhorro2.getSaldo());
	}
	
	@Test
	void testTransferir2() {
		cajaDeAhorro.depositar(1000);
		cajaDeAhorro.transferirACuenta(500,cuentaCorriente); 
		assertEquals(470, cajaDeAhorro.getSaldo());
		assertEquals(500, cuentaCorriente.getSaldo());
	}
	
}
