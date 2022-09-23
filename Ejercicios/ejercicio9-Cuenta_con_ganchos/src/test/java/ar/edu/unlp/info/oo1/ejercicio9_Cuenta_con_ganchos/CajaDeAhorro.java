package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

public class CajaDeAhorro extends Cuenta{

	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	public void extraerDinero (double monto) {
		super.extraer(monto + (monto * 0.02)); 
	}
	
	public void transferirDinero(double monto, Cuenta cuenta) {
		super.transferirACuenta(monto+(monto * 0.02), cuenta); 
	}

	@Override
	public boolean puedeExtraer(double monto) {
		if ((this.getSaldo() > 0) && (monto <= this.getSaldo())) {
			return true; 
		}
		return false;
	}
	
}
