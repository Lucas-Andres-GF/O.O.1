package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

public class Archivo {

	private String nombre;
	
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public double getTamaño() {
		return this.nombre.length();
	}
	
}
