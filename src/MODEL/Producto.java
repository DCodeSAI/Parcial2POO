package MODEL;

public class Producto {

    private String tipoDeProducto;

    private String nombre;

    private Integer iDProducto;

    private int cantidad;


    private int Valor;



    public Producto(String tipoDeProducto, String nombre, Integer iDProducto, int cantidad, int Valor) {
        this.tipoDeProducto = tipoDeProducto;
        this.nombre = nombre;
        this.iDProducto = iDProducto;
        this.cantidad = cantidad;
        this.Valor = Valor;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getiDProducto() {
        return iDProducto;
    }

    public int getCantidad() {
        return cantidad;
    }


    public int getValor (){
        return Valor;}

}
