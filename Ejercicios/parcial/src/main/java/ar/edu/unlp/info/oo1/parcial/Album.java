package ar.edu.unlp.info.oo1.parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Album {
	private String titulo; 
	private LocalDate fachaDeEdit; 
	private List<Tema> temas; 
	
	public Album(String titulo, LocalDate fechaDeEdit) {
		this.titulo = titulo; 
		this.fachaDeEdit = fechaDeEdit; 
		this.temas = new ArrayList<Tema>(); 
	}
	
	public List<Tema> temasxAnio(int anio){
		if (this.fachaDeEdit.getYear() == anio) {
			return this.temas; 
		}
		return new ArrayList<Tema>(); 
	}
	
	public Set<String> getGenerosxAlbum(){
		return this.temas.stream().map(tema -> tema.getGenero()).collect(Collectors.toSet()); 
	}
	
	public Set<String> getGenerosxMusico(String musico){
		return this.temas.stream().filter(tema -> tema.getMusico().equals(musico)).map(tema -> tema.getGenero()).collect(Collectors.toSet()); 
	}
	
	public double getDuracion() {
		return this.temas.stream().mapToDouble(tema -> tema.getDuracion()).sum(); 
	}
	
	
}
