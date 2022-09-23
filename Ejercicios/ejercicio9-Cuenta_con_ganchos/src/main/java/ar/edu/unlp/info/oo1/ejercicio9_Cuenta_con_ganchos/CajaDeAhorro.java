package ar.edu.unlp.info.oo1.ejercicio9_Cuenta_con_ganchos;

public class CajaDeAhorro extends Cuenta{

	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	public void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02)); 
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if (monto > 0 && monto + (monto * 0.02)  <= this.getSaldo()) {
			return true; 
		}
		return false;
	}
	
}
