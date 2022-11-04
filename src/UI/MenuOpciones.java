package UI;

import javax.swing.*;
import java.awt.*;


public class MenuOpciones extends JPanel {

        public MenuOpciones() {

            setVisible(true);

            //Creando la barra
            JMenuBar menuBar = new JMenuBar();


            //Creando items
            JMenu información = new JMenu("Información");


            menuBar.add(información);


            add(menuBar);

            //Creando items de la clase
            JMenuItem número_unidades_en_bodega = new JMenu("Número unidades en Bodega");
            JMenuItem calificaciones = new JMenu("Calificaciones");
            JMenuItem productos_vendidos = new JMenu("Productos vendidos");

            información.add(número_unidades_en_bodega);
            información.addSeparator();
            información.add(productos_vendidos);
            información.add(calificaciones);

        }
    }

