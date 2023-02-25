package clase;
/*
 * Clase hija de ConcretePrototype
 * Que agrega unos nuevos atributos y sus respectivos getters y setters
 */
public class SubConcretePrototype extends ConcretePrototype{
    private String lastName;
    private String mobile;
    
    /*
     * Constructor vacio
     */
    public SubConcretePrototype(){}
    
    /*
     * Constructor de la clase que usa tambien el contructor heredada
     */
    public SubConcretePrototype(SubConcretePrototype cp){
        super(cp);
        this.lastName=cp.lastName;
        this.mobile=cp.mobile;
    }
    
    /*
     * Mètodo que sobreescribe el metodo clone de la clase padre para retornar un 
     * objeto de esta clase hija
     */
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
