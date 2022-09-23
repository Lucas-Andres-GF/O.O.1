package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	private CuentaCorriente cuentaCorriente; 
	private CuentaCorriente cuentaCorriente2; 
	private Cuenta cajaDeAhorro; 
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaCorriente = new CuentaCorriente();  
		cuentaCorriente2 = new CuentaCorriente();
		cajaDeAhorro = new CajaDeAhorro(); 
	}

	
	@Test
	void testCreacion() {
		assertEquals(0, cuentaCorriente.getSaldo());
		assertEquals(0, cuentaCorriente.getLimiteDescubierto());
	}

	@Test
	void testDepositar() {
		cuentaCorriente.depositar(500);
		assertEquals(500, cuentaCorriente.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertFalse(cuentaCorriente.extraer(100));
		cuentaCorriente.setLimiteDescubierto(-200);
		cuentaCorriente.depositar(500);
		cuentaCorriente.extraer(700); 
		assertEquals(-200, cuentaCorriente.getSaldo());
	}
	
	@Test
	void testTransferir() {
		cuentaCorriente.depositar(1000);
		cuentaCorriente.setLimiteDescubierto(-300);
		cuentaCorriente.transferirACuenta(1200, cajaDeAhorro); 
		assertEquals(-200, cuentaCorriente.getSaldo());
		assertEquals(1176 , cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testTransferir2() {
		cuentaCorriente.depositar(1000);
		cuentaCorriente.setLimiteDescubierto(-400);
		cuentaCorriente.transferirACuenta(1200, cuentaCorriente2); 
		assertEquals(-200, cuentaCorriente.getSaldo());
		assertEquals(1200 , cuentaCorriente2.getSaldo());
	}
	
}
