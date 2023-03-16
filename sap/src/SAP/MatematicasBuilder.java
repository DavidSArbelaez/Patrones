package SAP;

public class MatematicasBuilder implements Builder{
	private int cont = 0;
	@Override
	public int setCreditos() {
		return 3;
	}

	@Override
	public String setNombreMateria() {
		// TODO Auto-generated method stub
		if (cont>3) {
			reset();
		}
		this.cont++;
		return "Matematicas "+Integer.toString(this.cont);
	}

	@Override
	public int setSemestre() {
		// TODO Auto-generated method stub
		
		if (cont>3) {
			reset();
		}
		cont++;
		return cont;
	}
	
	private void reset() {
		cont=0;
	}
	
}