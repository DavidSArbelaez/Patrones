package SAP;

import java.util.ArrayList;

/*
 * CLase director y composite
 */
public class Composite implements IComponenteMaterias {
	ArrayList<Materia> listaMaterias = new ArrayList<Materia>();

	public void añadirMateria(Materia materia) {
		listaMaterias.add(materia);
	}

	public void quitarMateria(IComponenteMaterias materia) {
		listaMaterias.remove(materia);
	}

	/**
	 * @return the listaMaterias
	 */
	protected ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}

	@Override
	public int GetNumCreditos() {
		int cont = 0;
		for (IComponenteMaterias materia : listaMaterias) {
			cont += materia.GetNumCreditos();
		}
		return cont;
	}

	@Override
	public float notaFinalProm() {
		int sum = 0;
		for (IComponenteMaterias materia : listaMaterias) {
			sum += materia.notaFinalProm();
		}
		return sum / GetNumCreditos();
	}

	@Override
	public void mostrarNotasParciales() {
		for (Materia materia : listaMaterias) {
			materia.mostrarNotasParciales();
		}
	}
}
