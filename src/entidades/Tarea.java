package entidades;

public class Tarea {
	String id;
	String titulo;
	String descripcion;
	double duracionDias;
	int diasRetraso;
	Empleado empleadoAsignado;
	String estado; // (PENDIENTE, ENCURSO, FINALIZADA)
	double costoBase;

	public Tarea(String id, String titulo, String descripcion, double duracionDias, int diasRetraso,
			Empleado empleadoAsignado, String estado, double costoBase) {

		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.duracionDias = duracionDias;
		this.diasRetraso = diasRetraso;
		this.empleadoAsignado = empleadoAsignado;
		this.estado = estado;
		this.costoBase = costoBase;
	}


	// guarda el id del empleado y calcula el costo base segun su tipo
	public void asignarEmpleado(String idEmpleado, double valorHoraODia, String tipoEmpleado) {

	}

	// guarda el costo base segun el tipo de empleado y la duracion
	public void calcularCostoBase() {//double valorHoraODia, String tipoEmpleado
		
		empleadoAsignado.calcularCostoBase(duracionDias);
	}

	// aumenta el contador diasRetraso en Tarea y suma al contador del
	// empleado correspondiente
	public void registrarRetraso() {
		diasRetraso=+1;
		empleadoAsignado.registrarRetrasos();

	}
	
	// cambia estado a FINALIZADA, libera empleado y mantiene el costo
	public void finalizarTarea() {
		
		empleadoAsignado.liberar();

	}
	
	// devuelve el costo base ya calculado.
	public double darCostoBase() {
		return costoBase;

	}
	
	// devuelve 0.5 (medio dia), 1, 2...
	public double darDuracionDias() {
		return duracionDias;

	}

	// devuelve el legajo del empleado asignado
	public int darEmpleado() {
		return empleadoAsignado.legajo;

	}
}
