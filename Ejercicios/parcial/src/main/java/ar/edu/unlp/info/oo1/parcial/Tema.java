package ar.edu.unlp.info.oo1.parcial;

public class Tema {
	private String titulo;
	private String musico; 
	private String genero; 
	private double duracion;

	public Tema(String titulo, String musico, String genero, double duracion) {
		super();
		this.titulo = titulo;
		this.musico = musico;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getMusico() {
		return this.musico;
	}
	public String getGenero() {
		return this.genero;
	}
	public double getDuracion() {
		return this.duracion;
	} 
	
	
	
}
