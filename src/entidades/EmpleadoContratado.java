package entidades;

public class EmpleadoContratado extends Empleado{
	double valorHora;

	public EmpleadoContratado(String nombre, int legajo, boolean disponible, int retrasos, double valorHora) {
		super(nombre, legajo, disponible, retrasos);
		this.valorHora = valorHora;
	}

	@Override
	public double calcularCostoBase (double duracionDias) {
		return 0;  
	}
	
	public double darValorHora() {
		return valorHora;
	}
}
