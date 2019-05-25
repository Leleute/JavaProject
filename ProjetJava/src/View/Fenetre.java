/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Connexion; 

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Color; 
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JPanel;

/**
 *
 * @author HU
 */
public class Fenetre extends JFrame implements ActionListener {
    
       JFrame fenetre = new JFrame(); 
       JPanel header = new JPanel(); 
       JPanel panel2 = new JPanel(); 
       JPanel footer = new JPanel(); 
       JPanel center = new JPanel(); 
       
       JButton connexion = new JButton("Connexion"); 
       JButton exit = new JButton("Quitter"); 
       
       JButton next = new JButton("Page suivante"); 
       
      JLabel label = new JLabel(" Bienvenue sur ECE PARIS"); 
      JLabel header1= new JLabel(" ECE PARIS "); 
      JLabel footer1 = new JLabel(" Projet Java Mouna, Pablo,Matthieu, Thomas"); 
       
       
       
    
    public Fenetre() {
        
        /// creation de la fenetre  
        
        
        FlowLayout flow = new FlowLayout(); 
        header.setBackground(Color.blue); 
        panel2.setBackground(Color.white); 
        footer.setBackground(Color.black); 
        
        panel2.add(label); 
        
        connexion.setLayout(flow); 
       
        
        
   
 
        /// taille et police de texte 
        
        Font font1 = new Font("Arial",Font.BOLD,18); 
        header1.setFont(font1); 
        /// header
        header.add(header1); 
        header1.setForeground(Color.white); 
        
        //footer 
       footer.add(footer1); 
       footer1.setForeground(Color.white); 
              
        
        fenetre.add(header, BorderLayout.NORTH); 
        fenetre.add(panel2, BorderLayout.CENTER); 
        panel2.add(center , BorderLayout.CENTER); 
        fenetre.add(footer, BorderLayout.SOUTH); 
        
         center.add(connexion); 
         center.add(next); 
         footer.add(exit); 
        connexion.addActionListener(this); 
        exit.addActionListener(this); 
        next.addActionListener(this); 
      
        connexion.setBounds(200,200,100,10); 
     
        fenetre.setSize(500,500); 
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true); 
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==exit){
        
        System.exit(0);
        
        }
        
        if(e.getSource()== connexion)
        {
            JOptionPane.showMessageDialog(this," Vous etes connecté"); 
        
        }
        
        
       
     
    }
    
    
    
    
    
}
