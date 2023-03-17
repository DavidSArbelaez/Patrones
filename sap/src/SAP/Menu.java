package SAP;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	public void menu() {
		Scanner teclado= new Scanner(System.in);
		Asignaturas asignatura= new Asignaturas();
		Estudiantes estudiante=new Estudiantes(null, 0, 0, null);
		System.out.println("Menú: Digite una opción");
		
		System.out.println("1 - Servicios");
		System.out.println("2 - Pagos");
		System.out.println("3 - Solicitudes");
		
		int opcion = teclado.nextInt();
		switch (opcion) {
		
		case 1:
			System.out.println("Servicios");
			System.out.println("1 - Consultar materias");
			System.out.println("2 - Consultar notas parciales");
			System.out.println("3 - Actualizar datos");
			System.out.println("4 - Solicitudes certificado");
			System.out.println("5 - Consulta normativa");
			System.out.println("6 - Inscribe asignaturas");
			System.out.println("7 - Solicitudes academicas administrativas");
			System.out.println("8 - Consulta cita matricula");
			
			int opcion1 = teclado.nextInt();
			switch (opcion1) {
			case 1:
				asignatura.mostrarMaterias(estudiante.getComposite().getListaMaterias());
				break;
				
			case 2:
				estudiante.composite.mostrarNotasParciales();
				break;
				
			case 3:
				System.out.println("Ingrese el nuevo correo del estudiante:");
				String correo = teclado.next();
				estudiante.setCorreo(correo);
				
				System.out.println("Ingrese el nombre de la carrera del estudiante:");
				String carrera = teclado.next();
				estudiante.setCarrera(carrera);
				System.out.println("");
				System.out.println("Los datos del estudiante son:");
				estudiante.toString();
				break;
				
			case 4:
				
				break;
				
			case 5:
			
				break;
				
			case 6:
				DirectorMaterias director = new DirectorMaterias();
				Random r = new Random();
				Materia materia= director.make("SS0"+Integer.toString(r.nextInt(15,30)));
				if(asignatura.VerificarMateria(materia,estudiante.composite.getListaMaterias())) {
					estudiante.addMateria(materia);
					//Mostarr el Tostring con los datos de la materia nueva(ninguna nota)
					System.out.println("Se realizo con exito la inscripción de la materia nueva.");
				}else {
					System.out.println("No se pudo realizar la inscripción dado que la materia ya esta inscrita");
				}
				break;
				
			case 7:
				
				break;
			
			case 8:
				
				break;
				
			case 9:
				
				break;
			}
			
			break;
		
		
		case 2:
			System.out.println("Pagos");
			System.out.println("Pagos");
			System.out.println("1 - Inscripción Admisiones");
			System.out.println("2 - Matricula academica");
			System.out.println("3 - Inscripción Extensión");
			System.out.println("4 - Financiación");
			System.out.println("5 - Derecho de grado");
			int opcion2 = teclado.nextInt();
			switch (opcion2) {
			case 1: 
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
		
				break;
			case 5:
		
				break;
				
			}
			
		case 3:
			System.out.println("Solicitudes");
			System.out.println("1. Solicitudes academicas administrativas");
			System.out.println("2. Preparatorios");
			System.out.println("3. Retiro aplazamiento reintegro");
			System.out.println("4. solicitud pin de vsaldo");
			System.out.println("5. Solicitud pregrado");
			System.out.println("6. Solicitud Renovacion credito ICETEX");
			int opcion3 = teclado.nextInt();
			switch(opcion3){
			case 1:

			break;
			case 2:

			break;
			case 3:

			break;
			case 4:

			break;
			case 5:

			break;
			case 6:

			break;
			}
			break;
			

		default:
			break;
		}
	}
}
