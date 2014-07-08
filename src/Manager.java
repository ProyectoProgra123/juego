
public class Manager {

    Start start;
    Single uno;
    Double dos;
    Avion avion;
   
    public Manager() {
        start= new Start(this);
        uno = new Single(this);
        dos= new Double(this);
        avion= new Avion(this);
    }
    
    public static void main(String []args){
        Manager m= new Manager();
        new Start(m);
    }
    
}
