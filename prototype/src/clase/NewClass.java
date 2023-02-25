/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author golden
 */
public class NewClass extends SubConcretePrototype{
    private int i;
    
    public NewClass(){}
    
    public NewClass(NewClass c){
        super(c);
        this.i=c.i;
    }
    
    public IPrototype clone(){
        NewClass nc=new NewClass(this);
        return nc;
    }
    public String toString(){
    String k=super.toString();
    k+=" i:"+this.i;
    return k;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
}
