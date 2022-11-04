package DATA;

import MODEL.Comprador;
import MODEL.Producto;
import MODEL.Vendedor;

import java.util.ArrayList;

public class Inventario {

    public static ArrayList<Producto> productosRegistrados = new ArrayList<Producto>();

    public static boolean emailCorrect = false;

    public static Producto producto;

    public static int elementosComprados = 0;

    static int getElementosComprados [] = new int[5];

    public Inventario (int idProducto) {


        //Alimentación
        productosRegistrados.add(new Producto("Alimentación", "Classic Fried Chicken Sándwich", 1825, 1, 17900));
        productosRegistrados.add(new Producto("Alimentación", "Chiki Tenders", 1826, 6,  17900));

        //Tecnologia
        productosRegistrados.add(new Producto("Tecnologia", "Sony a7S II ILCE7SM2/B - Cámara con montura en E de 12.2MP", 3827, 5, 6011670));
        productosRegistrados.add(new Producto("Tecnologia", "HP Laptop con pantalla táctil Full HD de 15.6 pulgadas", 3828, 5,  3472169));


        for (Producto i : productosRegistrados) {
            if (i.getiDProducto().equals(idProducto)) {
                producto = i;
            }

            //Array para guardar datos selecionados

            for (int j = 0; j < 5; j++) {
                getElementosComprados[0] = elementosComprados;
            }
        }
    }
}

