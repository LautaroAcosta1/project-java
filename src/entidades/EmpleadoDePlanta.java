package entidades;

public class EmpleadoDePlanta extends Empleado{

	double valorDia;
	String categoria;
	
	public EmpleadoDePlanta(String nombre, int legajo, boolean disponible, int retrasos, double valorDia,
			String categoria) {
		super(nombre, legajo, disponible, retrasos);
		this.valorDia = valorDia;
		this.categoria = categoria;
	}

	@Override
	public double calcularCostoBase (double duracionDias) {
		return 0;  
	}

	public double darValorDia() {
		return valorDia;
	}
}
