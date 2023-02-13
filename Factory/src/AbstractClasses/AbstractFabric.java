package AbstractClasses;
import java.util.Scanner;
import Interfaces.IControl;
public abstract class AbstractFabric {
    /*
     * 
     */
	public abstract IControl crearControl();
    
    /*
     * 
     */
	public int askNumber() {
		System.out.println("Cuantos botones desea?");
		Scanner sc = new Scanner(System.in);
		String nn = sc.nextLine();
		int k = Integer.parseInt(nn);
		return k;
	}
}
