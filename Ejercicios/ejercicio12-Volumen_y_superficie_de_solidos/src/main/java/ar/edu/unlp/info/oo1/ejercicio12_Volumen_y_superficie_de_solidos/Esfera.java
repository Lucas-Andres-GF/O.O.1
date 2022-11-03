package ar.edu.unlp.info.oo1.ejercicio12_Volumen_y_superficie_de_solidos;

public class Esfera extends Pieza {
	private int radio; 
	
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getVolumen () {
		return ( 4d /3d ) * Math.PI * Math.pow(this.getRadio(),3);  
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.getRadio(),2); 
	}
	
}
