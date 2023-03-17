package SAP;

import java.util.ArrayList;

public class Asignaturas {
	
	public boolean VerificarMateria(Materia Materia,ArrayList<Materia> lista) {
		for (Materia materia : lista) {
			if(materia.getNombreMateria().compareTo(Materia.getNombreMateria())!=0 && 
					materia.getCodigo().compareTo(Materia.getCodigo())!=0) {
				return true;
			}
		}
		return false;
		
	}
	
	public void mostrarMaterias(ArrayList<Materia> Materia) {
		System.out.println();
		for (Materia materia2 : Materia) {
			System.out.println("- "+ materia2);
		}
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