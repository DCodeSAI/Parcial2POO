package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDeCompra extends JFrame {


    public VentanaDeCompra() {


        setVisible(true);
        setBounds(600, 350, 500,100);
        setBackground(Color.CYAN);

        setTitle(" Ventana de compra");

        Lamina lamina = new Lamina();
        add(lamina);

        Panel_layout1 botonesTipos = new Panel_layout1();
        add(botonesTipos, BorderLayout.SOUTH);

    }
}

class Panel_layout1 extends JPanel implements ActionListener{

    JButton button1 = new JButton("Tecnologia");
    JButton button2 = new JButton("Alimentación");



    public Panel_layout1(){

        add(button1);
        add(button2);


        button1.addActionListener(this);
        button2.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object opcion = e.getSource();

        if (opcion==button1){

            VentanaTecnologia ventanaTecnologia = new VentanaTecnologia();

        } else if (opcion==button2) {

            VentanaAlimentos ventanaAlimentos = new VentanaAlimentos();

            System.out.println(" Boton 2");

        }

    }
}

class Lamina extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Elige el tipo de producto que desees", 100, 22);

    }
}



