package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

public class CuentaCorriente extends Cuenta {
	private double limiteDescubierto; 
		
	public CuentaCorriente(double limiteDescubierto) {
		super(); 
		this.setLimiteDescubierto(limiteDescubierto);
	}
	
	public CuentaCorriente () {
		super(); 
		this.setLimiteDescubierto(0);
	}
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	public boolean puedeExtraer(double monto) {
		if (this.getSaldo() - monto >= this.getLimiteDescubierto()) {
			return true; 
		}
		return false;
	}
	
}
