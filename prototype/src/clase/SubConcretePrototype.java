/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author golden
 */
public class SubConcretePrototype extends ConcretePrototype{
    private String lastName;
    private String mobile;
    
    public SubConcretePrototype(){}
    
    public SubConcretePrototype(SubConcretePrototype cp){
        super(cp);
        this.lastName=cp.lastName;
        this.mobile=cp.mobile;
    }
    
    @Override
    public IPrototype clone() {
        SubConcretePrototype cp=new SubConcretePrototype(this);
        return cp;
    }
    
    public String toString(){
        return "id:"+super.id+" id2:"+super.id2+" name:"+super.name+" lastName:"+this.lastName+" mobile:"+this.mobile;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
}
