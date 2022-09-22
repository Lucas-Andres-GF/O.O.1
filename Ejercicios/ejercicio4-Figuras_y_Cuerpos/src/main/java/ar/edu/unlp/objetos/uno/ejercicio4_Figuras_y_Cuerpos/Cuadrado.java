package ar.edu.unlp.objetos.uno.ejercicio4_Figuras_y_Cuerpos;

public class Cuadrado implements Figura{ 
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	} 
	
	public double getPerimetro () {
		return this.getLado() * 4; 
	}	
	
	public double getArea() {
		return this.getLado() * this.getLado(); 
	}
	
}
