package SAP;

import java.util.ArrayList;


/*
 * CLase director y composite
 */
public class Composite implements IComponenteMaterias{
	ArrayList<IComponenteMaterias> listaMaterias = new ArrayList<IComponenteMaterias>();

	@Override
	public int GetNumCreditos() {
		// TODO Auto-generated method stub
		return 0;
	}

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
	
}
