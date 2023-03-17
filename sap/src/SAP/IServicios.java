package SAP;

import java.util.ArrayList;

public interface IServicios {
	public abstract void mostrarMaterias(ArrayList<Materia> Materia);

	public abstract void consultarNotasParciales(Estudiantes estudiante);

	public abstract Estudiantes actualizarDatos(Estudiantes estudiante);

	public abstract void solicitudesCertificado();
}
