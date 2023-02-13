package Launcher;
import AbstractClass.PizzaBuilder;
import Clases.Cocina;
import Clases.HawaianaPizzaBuilder;
import Clases.PicantePizzaBuilder;
import Clases.Pizzas;
import java.util.Scanner;
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que pizza desea ordenar de las siguientes dos :");
		System.out.println("* De Hawaiana(H) o de Picante(P).");
		System.out.println("Para realizar la orden porfavor escribir La letra identificadora del sabor de la pizza:");
		String sabor =sc.nextLine();
		
		Cocina Chef = new Cocina();
		PizzaBuilder pizzaB ;
		if (sabor.trim().equals("H")) {
			pizzaB= new HawaianaPizzaBuilder();
		}else {
			pizzaB = new PicantePizzaBuilder();
		}
		
		
		Chef.setPizzaBuilder(pizzaB);
		Chef.construirPizza();
		
		Pizzas pizza = Chef.getPizza();
		pizza.MostrarDescripcion();
	}

}
