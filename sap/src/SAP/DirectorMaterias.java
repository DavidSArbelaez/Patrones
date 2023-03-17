package SAP;

import java.util.Random;

public class DirectorMaterias {

	public Builder cambiarBuilder(int i) {
		if (i % 2 == 0) {
			return new MatematicasBuilder();
		}
		return new FisicaBuilder();
	}

	public Materia make(String code) {
		Builder builder;
		Random r = new Random();
		int a = r.nextInt(1, 30);

		builder = cambiarBuilder(a);
		int semestre = builder.setSemestre();
		int creditos = builder.setCreditos();
		a = r.nextInt(1, 30);
		builder = cambiarBuilder(a);
		String nombre = builder.setNombreMateria();

		return new Materia(nombre, creditos, semestre, code);
	}
}
