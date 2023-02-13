package AbstractClass;
import Clases.Pizzas;
public abstract class PizzaBuilder {
	protected Pizzas pizza;

	public Pizzas getPizza() {
		return pizza;
	}

	public void CrearNuevaPizza() {
		pizza = new Pizzas();
	}
	
	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();
	public abstract void buildSabor();
	
}
