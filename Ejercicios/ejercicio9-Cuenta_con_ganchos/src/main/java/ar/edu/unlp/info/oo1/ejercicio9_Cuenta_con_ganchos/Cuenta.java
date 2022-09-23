package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

public abstract class Cuenta {
	private double saldo; 
	
	public Cuenta() {
		this.saldo = 0; 
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto; 
	}
	
	public void extraerSinCotrolar(double monto) {
		this.saldo -= monto; 
	}
	
	public boolean extraer (double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinCotrolar(monto); 
			return true; 
		}
		return false; 
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinCotrolar(monto);
			cuentaDestino.depositar(monto);
			return true; 
		}
		return false; 		
	}
	
	public abstract boolean puedeExtraer(double monto); 
	
}
