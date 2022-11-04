package UI;

import DATA.CompradoresRegistrados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSession extends JFrame {

  public  InicioSession (){

      setVisible(true);
      setTitle("Inicio de sesión");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setBounds(600, 350, 500, 100);

      VentanaSession ventanaSession = new VentanaSession();
      add(ventanaSession);

       }
    }

    class VentanaSession extends JPanel {

        private JTextArea area;

        public VentanaSession() {


            JLabel texto1 = new JLabel("Correo");
            add(texto1);

            area = new JTextArea(1, 20);
            add(area);

            area.setLineWrap(true);

            JButton boton = new JButton("Iniciar sessión");
            add(boton);

            boton.addActionListener(new GestionArea());
        }

        private class GestionArea extends Component implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent e) {

                CompradoresRegistrados compradoresRegistrados = new CompradoresRegistrados(area.getText());

                if (CompradoresRegistrados.emailCorrect==true){
                    JOptionPane.showMessageDialog(this, "Login exitoso " + "\nBienvenido: " + CompradoresRegistrados.compradorLogeado.getName(), "Login exitoso", JOptionPane.INFORMATION_MESSAGE);


                    VentanaDeCompra ventanaDeCompra = new VentanaDeCompra();

                } else {
                    JOptionPane.showMessageDialog(this, "Intente nuevamente " , "Error al ingresar", JOptionPane.INFORMATION_MESSAGE);


                }

            }

        }
    }


