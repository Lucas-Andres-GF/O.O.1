package ar.edu.unlp.objetos.uno.ejercicio4_Figuras_y_Cuerpos;

public class Cuerpo3D {
	private double altura; 
	private Figura caraBasal;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	} 
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura(); 
	}
	
	public double getSuperficieExterior() {
		return (2 * this.caraBasal.getArea() + 
				this.caraBasal.getPerimetro() * this.getAltura()
		);
	}
}
