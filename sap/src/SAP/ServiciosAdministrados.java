package SAP;

public class ServiciosAdministrados implements IServiciosAdministrados{
  protected int valor;
  protected int cantSemestres;
  protected Estudiantes estudiante;
  
  	/*
	 * Constructor vacio
	 */
	public ServiciosAdministrados() {
	}

	/*
	 * Constructor de la clase para clonar el objeto
	 */
	public ServiciosAdministrados(ServiciosAdministrados sa) {
		this.id = sa.valor;
		this.cantSemestres = sa.cantSemestres;
		this.estudiante = sa.estudiante;
	}
	
  /*
	 * Mètodo que implementa el metodo abstracto de la interfaz
	 * El cual crea un objeto ServiciosAdministrados con los atributos de este objeto y lo retorna
	 */
	@Override
	public IServiciosAdministrados renovarMatricula() {
		ServiciosAdministrados sa = new ServiciosAdministrados (this);
		return sa;
	}
  
  
	/*
	 * Mètodo que muestra los atributos de la clase en apntalla
	 */
	public String toString() {
		return "valor:" + this.valor + " cantidad semestres:" + this.cantSemestres + " estudiante:" + this.estudiante;
	}

	public int getvalor() {
		return valor;
	}

	public void setvalor(int valor) {
		this.valor = valor;
	}
  
  
	public int getcantSemestres() {
		return cantSemestres;
	}

	public void setcantSemestres(int cantSemestres) {
		this.cantSemestres = cantSemestres;
	}
  
  
	public int getestudiante() {
		return estudiante;
	}

	public void setestudiante(Estudiantes estudiante) {
		this.estudiante =estudiante;
	}
  
  
}
