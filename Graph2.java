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

public class Graph2
{

    private Ball[] ball = new Ball[5];
    private Line[][] line = new Line[5][5];
    private Text[] text = new Text[5];
    private LinkedList<Line> lineList = new LinkedList<Line>();

    

    public Graph2()
    {
        GInfo g = new GInfo();
        GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
        ball[0] = new Ball(500,250, g.getSizeBall() ,g.getBallColor());
        ball[1] = new Ball(750,400, g.getSizeBall() ,g.getBallColor());
        ball[2] = new Ball(400,650, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(600,650, g.getSizeBall() ,g.getBallColor());
        ball[4] = new Ball(250,400, g.getSizeBall() ,g.getBallColor());

        Text textE = new Text("E",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textF = new Text("F",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textG = new Text("G",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textH = new Text("H",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textI = new Text("I",ball[4].getXPosition(),ball[4].getYPosition(), g.getTextSize(), g.getTextColor() );

        for (int i=0; i<5; i++)
        {
            for (int j=0; j<4; j++)
            {
                line [i][j] = new Line (ball[i].getXPosition(), ball[i].getYPosition(), ball[j].getXPosition(), ball[j].getYPosition(), g.getWidthLine(), g.getTextColor());
                arena.addLine(line[i][j]);
            }
        }
        arena.update();

        for (int i= 0; i<5; i++)
        {
            arena.addBall(ball[i]);
            if(i==0)
            {
                arena.addText(textE);
            }
            if(i==1)
            {
                arena.addText(textF);
            }
            if(i==2)
            {
                arena.addText(textG);
            }
            if(i==3)
            {
                arena.addText(textH);
            }
            if(i==4)
            {
                arena.addText(textI);
            }
            arena.update();
        }
        
    }
    public static void main(String[] args)
    {
        Graph2 game = new Graph2();
    }
        
}