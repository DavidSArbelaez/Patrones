package SAP;

public class Estudiantes extends Persona {
	int semestre;
	String carrera;
	Composite composite = new Composite();

	public Estudiantes(String nombre, int id, int semestre, String carrera) {
		super(nombre, id);
		this.semestre = semestre;
		this.carrera = carrera;
	}

	public void addMateria(Materia materia) {
		composite.añadirMateria(materia);
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
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "El programa academico para " + carrera + " en el semestre " + semestre + " y tiene "
				+ composite.GetNumCreditos() + " creditos en materias";
	}

}
