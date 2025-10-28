package entidades;

public abstract class Empleado {
	String nombre; 
	int legajo; 
	//double valorHora; 
	boolean disponible;
	int retrasos;
	
	public Empleado(String nombre, int legajo , boolean disponible, int retrasos) {

		this.nombre = nombre;
		this.legajo = legajo;
		//this.valorHora = valorHora;
		this.disponible = disponible;
		this.retrasos=0;
	} 
	
	//indica si está libre el empleado, true=libre false=ocupado
	public boolean estaDisponible() {
		return disponible;
		
	}
	
	//cambia el estado del empleado a no disponible 
	public void asignar() {
		disponible = false;
		
		
	}
	
	//cambia estado del empleado a disponible 
	public void liberar() {
		disponible= true;
		
	}	
	// incrementa el contador de retrasos 
	public void registrarRetrasos() {
		retrasos=+1;
		
	}
	
	// devuelve la cantidad de retrasos 
	public int darRetrasos() {
		return retrasos;
	}
	
	// metodo abstracto que calcula el costo base
	public double calcularCostoBase (double duracionDias) {
		return 0;  
	}

}
