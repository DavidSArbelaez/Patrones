package SAP;

public class Certificaciones extends Certificado {

	public Certificaciones(Estudiantes estudiante, String tipo) {
		super(estudiante, tipo);
	}

	public void CertificadoNotas(String estudiante) {
		System.out.println(estudiante + " Obtiene las siguientes Notas: ");
	}

	public void CertificadoEstudio(String estudiante) {
		System.out.println(estudiante + " Esta estudiando");
	}

	public void CertificadoTerminacionMaterias(String estudiante) {
		System.out.println(estudiante + " Ha terminado las siguientes Materias:");
	}

	public void CertificadoPlanEstudios(String estudiante) {
		System.out.println(estudiante + " Esta cursando con respecto al siguiente Plan de Estudios");
	}

	public void CertificadoNotasPostgrado(String estudiante) {
		System.out.println(estudiante + " Obtiene las siguientes Notas en Postgrado:");
	}

	public void CopiaActaGrado(String estudiante) {
		System.out.println(estudiante + " Recibe la Copia del Acta de Grado");
	}
}