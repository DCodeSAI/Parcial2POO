package DATA;

import MODEL.Comprador;

import java.util.ArrayList;

public class CompradoresRegistrados {

    public static ArrayList<Comprador> compradoresRegistrados = new ArrayList<Comprador>();

    public static boolean emailCorrect = false;

    public static Comprador compradorLogeado;



    public CompradoresRegistrados (String email) {

        Comprador comprador1 = new Comprador("David Mena ", "dmena@hotmail.com");
        Comprador comprador2 = new Comprador("Cristian Nodal", "cNodal@gmail.com");
        Comprador comprador3 = new Comprador("Carlos Motoa", "cMotoa@outlook.com");
        Comprador comprador4 = new Comprador("Hillary Torres", "hTorres@hotmail.com");

        compradoresRegistrados.add(comprador1);
        compradoresRegistrados.add(comprador2);
        compradoresRegistrados.add(comprador3);
        compradoresRegistrados.add(comprador4);


        for (Comprador c :compradoresRegistrados) {
            if (c.getEmail().equals(email)) {
                emailCorrect = true;
                //Obtener el usuario logeado
                compradorLogeado = c;


            }
        }
    }
}