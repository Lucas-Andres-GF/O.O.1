package ar.edu.unlp.objetos.uno.ejercicio6_Red_de_alumbrado;

import java.util.ArrayList;
import java.util.List;


public class Farola extends Object{
	private List<Farola> vecinos; 
	private boolean estado; 
	
	public Farola () {
		this.estado = false; 
		vecinos = new ArrayList<Farola>(); 
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		if (! this.getNeighbors().contains(otraFarola)) {			
			this.vecinos.add(otraFarola); 
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinos; 
	}
	
	public void turnOn() {
		if (! this.isOn()){			
			this.estado = true; 
			for (Farola vecino : this.getNeighbors()) {
				vecino.turnOn();			
			}
		}
	}

	public void turnOff() {
		if (this.isOn()){
			this.estado = false; 
			for (Farola vecino : this.getNeighbors()) {
				vecino.turnOff();			
			}			
		}
	}

	public boolean isOn() {
		return this.estado; 
	}

}

