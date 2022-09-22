package ar.edu.unlp.objetos.uno.ejercicio4_Figuras_y_Cuerpos;

public class Circulo implements Figura {
	private double radio; 
	private double diametro; 
	
	public double getRadio() {
		return this.radio; 
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		this.diametro = radio * 2; 
		return this.diametro; 
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getPerimetro () {
		return this.getDiametro() * Math.PI; 
	}

	public double getArea() {
		return Math.PI * (this.getRadio()*this.getRadio()); 
	}
	
}
