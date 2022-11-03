package ar.edu.unlp.info.oo1.ejercicio12_Volumen_y_superficie_de_solidos;

import java.util.List;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas; 
	
	
	public double getVolumenDeMaterial(String material){
		return piezas.stream().filter(pieza -> pieza.getMaterial().equals(material)).mapToDouble(pieza -> pieza.getVolumen()).sum();  
	}
	
	public double getSuperficieDeColor(String color) {
		return piezas.stream().filter(pieza -> pieza.getColor().equals(color)).mapToDouble(pieza -> pieza.getSuperficie()).sum(); 
	}
	
}
