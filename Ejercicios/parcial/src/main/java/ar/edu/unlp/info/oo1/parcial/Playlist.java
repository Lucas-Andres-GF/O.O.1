package ar.edu.unlp.info.oo1.parcial;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Playlist {
	private String nombre; 
	private List<Tema> temas;
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Tema> getTemas() {
		return temas;
	} 
	
	public Set<String> getgeneros(){
		return this.temas.stream().map(tema -> tema.getGenero()).collect(Collectors.toSet()); 
	}
	
}
