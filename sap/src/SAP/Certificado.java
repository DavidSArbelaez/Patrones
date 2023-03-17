package SAP;

public abstract class Certificado {
	protected Estudiantes estudiante;
	private String tipo;

	public Certificado(Estudiantes estudiante, String tipo) {
		this.estudiante = estudiante;
		this.tipo = tipo;
	}

	public void solicitar() {
		System.out.println("Solicitud de certificado de " + tipo + " para " + estudiante.getNombre());
	}
}
