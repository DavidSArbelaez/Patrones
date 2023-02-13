package Launcher;

import java.util.Scanner;

import AbstractClasses.AbstractFabric;
import Clases.FabricaAlambrica;
import Clases.FabricaInalambrica;
import Interfaces.IControl;

public class Launcher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("escribe a o i");
		String y = sc.nextLine();

		AbstractFabric factory = null;

		if (y.trim().equals("a")) {
			factory = new FabricaAlambrica();
		} else {
			factory = new FabricaInalambrica();
		}
		IControl control = factory.crearControl();
		control.encendido();
		control.teclas();
	}

}
