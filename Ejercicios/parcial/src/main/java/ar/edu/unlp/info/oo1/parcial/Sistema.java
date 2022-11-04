package ar.edu.unlp.info.oo1.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sistema {
	private List<Album> albumes; 
 	private List<Usuario> usuarios;
 	private List<Playlist> playlist; 
 	
	public Sistema () {
		super();
		this.albumes = new ArrayList<Album>();
		this.usuarios = new ArrayList<Usuario>();
		this.playlist = new ArrayList<>(); 
	} 
	
	
	public List<Tema> temasxAnio(int anio){
		return albumes.stream().flatMap(album -> album.temasxAnio(anio).stream()).collect(Collectors.toList()); 
	}
	
	public List<String> generosXAlbum(Album album) {
		return album.getGenerosxAlbum().stream().collect(Collectors.toList()); 
	}
	
	public List<String> generosXMusico(String musico) {
		return albumes.stream().flatMap(album -> album.getGenerosxMusico(musico).stream()).collect(Collectors.toList());  
	}
	
	public Set<String> generosXPlaylist(Playlist playlist) {
		return playlist.getgeneros();  
	} 	
	
	public double duracionDeAlbum(Album album) {
		return album.getDuracion(); 
	}
	
	public void crearPlaylist() {
		
	}
	
 	
}
