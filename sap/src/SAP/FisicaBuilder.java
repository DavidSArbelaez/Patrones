package SAP;

public class FisicaBuilder implements Builder {
	private int cont = 0;

	@Override
	public int setCreditos() {
		return 6;
	}

	@Override
	public String setNombreMateria() {
		// TODO Auto-generated method stub
		cont++;
		if (cont % 2 == 0) {
			if (cont > 4) {
				cont = 1;
			}
			return "Fisica Electromagnetica " + Integer.toString(cont);
		}

		return "Fisica " + Integer.toString(cont);
	}

	@Override
	public int setSemestre() {
		// TODO Auto-generated method stub
		return 5;
	}

}
