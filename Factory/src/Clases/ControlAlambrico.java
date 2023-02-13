package Clases;
import Interfaces.IControl;
public class ControlAlambrico implements IControl{
	public ControlAlambrico(int botones) {
		System.out.println("Tiene "+botones+" botones.");
	}

	@Override
	public void encendido() {
		System.out.println("Control alambrico encedido.");
	}

	@Override
	public void teclas() {
		System.out.println("Botones funcionando.");
	}
	
	
}
