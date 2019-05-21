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
    private Rectangle[] rec = new Rectangle[7];
    private Text[] text = new Text[6];
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
    private Rectangle cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
    private SetMenu menu = new SetMenu(); 
    private int[] isExist = new int[8];
    public Start()
    {
        menu.SetMenu(arena, rec, text);
        arena.update();

        for (int i=1; i<=rec.length; i++)
            {
                isExist[i] = 0;
            }
        while(true)
        {
            arena.update();
            if(arena.leftMousePressed() && Math.abs(rec[1].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[1].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[1] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph graph = new Graph(arena);
                isExist[1] = 1;
                arena.addRectangle(rec[6]); 
                arena.addText(text[5]);         
            }
            if(arena.leftMousePressed() && Math.abs(rec[2].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[2].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[2] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph2 graph2 = new Graph2(arena);
                isExist[2] = 1;
                arena.addRectangle(rec[6]);
                arena.addText(text[5]);          
            }
            if(arena.leftMousePressed() && Math.abs(rec[3].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[3].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[3] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph3 graph3 = new Graph3(arena);
                isExist[3] = 1; 
                arena.addRectangle(rec[6]); 
                arena.addText(text[5]);        
            }
            if(arena.leftMousePressed() && Math.abs(rec[4].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[4].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[4] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph4 graph4 = new Graph4(arena);
                isExist[4] = 1; 
                arena.addRectangle(rec[6]);
                arena.addText(text[5]);          
            }
            if(arena.leftMousePressed() && Math.abs(rec[5].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[5].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[5] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph5 graph5 = new Graph5(arena);
                isExist[5] = 1; 
                arena.addRectangle(rec[6]); 
                arena.addText(text[5]);         
            }
            else if(arena.leftMousePressed() && Math.abs(rec[6].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[6].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                
                for (int i=1; i<=rec.length; i++)
                {
                    isExist[i] = 0;
                }
                menu.SetMenu(arena, rec, text);
                arena.update();
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