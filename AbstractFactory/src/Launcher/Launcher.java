package Launcher;

import Interfaces.*;
import java.util.Scanner;
import Clases.EmpresaAlpina;
import Clases.EmpresaColanta;

public class Launcher {

	public static void main(String[] args) {
		// Se pide los datos de la empresa a implementar
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe a para empresa alpina o c para colanta");
		String y = sc.nextLine();

		IEmpresa empresa = null;
		//Se implementa la empresa de acuerdo a lo ingresado por el usuario
		if (y.trim().equals("a")) {
			empresa = new EmpresaAlpina();
		} else {
			empresa = new EmpresaColanta();
		}
		//Se implementan el objeto queso y yogurt de la empresa implementada y se empacan
		IQueso queso = empresa.crearQueso();
		IYogurt yogurt = empresa.crearYogurt();
		queso.Empacado();
		yogurt.Empacado();
	}

}
