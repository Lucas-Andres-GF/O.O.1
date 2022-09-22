package ar.edu.unlp.objetos.uno.ejercicio2_Balanza;

public class Balanza {
	private Integer cantidadDeProductos; 
	private double precioTotal; 
	private double pesoTotal; 
	
	public Balanza () {
		ponerEnCero();
	}
	
	public void ponerEnCero() {
		precioTotal = 0; 
		pesoTotal = 0; 
		cantidadDeProductos = 0; 
	}
	
	public void agregarProducto(Producto producto) {
		cantidadDeProductos ++; 
		precioTotal += producto.getPrecio(); 
		pesoTotal += producto.getPeso(); 
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(); 
		ticket.setCantidadDeProductos(this.cantidadDeProductos);
		ticket.setPesoTotal(this.pesoTotal);
		ticket.setPrecioTotal(this.precioTotal);
		ticket.setFecha();
		this.ponerEnCero();
		return ticket; 
	}
	
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

}
