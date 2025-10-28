package entidades;

import java.util.List;
import java.util.Map;

public class Proyecto {

	int numero;
	Cliente cliente;
	String direccion;
	Fecha fechaInicio;
	Fecha fechaFinEstimadaL;
	Fecha fechaFinReal;
	Map<String, Tarea> tareas; // la clave es el idTarea y el valor es el objeto Tarea
	List<Empleado> historialEmpleados; // guarda legajos de empleados que trabajaron en el proyecto
	boolean finalizado;
	double costoFinal; // para realizar en O(1) punto 11.

	public Proyecto(int numero, Cliente cliente, String direccion, Fecha fechaInicio, Fecha fechaFinEstimadaL,
			Fecha fechaFinReal, Map<String, Tarea> tareas, boolean finalizado, double costoFinal) {

		this.numero = numero;
		this.cliente = cliente;
		this.direccion = direccion;
		this.fechaInicio = fechaInicio;
		this.fechaFinEstimadaL = fechaFinEstimadaL;
		this.fechaFinReal = fechaFinReal;
		this.tareas = tareas;
		this.finalizado = finalizado;
		this.costoFinal = costoFinal;
	}

	// agrega una nueva tarea al proyecto
	public void agregarTarea(String idTarea, String titulo, String descripcion, double duracionDias) {
		
		if(tareas.containsKey(idTarea)) {
			throw new IllegalArgumentException("tarea ya agregada");
			  
		}
		
		Tarea nuevaTarea = new Tarea(idTarea, titulo, descripcion, duracionDias, numero, null, descripcion, duracionDias);
		tareas.put(idTarea, nuevaTarea);
	}

	// Asigna el primer empleado disponible a la tarea indicada
	public void asignarEmpleadoLibre(String tareaId) {
		
		if(!tareas.containsKey(tareaId)) {
			throw new IllegalArgumentException("tarea no existe");

		}

	}

	// Asigna el empleado libre con menos retrasos (priorizando los sin retrasos)
	public void asignarEmpleadoSinRetraso(String tareaId) {
		
		if(!tareas.containsKey(tareaId)) {
			throw new IllegalArgumentException("tarea no existe");

		}
		

	}

	// registrar dias de retraso en la tarea indicada
	public void registrarRetraso(String tareaId, double dias) {
		
		if(!tareas.containsKey(tareaId)) {
			throw new IllegalArgumentException("tarea no existe");

		}

	}

	// cambia estado a FINALIZADA, libera empleado y lo agrega al historial 
	public void finalizarTarea(String idTarea) {
		
		if(!tareas.containsKey(idTarea)) {
			throw new IllegalArgumentException("tarea no existe");

		}

	}

	// marca el proyecto como finalizado 
	public void finalizar() {

	}

	// reacalcula el costo acumulado de las tareas 
	public double actualizarCosto() {
		return 0;

	}

// aplica recargas (+35%, +25%, +2%)			
	public double calcularCostoFinal() {
		return 0;

	}

//devuelve el costoFinal del proyecto para resolver en O(1) punto 11.
	public double obtenerCostoFinal() {
		return costoFinal;

	}
}
