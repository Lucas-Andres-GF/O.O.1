package ar.edu.unlp.info.oo1.ejercicio13_Cliente_de_correo_con_adjuntos;

import java.util.ArrayList;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> carpetas; 
	private Carpeta inbox;  
	
	public ClienteDeCorreo( ) {
		this.carpetas = new ArrayList<Carpeta>(); 
		this.inbox = new Carpeta("Inbox");
		this.agregarCarpeta(inbox); 
	}

	public ArrayList<Carpeta> getCarpetas() {
		return carpetas;
	}

	public Carpeta getInbox() {
		return inbox;
	}

	public void agregarCarpeta (Carpeta carpeta) {
		this.carpetas.add(carpeta); 
	}
	
	public void recibir (Email email) {
		this.inbox.agregar(email);
	}
	
	public void mover (Email email, Carpeta origen, Carpeta destino) {
		origen.remover(email);
		destino.agregar(email);
	}
	
	public Email buscar (String texto) {
		if (this.carpetas.isEmpty()){
			return null; 
		}
		return this.carpetas.stream().map(carp -> carp.buscar(texto)).findFirst().orElse(null);  
	}

	public double espacioOcupado () {
		return this.carpetas.stream().mapToDouble(carp -> carp.getTamaño()).sum(); 
	}
	
}
