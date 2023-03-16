package SAP;

public abstract class Persona {
	
	String nombre;
	int id;
	String correo;
	
	

	public Persona(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public abstract void menu();

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", correo=" + correo + "]";
	}
	
	

}
