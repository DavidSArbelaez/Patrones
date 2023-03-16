package SAP;

import java.util.List;

public class ProgramaAcademico {
    private String carrera;
    private int semestre;
    private int creditos;
    private List<String> asignaturas;
    
    public ProgramaAcademico(String carrera, int semestre, int creditos) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
    public void consultar() {
        System.out.println("El programa academico para " + carrera + " en el semestre " 
        + semestre + " y tiene " + creditos + " creditos");
    }
    
    public void horarioClase(Builder builder) {
    	
    	this.asignaturas = builder.getAsignaturas();
    	for (String asignatura : asignaturas) {
            System.out.println("* " + asignatura);
        }
    }
    
}