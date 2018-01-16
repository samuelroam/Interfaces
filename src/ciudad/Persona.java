package ciudad;

public class Persona {

	
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	

	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		dni = dni;
	}

}
