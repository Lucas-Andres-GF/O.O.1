package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import java.util.ArrayList;

public class Carpeta {
	private ArrayList<Email> emails; 
	private String nombre;
	
	public Carpeta() {
		this.emails = new ArrayList<Email>(); 
	}
	
	public Carpeta(String nombre) {
		this.emails = new ArrayList<Email>(); 
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Email> getEmails() {
		return emails;
	}
	
	public void remover (Email email) {
		this.emails.remove(email); 
	}
	
	public void agregar (Email email) {
		this.emails.add(email); 
	}

	public boolean seEncuentra (Email email) {
		return this.emails.contains(email); 
	}
	
	public Email buscar (String texto) {
		if (this.emails.isEmpty()){
			return null; 
		}
		return this.emails.stream().filter(email -> email.contiene(texto)).findFirst().orElse(null) ; 
	}
	
	public double getTamaño () {
		return this.emails.stream().mapToDouble(email -> email.getTamaño()).sum(); 
	}

}
