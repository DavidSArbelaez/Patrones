package Clases;

import AbstractClass.PizzaBuilder;
/*
 * Concrete Builder
 */
public class PicantePizzaBuilder extends PizzaBuilder{
	@Override
	public void buildMasa() {
		pizza.setMasa("cocida");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("picante");
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("pimienta+salchichon");
	}

	@Override
	public void buildSabor() {
		// TODO Auto-generated method stub
		pizza.setSabor("Picante");
	}
}
