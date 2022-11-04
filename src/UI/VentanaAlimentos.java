package UI;

import DATA.Inventario;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class VentanaAlimentos extends JFrame {


    public VentanaAlimentos (){

        setVisible(true);
        setBounds(50,100,700,800);

        setTitle("Alimentos");

        MenuOpciones menuOpciones = new MenuOpciones();
        add(menuOpciones, BorderLayout.WEST);

        BotonesVentanaAlimentos botonesVentanaAlimentos = new BotonesVentanaAlimentos();
        add(botonesVentanaAlimentos, BorderLayout.EAST);

        ImagenesAlimentos imagenesAlimentos = new ImagenesAlimentos();
        add(imagenesAlimentos);



    }
}

class ImagenesAlimentos extends JPanel {

    private Image imagen1;

    private Image imagen2;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        File camara = new File("src/Graficos/Hamburguesa1.jpg");

        try {
            imagen1 = ImageIO.read(camara);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        g.drawImage(imagen1,0,5, null);

        File computador = new File("src/Graficos/Pollo1.jpg");

        try {
            imagen2 = ImageIO.read(computador);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        g.drawImage(imagen2,0, 400, null);

    }
}

class BotonesVentanaAlimentos extends JPanel implements ActionListener {


    JButton button1 = new JButton("Comprar Hamburguesa");
    JButton button2 = new JButton("Comprar pollo");
    JButton button3 = new JButton("Pagar");
    JButton button4 = new JButton("Salir");




    public BotonesVentanaAlimentos() {

        add(button1);
        add(button2);


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object opcion = e.getSource();

        int seleccion = 0;

        if (opcion == button1) {

            seleccion=1825;

            Inventario inventario = new Inventario(seleccion);
            JOptionPane.showMessageDialog(this, "Has seleccionado " + Inventario.producto.getNombre() + "\nPrecio: " + Inventario.producto.getValor(), " Compra", JOptionPane.INFORMATION_MESSAGE);



        } else if (opcion == button2) {

            seleccion=1826;

            Inventario inventario = new Inventario(seleccion);
            JOptionPane.showMessageDialog(this, "Has seleccionado " + Inventario.producto.getNombre() + "\nPrecio: " + Inventario.producto.getValor(), " Compra", JOptionPane.INFORMATION_MESSAGE);


        } else if (opcion== button3){



        } else if (opcion== button4){

            VentanaDeCompra ventanaDeCompra = new VentanaDeCompra();

        }

        Inventario.elementosComprados = seleccion;
    }
}
