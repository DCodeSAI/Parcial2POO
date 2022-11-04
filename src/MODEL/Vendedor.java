package MODEL;

public class Vendedor extends User {

    private String ubicacion;

    private int calificacion;


    public Vendedor(String name, String nombre, String email) {
        super(name, email);
    }

    public Vendedor(String name, String nombre) {
        super(name, nombre);
    }


}
