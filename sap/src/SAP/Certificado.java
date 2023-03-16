package SAP;

public abstract class Certificado {
	protected String estudiante;
    private String tipo;
    
    public Certificado(String estudiante, String tipo) {
        this.estudiante = estudiante;
        this.tipo = tipo;
    }
    
    public void solicitar() {
        System.out.println("Solicitud de certificado de " + tipo + " para " + estudiante);
    }
}
