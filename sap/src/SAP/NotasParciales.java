package SAP;

public class NotasParciales {
	private String estudiante;
    private String carrera;
    private int semestre;
    private float valor;
    
    public NotasParciales(String estudiante, String carrera, int semestre) {
        this.estudiante = estudiante;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public NotasParciales() {
    	
    }
    
    public void consultar() {
        System.out.println("Las Notas parciales para " + estudiante + 
        		" en " + carrera + " cursado en el semestre " + semestre + " es de: "
        		+ valor);
    }
    
}