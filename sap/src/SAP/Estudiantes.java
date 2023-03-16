package SAP;


import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes extends Persona{
	int semestre;
	String carrera;
	ArrayList<Materia> Materias;
	
	
	public Estudiantes(String nombre, int id, int semestre, String carrera) {
		super(nombre, id);
		this.semestre = semestre;
		this.carrera = carrera;
		this.Materias = new ArrayList<Materia>();
	}
	
	

	/**
	 * @param materias the materias to set
	 */
	protected void setMaterias(ArrayList<Materia> materias) {
		Materias = materias;
	}



	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}



	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return Materias;
	}



	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	

	@Override
	public String toString() {
		return "Estudiantes [carrera=" + carrera + "]";
	}


	@Override
	public void menu() {
		// TODO Auto-generated method stub> asignaturas;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Menú: Digite una opción");
		
		System.out.println("1 - Servicios");
		System.out.println("2 - Pagos");
		System.out.println("3 - Solicitudes");
		
		int opcion = teclado.nextInt();
		switch (opcion) {
		
		case 1:
			System.out.println("Servicios");
			System.out.println("1 - Consultar horario");
			System.out.println("2 - Consultar notas parciales");
			System.out.println("3 - Actualizar datos");
			System.out.println("4 - Solicitudes certificado");
			System.out.println("5 - Programa academico");
			System.out.println("6 - Consulta normativa");
			System.out.println("7 - Inscribe asignaturas");
			System.out.println("8 - Solicitudes academicas administrativas");
			System.out.println("9 - Consulta cita matricula");
			
			int opcion1 = teclado.nextInt();
			switch (opcion1) {
			
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
