package DATA;

import MODEL.Vendedor;

import java.util.ArrayList;

public class VendedoresRegistados {

    public static ArrayList<Vendedor> vendedoresRegistrados = new ArrayList<Vendedor>();

    public ArrayList<Vendedor> setVendedoresRegistrados (){

        Vendedor tienda1 = new Vendedor("D1", "d1Of@gmail.com");
        Vendedor tienda2 = new Vendedor("Amazon Colombia", "azonCol@hotmail.com");
        Vendedor tienda3 = new Vendedor("Rappi Colombia", "rapCol@outlook.com");

        vendedoresRegistrados.add(tienda1);
        vendedoresRegistrados.add(tienda2);
        vendedoresRegistrados.add(tienda3);

        return vendedoresRegistrados;

    }

}
