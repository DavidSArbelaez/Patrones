package Clases;
import Interfaces.*;
public class EmpresaAlpina implements IEmpresa{
	/*
	 * Método que crea una implementación de la interfase IQueso
	 */
	@Override
    public IQueso crearQueso() {
        return new Alpinito();
    }
	
	/*
	 * Método que crea una implementación de la interfase IYogurt
	 */
    @Override
    public IYogurt crearYogurt() {
        return new YogoYogo();
    }
}
