package Clases;
import AbstractClasses.AbstractFabric;
import Interfaces.IControl;
public class FabricaInalambrica extends AbstractFabric{
	@Override
    public IControl crearControl() {
        int r=askNumber();
        return new ControlInalambrico(r);
    }
}
