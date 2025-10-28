package entidades;

public class Cliente {
	String nombre;
	String telefono;
	String email;
	
	public Cliente(String nombre, String telefono, String email) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
		
	// devuelve el nombre del cliente 
	public String darNombre() {
		return nombre;
	}	
	
	// devuelve el telefono del cliente 
	public String darTelefono() {
		return telefono;
	}
	
	// devuelve el email del cliente 
	public String darEmail() {
		return email;
	}
}
