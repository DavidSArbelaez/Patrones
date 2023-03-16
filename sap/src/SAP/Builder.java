package SAP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface Builder {
	public int setCreditos();
	public String setNombreMateria();
	public int setSemestre();
	
    /*Estudiantes
    
    public Builder(String estudiante, String carrera, int semestre) {
        this.setEstudiante(estudiante);
        this.setCarrera(carrera);
        this.setSemestre(semestre);
    }
    
    public Builder agregarAsignatura(String asignatura) {
        this.getAsignaturas().add(asignatura);
        return this;
    }
    
    public InscripcionAsignaturas ConstruirAsignaturas() {
    	
        return new InscripcionAsignaturas(this);
    }*/

}