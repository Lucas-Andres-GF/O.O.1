package ar.edu.unlp.objetos.uno.ejercicio5_Genealogia;

import java.util.Date;

public class Mamifero {
	private String identificador; 
	private String especie; 
	private Date fechaNacimiento; 
	private Mamifero padre; 
	private Mamifero madre;
	
	public Mamifero (String identificador) {
		this.setIdentificador(identificador);
	}
	
	public Mamifero (){
		
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloPaterno() {
		if (this.padre != null)
			return this.padre.getPadre();
		return null; 
	}

	public Mamifero getAbuelaPaterna() {
		if (this.padre != null)
			return this.padre.getMadre();
		return null; 
	}

	public Mamifero getAbueloMaterno() {
		if (this.madre != null)
			return this.madre.getPadre();
		return null;  
	}

	public Mamifero getAbuelaMaterna() {
		if (this.madre != null)
			return this.madre.getMadre();
		return null; 
	}

	public Boolean tieneComoAncestroA(Mamifero unMamifero){
		return (
				(this.padre == unMamifero) ||
				(this.madre == unMamifero) ||
				(this.padre != null && this.padre.tieneComoAncestroA(unMamifero))||
				(this.madre != null && this.madre.tieneComoAncestroA(unMamifero))
		);
	}
	
	
	
	
}
