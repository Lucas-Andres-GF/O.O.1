package ar.edu.unlp.info.oo1.parcial;

import java.util.List;

public class Usuario {
	private String nombre; 
	private String clave; 
	private List<Reproduccion> reproducciones; 
	private List<Usuario> contactos; 
	private List<Playlist> playlists;
	
	public String getNombre() {
		return nombre;
	}
	public String getClave() {
		return clave;
	}
	public List<Reproduccion> getReproducciones() {
		return reproducciones;
	}
	public List<Usuario> getContactos() {
		return contactos;
	}
	public List<Playlist> getPlaylists() {
		return playlists;
	} 

	
}
