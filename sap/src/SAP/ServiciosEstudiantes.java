package SAP;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ServiciosEstudiantes implements IServicios {

	public boolean VerificarMateria(Materia Materia, ArrayList<Materia> lista) {
		for (Materia materia : lista) {
			if (materia.getNombreMateria().compareTo(Materia.getNombreMateria()) != 0
					&& materia.getCodigo().compareTo(Materia.getCodigo()) != 0) {
				return true;
			}
		}
		return false;

	}

	@Override
	public void mostrarMaterias(ArrayList<Materia> Materia) {
		System.out.println();
		for (Materia materia2 : Materia) {
			System.out.println("- " + materia2);
		}
	}

	public void consultaCitaMatricula() {

		System.out.println("Su cita de matricula es: 10 / 01 / 23");

	}

	@Override
	public void consultarNotasParciales(Estudiantes estudiante) {
		// TODO Auto-generated method stub
		estudiante.composite.mostrarNotasParciales();
	}

	@Override
	public Estudiantes actualizarDatos(Estudiantes estudiante) {
		System.out.println("Ingrese el nuevo correo del estudiante:");
		Scanner teclado = new Scanner(System.in);
		String correo = teclado.next();
		estudiante.setCorreo(correo);

		System.out.println("Ingrese el nombre de la carrera del estudiante:");
		String carrera = teclado.next();
		estudiante.setCarrera(carrera);
		System.out.println("");
		System.out.println("Los datos del estudiante son:");
		estudiante.toString();
		return estudiante;

	}

	public Estudiantes inscribeAsignaturas(Estudiantes estudiante) {
		DirectorMaterias director = new DirectorMaterias();
		Random r = new Random();
		Materia materia = director.make("SS0" + Integer.toString(r.nextInt(15, 30)));
		if (VerificarMateria(materia, estudiante.composite.getListaMaterias())) {
			estudiante.addMateria(materia);
			System.out.println(materia.toString());
			System.out.println("Se realizo con exito la inscripción de la materia nueva.");
		} else {
			System.out.println("No se pudo realizar la inscripción dado que la materia ya esta inscrita");
		}
		return estudiante;
	}

	@Override
	public void solicitudesCertificado() {
		// TODO Auto-generated method stub

	}
}