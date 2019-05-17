import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
   // Graph graph = new Graph();
   // Graph2 graph2 = new Graph2();
    

    JButton graph2Button = new JButton ("Show graph2");


    public Menu()
    {
        JLabel intro = new JLabel("Click the button to show the graph you want");
        intro.setSize(750, 40);
        intro.setLocation(80, 10);
        intro.setFont(new Font("Serif", Font.BOLD, 28));

        JButton graphButton = new JButton (new ImageIcon ("D:\\Study\\SoftwareDevelopment\\GraphProject\\GameArena-master\\Graph1.png"));
        graphButton.setBounds(225,70,185,65);
        graphButton.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            ;
        }
        }); 
        
        JButton graph2Button = new JButton (new ImageIcon ("D:\\Study\\SoftwareDevelopment\\GraphProject\\GameArena-master\\Graph2.png"));
        graph2Button.setBounds(225,160,185,65);
        graph2Button.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            ;
        }
        }); 
        

          JFrame f= new JFrame("Graph Traversal");
            
          JMenuBar mb=new JMenuBar();   
          f.setJMenuBar(mb);  
          f.setSize(700,700);
          f.add(intro);
          f.add(graphButton);
          f.add(graph2Button);   
          JLabel background=new JLabel(new ImageIcon("D:\\Study\\SoftwareDevelopment\\GraphProject\\GameArena-master\\background11.jpg"));
          background.setLayout(new FlowLayout());
	      f.add(background);
	      
          // background.add(graphButton);
          f.setResizable(false);
          f.setVisible(true);
          
        



    }  
public static void main(String args[])  
    {  
        Menu menu = new Menu();
    }
} 