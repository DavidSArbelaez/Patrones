package Clases;
import Interfaces.IControl;
public class ControlInalambrico implements IControl{
	public ControlInalambrico (int botones) {
		System.out.println("Botones: "+botones+".");
	}

	@Override
	public void encendido() {
		System.out.println("Control inalambrico encedido.");
	}

	@Override
	public void teclas() {
		System.out.println("Botones funcionando.");
	}
	
	
}
