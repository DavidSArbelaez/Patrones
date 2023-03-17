package SAP;

import java.util.ArrayList;

public class Profesores extends Persona {
	String carrera;
	ArrayList<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>();
	public Profesores(String nombre, int id,String carrera) {
		super(nombre, id);
		this.carrera=carrera;
	}
	
	
}
