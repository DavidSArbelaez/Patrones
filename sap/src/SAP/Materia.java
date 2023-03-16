package SAP;

public class Materia implements IComponenteMaterias{
	String nombreMateria;
	String codigo;
	int Creditos;
	int semestre;
	float corte_1;
	float corte_2;
	float corte_3;
	float notaFinal;
	
	public Materia(String nombreMaterias,int creditos, int semestre, String Codigo) {
		this.nombreMateria = nombreMaterias;
		this.Creditos = creditos;
		this.semestre = semestre;
		this.corte_1 = 0;
		this.corte_2 = 0;
		this.corte_3 = 0;
		this.codigo = Codigo;
	}
	
	
	
	private void calcularNotaFinal() {
		this.notaFinal = (this.getCorte_1()*0.3f)+(this.getCorte_2()*0.3f)+(this.getCorte_3()*0.4f);
	}
	
	@Override
	public int GetNumCreditos(){
		return Creditos;
	}

	/*
	 * Método que suma las notas de las materias para sacar el promedio en el director/composite
	 */
	

	@Override
	public float notaFinalProm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float notaParcial() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return the corte_1
	 */
	public float getCorte_1() {
		return corte_1;
	}

	/**
	 * @param corte_1 the corte_1 to set
	 */
	public void setCorte_1(float corte_1) {
		this.corte_1 = corte_1;
		this.calcularNotaFinal();
	}

	/**
	 * @return the corte_2
	 */
	public float getCorte_2() {
		return corte_2;
	}

	/**
	 * @param corte_2 the corte_2 to set
	 */
	public void setCorte_2(float corte_2) {
		this.corte_2 = corte_2;
		this.calcularNotaFinal();
	}

	/**
	 * @return the corte_3
	 */
	public float getCorte_3() {
		return corte_3;
	}

	/**
	 * @param corte_3 the corte_3 to set
	 */
	public void setCorte_3(float corte_3) {
		this.corte_3 = corte_3;
		this.calcularNotaFinal();
	}

	/**
	 * @return the nombreMateria
	 */
	public String getNombreMateria() {
		return nombreMateria;
	}

	/**
	 * @return the creditos
	 */
	public int getCreditos() {
		return Creditos;
	}

	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * @return the notaFinal
	 */
	public float getNotaFinal() {
		return notaFinal;
	}
	
	

	
	

}
