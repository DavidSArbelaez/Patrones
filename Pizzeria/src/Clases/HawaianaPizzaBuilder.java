package Clases;
import AbstractClass.PizzaBuilder;
//Concrete Builder
public class HawaianaPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildMasa() {
		pizza.setMasa("suave");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("choriza+alchoffas");
	}

	@Override
	public void buildSabor() {
		pizza.setSabor("Hawaiana");		
	}
	
}
