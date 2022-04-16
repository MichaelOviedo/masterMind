/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MasterMind;

/**
 *
 * @author gabri
 */
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Balls extends JPanel {
    public Balls(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Screen panel = new Screen();
        JPanel game = new JPanel();
        
        this.add(panel);
        this.add(game);
    }
}

/*
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
*/
/**
 *
 * @author gabri
 */
/*
public class board extends JFrame {
    public JPanel panel;
    public board(){
        setSize(500,500);
        setTitle("MasterMind");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300,300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        button();
    }
    private void tablero(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void button(){
        JButton boton = new JButton();
        boton.setText("Enviar");
        boton.setBounds(190, 400, 100, 40);
        panel.add(boton);
        boton.setEnabled(true);
    }
}
*/
