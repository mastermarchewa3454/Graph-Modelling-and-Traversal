import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.*;  
public class Menu  
{  
    Graph graph = new Graph();
    Graph2 graph2 = new Graph2();
    

    JButton graph2Button = new JButton ("Show graph2");


    public Menu()
    {
        JButton graphButton = new JButton ("Show graph1");
        graphButton.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            ;
        }
        }); 
        
        

          JFrame f= new JFrame("Graph Traversal");  
          JMenuBar mb=new JMenuBar();   
          f.setJMenuBar(mb);  
          f.setSize(600,600);  
          f.setLayout(null); 
          f.add(graphButton); 
          f.setVisible(true);
          
        



    }  
public static void main(String args[])  
    {  
        new Menu();
    }
} 