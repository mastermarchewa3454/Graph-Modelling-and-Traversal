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

    
public class Graph3
{
    private Ball[] ball = new Ball[5];
   

    public Graph3()
    {
        GInfo g = new GInfo();
        GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
        ball[0] = new Ball(400,200, g.getSizeBall(),g.getBallColor());
        ball[1] = new Ball(575,400, g.getSizeBall(),g.getBallColor());
        ball[2] = new Ball(400,700, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(225,400, g.getSizeBall() ,g.getBallColor());
        
        Text textJ = new Text("J",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textK = new Text("K",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textM = new Text("M",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textL = new Text("L",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );

        /*
        Line lineJK = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineKL = new Line (ball[3].getXPosition(), ball[3].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineLM = new Line (ball[2].getXPosition(), ball[2].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineMJ = new Line (ball[1].getXPosition(), ball[1].getYPosition(), ball[0].getXPosition(), ball[0].getYPosition(), g.getWidthLine(), g.getTextColor());
        
        arena.addLine(lineJK);
        arena.addLine(lineKL);
        arena.addLine(lineLM);
        arena.addLine(lineMJ);
        */
        
        Arrow arrowJK = new Arrow (ball[0].getXPosition(), ball[0].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowKl = new Arrow (ball[3].getXPosition(), ball[3].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowLM = new Arrow (ball[2].getXPosition(), ball[2].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowMJ = new Arrow (ball[1].getXPosition(), ball[1].getYPosition(), ball[0].getXPosition(), ball[0].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);


        arena.update();

        for (int i= 0; i<4; i++)
        {
            arena.addBall(ball[i]);
            if(i==0)
            {
                arena.addText(textJ);
            }
            if(i==1)
            {
                arena.addText(textK);
            }
            if(i==2)
            {
                arena.addText(textM);
            }
            if(i==3)
            {
                arena.addText(textL);
            }
            arena.update();
        }
    }
    public static void main(String[] args)
    {
        Graph3 game = new Graph3();
    }
}