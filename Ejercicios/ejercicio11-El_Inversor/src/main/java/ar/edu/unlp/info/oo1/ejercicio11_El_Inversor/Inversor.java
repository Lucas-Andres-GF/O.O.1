package ar.edu.unlp.info.oo1.ejercicio11_El_Inversor;

import java.util.List;

public class Inversor {
	String nombre;
	private List<Inversion> inversiones; 

	public double valorActual() {
		return inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum(); 
	}

}
