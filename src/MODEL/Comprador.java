package MODEL;

public class Comprador extends User{

    private int numProductosComprados;

    public Comprador(){

    }

    public Comprador(String name, String email){
        super(name, email);
    }

    public Comprador(String name, int numProductosComprados, String email) {
        super(name, email);
        this.numProductosComprados = numProductosComprados;
    }

    public int getNumProductosComprados() {
        return numProductosComprados;
    }

}
