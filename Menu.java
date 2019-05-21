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

import com.sun.glass.ui.Application;

import javax.swing.*;  
public class Menu implements ActionListener 
{  
   // Graph graph = new Graph();
   // Graph2 graph2 = new Graph2();
   private JFrame window;
   JFrame f= new JFrame("Graph Traversal"); 
   JMenuBar mb=new JMenuBar();  
    JButton graphButton = new JButton (new ImageIcon ("D:\\Study\\SoftwareDevelopment\\GraphProject\\GameArena-master\\Graph1.png"));
    JButton graph2Button = new JButton (new ImageIcon ("D:\\Study\\SoftwareDevelopment\\GraphProject\\GameArena-master\\Graph2.png"));

    public Menu()
    {
        JLabel intro = new JLabel("Click the button to show the graph you want");
        intro.setSize(750, 40);
        intro.setLocation(80, 10);
        intro.setFont(new Font("Serif", Font.BOLD, 28));

       
        graphButton.setBounds(225,70,185,65);
        graphButton.addActionListener(this);
 
        graph2Button.setBounds(225,160,185,65);
        graph2Button.addActionListener(this);
                   
          f.setJMenuBar(mb);  
          f.setSize(700,700);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    public void actionPerformed(ActionEvent e)
        {
            JButton b = (JButton) e.getSource();

                if(b == graphButton)
                {       
                    Graph graph = new Graph();
                }
                
                if(b == graph2Button)
                {
                    Graph2 graph2 = new Graph2();
                    
                }

               
        }
    

public static void main(String args[])  
    {  
        Menu menu = new Menu();
    }
} 