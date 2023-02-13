package Clases;
import AbstractClasses.AbstractFabric;
import Interfaces.IControl;
public class FabricaAlambrica extends AbstractFabric{

	@Override
	public IControl crearControl() {
		int r= askNumber();
		return new ControlAlambrico(r);
	}

}
