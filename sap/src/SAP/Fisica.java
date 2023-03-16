package SAP;

public class Fisica implements Builder{
	Materia materia;
	private int cont = 0;
	@Override
	public int setCreditos() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String setNombreMateria() {
		// TODO Auto-generated method stub
		cont ++;
		if (cont%2 == 0){
			
			return "Fisica Electromagnetica "+ Integer.toString(cont);
		}
		
		return "Fisica "+Integer.toString(cont);
	}

	@Override
	public int setSemestre() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
