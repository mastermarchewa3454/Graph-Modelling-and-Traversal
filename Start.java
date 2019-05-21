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


public class Start
{
    private GInfo g = new GInfo();
    private Rectangle[] rec = new Rectangle[6];
    private Text[] text = new Text[6];
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
    private Rectangle cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
    
    public Start()
    {
        Text textintro = new Text("Choose the graph you would like to see",50,100,45, g.getTextColor() );
        arena.addText(textintro);
        arena.update();
        rec[1] = new Rectangle(200,250,g.getRecWidth(), g.getRecHeight(),"#FFD700");
        rec[2] = new Rectangle(200,500,g.getRecWidth(), g.getRecHeight(),"#FFD700");
        rec[3] = new Rectangle(200,750,g.getRecWidth(), g.getRecHeight(),"#FFD700");
        rec[4] = new Rectangle(700,250,g.getRecWidth(), g.getRecHeight(),"#FFD700");
        rec[5] = new Rectangle(700,500,g.getRecWidth(), g.getRecHeight(),"#FFD700");
       // rec[5] = new Rectangle(700,750,g.getRecWidth(), g.getRecHeight(),"#FFD700");

        arena.addRectangle(rec[1]);
        arena.addRectangle(rec[2]);
        arena.addRectangle(rec[3]);
        arena.addRectangle(rec[4]);
        arena.addRectangle(rec[5]);
       // arena.addRectangle(rec[5]);

        text[0] = new Text("Graph 1",rec[1].getXPosition()-50,rec[1].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[1] = new Text("Graph 2",rec[2].getXPosition()-50,rec[2].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[2] = new Text("Graph 3",rec[3].getXPosition()-50,rec[3].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[3] = new Text("Graph 4",rec[4].getXPosition()-50,rec[4].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[4] = new Text("Graph 5",rec[5].getXPosition()-50,rec[5].getYPosition(), g.getTextSize()+10, g.getTextColor() );
     // text[5] = new Text("Graph 6",rec[5].getXPosition()-50,rec[5].getYPosition(), g.getTextSize()+10, g.getTextColor());
        arena.addText(text[0]);
        arena.addText(text[1]);
        arena.addText(text[2]);
        arena.addText(text[3]);
        arena.addText(text[4]);
       // arena.addText(text[5]);

        

        while(true)
        {
            arena.update();
            if(arena.leftMousePressed() && Math.abs(rec[1].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[1].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                arena.addRectangle(cov);
                Graph graph = new Graph(arena);     
            }
            else if(arena.leftMousePressed() && Math.abs(rec[2].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[2].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                arena.addRectangle(cov);
                Graph2 graph2 = new Graph2(arena);     
            }
            else if(arena.leftMousePressed() && Math.abs(rec[3].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[3].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                arena.addRectangle(cov);
                Graph3 graph3 = new Graph3(arena);     
            }
            else if(arena.leftMousePressed() && Math.abs(rec[4].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[4].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                arena.addRectangle(cov);
                Graph4 graph4 = new Graph4(arena);     
            }
            else if(arena.leftMousePressed() && Math.abs(rec[5].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[5].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                arena.addRectangle(cov);
                Graph5 graph5 = new Graph5(arena);     
            }
            
            else if(arena.spacePressed())
            {
                arena.exit();
            }
            
        }        




    }
    public static void main(String[] args)
    {
        Start game = new Start();
    }
}