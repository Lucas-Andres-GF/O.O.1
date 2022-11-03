package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import java.util.ArrayList;

public class Email {
	private String titulo; 
	private String cuerpo; 
	private ArrayList<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>(); 
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public ArrayList<Archivo> getAdjuntos() {
		return adjuntos;
	}


	public double getTamaño () {
		return 	this.titulo.length() + 
				this.cuerpo.length() + 
				this.adjuntos.stream().mapToDouble(arch -> arch.getTamaño()).sum(); 
	}
	
	public void agregarAdjunto (Archivo archivo) {
		this.adjuntos.add(archivo); 
	}
	
	public boolean contiene (String texto) {
		return this.titulo.contains(texto) | this.cuerpo.contains(texto); 
	}
	
}
