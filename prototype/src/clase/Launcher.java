/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clase;

/**
 *
 * @author golden
 */
public class Launcher {

    public static void main(String[] args) {
        ConcretePrototype a=new ConcretePrototype();
        a.setId(23);
        a.setName("Juan");
        
        ConcretePrototype b=(ConcretePrototype)a.clone();
        System.out.println(b.toString());
    
    SubConcretePrototype scp1=new SubConcretePrototype();
    scp1.setId(2);
    scp1.setName("Juan");
    scp1.setLastName("Perez");
    scp1.setMobile("6131248");
    
    System.out.println(scp1.toString());
    SubConcretePrototype scp2=(SubConcretePrototype)scp1.clone();
    System.out.println(scp2.toString());
    
        NewClass c=new NewClass();
        c.setId(3);
        c.setI(3);
        c.setLastName("PErez");
        c.setMobile("978448");
        c.setName("Juan");
        System.out.println(a);
        
        NewClass d=(NewClass)c.clone();
        System.out.println(c);
        System.out.println(c==d);
    
    }
}
