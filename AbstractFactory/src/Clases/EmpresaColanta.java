package Clases;

import Interfaces.*;

public class EmpresaColanta implements IEmpresa{
	/*
	 * Método que crea una implementación de la interfase IQueso
	 */
	@Override
    public IQueso crearQueso() {
        return new QuesoColanta();
    }
	
	/*
	 * Método que crea una implementación de la interfase IYogurt
	 */
    @Override
    public IYogurt crearYogurt() {
        return new Yogurt();
    }
}

