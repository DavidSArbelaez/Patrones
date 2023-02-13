package Clases;

import AbstractClass.PizzaBuilder;
/*
 * Clase Director
 */
public class Cocina{
	PizzaBuilder PBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		PBuilder = pb;
	}

	public Pizzas getPizza() {
		return PBuilder.getPizza();
	}

	public void construirPizza() {
		PBuilder.CrearNuevaPizza();
		PBuilder.buildMasa();
		PBuilder.buildSalsa();
		PBuilder.buildRelleno();
		PBuilder.buildSabor();
	}
}
