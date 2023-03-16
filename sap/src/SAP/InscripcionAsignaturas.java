package SAP;

import java.util.ArrayList;

public class InscripcionAsignaturas {
	
	Estudiantes estudiante;
	
	public boolean verificarMateriaPreEscrita(Materia Materia) {
		ArrayList<Materia> listaMaterias = estudiante.getMaterias();
		for (Materia materia : listaMaterias) {
			if(materia.getNombreMateria().compareTo(Materia.getNombreMateria())!=0 && 
					materia.getCodigo().compareTo(Materia.getCodigo())!=0) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	/*
	private String estudiante;
    private String carrera;
    private int semestre;
    private List<String> asignaturas;
    
    
    
    public InscripcionAsignaturas(Builder builder) {
        this.estudiante = builder.getEstudiante();
        this.carrera = builder.getCarrera();
        this.semestre = builder.getSemestre();
        this.asignaturas = builder.getAsignaturas();
    }
    
    public void inscribir() {
        System.out.println("Inscripción de asignaturas para " + estudiante 
        		+ " en el semestre # " + semestre + " el dia de " + fecha);
        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }
    }

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
    */
}