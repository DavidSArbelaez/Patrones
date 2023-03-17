package SAP;



import java.util.Scanner;

public class Menu {
	public void menu() {
		Scanner teclado = new Scanner(System.in);
		ServiciosEstudiantes servicio = new ServiciosEstudiantes();
		
		System.out.println("Ingrese el nombre, identificacion, semestre a cursar y la carrera cursada");
		String nombre = teclado.nextLine();
		int id = teclado.nextInt();
		int semestre = teclado.nextInt();
		String carrera = teclado.next();


		Estudiantes estudiante = new Estudiantes(nombre, id, semestre, carrera);

		
		Certificaciones certificados = new Certificaciones(estudiante, "academico");
		Solicitudes solicitud = new Solicitudes();
		Pagos pagos = new Pagos();
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
				servicio.mostrarMaterias(estudiante.getComposite().getListaMaterias());
				break;

			case 2:
				servicio.consultarNotasParciales(estudiante);
				break;

			case 3:
				estudiante = servicio.actualizarDatos(estudiante);
				break;

			case 4:
				certificados.CertificadoEstudio(estudiante.getNombre());
				break;

			case 5:
				certificados.Normativa();
				break;

			case 6:
				estudiante = servicio.inscribeAsignaturas(estudiante);
				break;

			case 7:
				solicitud.solicitudAcademicaAdministrativa();
				break;

			case 8:
				servicio.consultaCitaMatricula();
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
				pagos.pagoInscripcionAdmisiones();
				break;
			case 2:
				pagos.pagoMatriculaAcademia();
				break;
			case 3:
				pagos.pagoInscripcionExtenxion();
				break;
			case 4:
				pagos.financiacion();
				break;
			case 5:
				pagos.pagoDerechoGrado();
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
			switch (opcion3) {
			case 1:
				solicitud.solicitudAcademicaAdministrativa();
				break;
			case 2:
				solicitud.preparatorio();
				break;
			case 3:
				solicitud.retiroAplazamientoReintegro();
				break;
			case 4:
				solicitud.solicitudPinDEVsaldo();
				break;
			case 5:
				solicitud.supletorioPregrado();
				break;
			case 6:
				solicitud.solicitudRenovacionCreditoICETEX();
				break;
			}
			break;

		default:
			break;
		}
	}
}
