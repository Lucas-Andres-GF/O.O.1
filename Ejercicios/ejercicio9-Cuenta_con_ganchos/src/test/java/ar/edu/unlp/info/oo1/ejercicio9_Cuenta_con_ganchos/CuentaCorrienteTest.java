package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	private CuentaCorriente cuentaCorriente; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaCorriente = new CuentaCorriente();  
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
	
	
	
}
