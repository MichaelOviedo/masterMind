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
    
        JFrame appFrame = new JFrame();
        appFrame.setSize(new Dimension(500,500));
        appFrame.setTitle("MasterMind");
        appFrame.setPreferredSize(new Dimension(500,500));
        appFrame.setLocationRelativeTo(null);
        appFrame.setMinimumSize(new Dimension(300,300));
        appFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appFrame.setVisible(true);

        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setPreferredSize(new Dimension(400,100));
        panel.setBackground(new Color(120, 120, 120));
        panel.setLayout(null);
        
        appFrame.add(panel);
    
        JButton boton = new JButton();
        boton.setText("Enviar");
        boton.setBounds(190, 400, 100, 40);
        panel.add(boton);
        boton.setEnabled(true);
        
    
 }

}