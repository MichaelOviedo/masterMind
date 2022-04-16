/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masterMind;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author gabri
 */
public class masterMind {
    public static void main(String[] args){
    
        JFrame juego = new JFrame();
        juego.setSize(new Dimension(500,500));
        juego.setTitle("MasterMind");
        juego.setPreferredSize(new Dimension(500,500));
        juego.setLocationRelativeTo(null);
        juego.setMinimumSize(new Dimension(300,300));
        juego.setDefaultCloseOperation(EXIT_ON_CLOSE);
        juego.setVisible(true);

        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setPreferredSize(new Dimension(400,100));
        panel.setBackground(new Color(120, 120, 120));
        panel.setLayout(null);
        
        juego.add(panel);
    
        JButton boton = new JButton();
        boton.setText("Enviar");
        boton.setBounds(190, 400, 100, 40);
        panel.add(boton);
        boton.setEnabled(true);
        
    
 }

}