package es.upm.grise.profundizacion.control_1;

public class Pedido {
	
	String item;
	int unidades;
	double precio;
	
	public Pedido(String item, int unidades, double precio) {
		super();
		this.item = item;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public double getImportePedido() {
		return precio * unidades;
	}
	
}
