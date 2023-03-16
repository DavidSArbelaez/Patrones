package SAP;


import java.util.ArrayList;
public class Estudiantes extends Persona{
	int semestre;
	String carrera;
	ArrayList<Materia> Materias;
	Composite composite = new Composite();
	
	
	public Estudiantes(String nombre, int id, int semestre, String carrera) {
		super(nombre, id);
		this.semestre = semestre;
		this.carrera = carrera;
		this.Materias = new ArrayList<Materia>();
	}
	

	/**
	 * @return the composite
	 */
	protected Composite getComposite() {
		return composite;
	}


	/**
	 * @param composite the composite to set
	 */
	protected void setComposite(Composite composite) {
		this.composite = composite;
	}


	/**
	 * @param materias the materias to set
	 */
	protected void setMaterias(ArrayList<Materia> materias) {
		Materias = materias;
	}



	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}



	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return Materias;
	}



	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	

	@Override
	public String toString() {
		return "Estudiantes [carrera=" + carrera + "]";
	}

	
}
