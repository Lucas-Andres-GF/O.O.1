package ar.edu.unlp.info.oo1.ejercicio11_El_Inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private int porcentajeDeInteresDiario;

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}

	public int getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(int porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public double valorActual() {	
		double montoDeInteres = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now()) * (getPorcentajeDeInteresDiario()*100/getMontoDepositado()); 
		return this.getMontoDepositado() + montoDeInteres;
	}
	
}
