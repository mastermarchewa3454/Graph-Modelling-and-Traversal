import java.util.*;
import java.util.Collections;
import java.util.concurrent.locks.*;
import javafx.scene.input.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.SwingUtilities;
import javafx.application.Platform;
import javafx.animation.AnimationTimer;
import javafx.embed.swing.JFXPanel;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;



public class Graph
{
    
    private Ball[] ball = new Ball[5];
    private LinkedList<Line> lineList = new LinkedList<Line>();
        GInfo g = new GInfo();
        UnDirected un = new UnDirected();
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
 
    public Graph()
    {
        
        
        ball[0] = new Ball(400,400, g.getSizeBall() ,g.getBallColor());
        ball[1] = new Ball(600,400, g.getSizeBall() ,g.getBallColor());
        ball[2] = new Ball(400,600, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(600,600, g.getSizeBall() ,g.getBallColor());

        Text textA = new Text("A",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textB = new Text("B",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textC = new Text("C",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textD = new Text("D",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );

        un.unDirected(ball[0], ball[1], arena);
        un.unDirected(ball[0], ball[2], arena);
        un.unDirected(ball[2], ball[3], arena);
        un.unDirected(ball[1], ball[3], arena);
       // Line lineAB = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), g.getWidthLine(), g.getTextColor());
     //   Line lineAC = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor());
     //   Line lineCD = new Line (ball[2].getXPosition(), ball[2].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor());
      //  Line lineBD = new Line (ball[1].getXPosition(), ball[1].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor());
          
      //  lineList.add(lineAB);
     //   lineList.add(lineAC);
     //   lineList.add(lineCD);
       // lineList.add(lineBD);

       // arena.addLine(lineAB);
       // arena.addLine(lineAC);
       // arena.addLine(lineCD);
       // arena.addLine(lineBD);
        arena.update();
        for (int i= 0; i<4; i++)
        {
            arena.addBall(ball[i]);
            if(i==0)
            {
                arena.addText(textA);
            }
            if(i==1)
            {
                arena.addText(textB);
            }
            if(i==2)
            {
                arena.addText(textC);
            }
            if(i==3)
            {
                arena.addText(textD);
            }
            arena.update();
        }
    arena.update();
        
    
    
   
            
          
        
}
    
    public static void main(String[] args)
    {
        Graph game = new Graph();
    }     

}
