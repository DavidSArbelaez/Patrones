package clase;
/*
 * Clase ConcreteProtoType que implementa la interfaz IPrototype
 */
public class ConcretePrototype implements IPrototype{
	
    protected int id;
    protected int id2;
    protected String name;
    
    /*
     * Constructor vacio
     */
    public ConcretePrototype(){}
    
    public ConcretePrototype(ConcretePrototype cp){
    this.id=cp.id;
    this.name=cp.name;
    this.id2=cp.id2;
    }
    
    @Override
    public IPrototype clone() {
        ConcretePrototype cp=new ConcretePrototype(this);
        return cp;
    }

    public String toString(){
        return "id:"+this.id+" id2:"+this.id2+" name:"+this.name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.id2=id*2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
    
    
}
