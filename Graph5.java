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


public class Graph5
{
    private Ball[] ball = new Ball[10];
    private Text[] text = new Text[6];
    private LinkedList<Arrow> lineList = new LinkedList<Arrow>();

    public Graph5()
    {
        GInfo g = new GInfo();
        GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
        ball[0] = new Ball(500,180, g.getSizeBall(),g.getBallColor());
        ball[1] = new Ball(125,220, g.getSizeBall(),g.getBallColor());
        ball[2] = new Ball(775,230, g.getSizeBall(),g.getBallColor());
        ball[3] = new Ball(125,720, g.getSizeBall() ,g.getBallColor());
        ball[4] = new Ball(450,680, g.getSizeBall() ,g.getBallColor());
        ball[5] = new Ball(775,710, g.getSizeBall() ,g.getBallColor());


        ball[6] = new Ball(810,710, g.getSizeBall() ,g.getTextColor());
        ball[7] = new Ball(810,710, g.getSizeBall()-5 ,g.getBall2Color());
        arena.addBall(ball[6]);
        arena.addBall(ball[7]);

        text[0] = new Text("0",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[1] = new Text("1",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[2] = new Text("2",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[3] = new Text("3",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[4] = new Text("4",ball[4].getXPosition(),ball[4].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[5] = new Text("5",ball[5].getXPosition(),ball[5].getYPosition(), g.getTextSize(), g.getTextColor() );

        Arrow arrow01 = new Arrow (ball[0].getXPosition(), ball[0].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        
        Arrow arrow02 = new Arrow (ball[0].getXPosition(), ball[0].getYPosition()-g.getForDouble(), ball[2].getXPosition(), ball[2].getYPosition()-g.getForDouble(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow13 = new Arrow (ball[1].getXPosition(), ball[1].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow24 = new Arrow (ball[2].getXPosition(), ball[2].getYPosition(), ball[4].getXPosition(), ball[4].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow20 = new Arrow (ball[2].getXPosition(), ball[2].getYPosition()+g.getForDouble(), ball[0].getXPosition(), ball[0].getYPosition()+g.getForDouble(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow41 = new Arrow (ball[4].getXPosition(), ball[4].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow42 = new Arrow (ball[4].getXPosition(), ball[4].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow43 = new Arrow (ball[4].getXPosition(), ball[4].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow45 = new Arrow (ball[4].getXPosition(), ball[4].getYPosition(), ball[5].getXPosition(), ball[5].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrow55 = new Arrow (ball[5].getXPosition(), ball[5].getYPosition(), ball[5].getXPosition(), ball[5].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);

        lineList.add(arrow01);
        lineList.add(arrow02);
        lineList.add(arrow13);
        lineList.add(arrow24);
        lineList.add(arrow20);
        linelist.add(arrow41);
        linelist.add(arrow42);
        linelist.add(arrow43);
        linelist.add(arrow45);
        linelist.add(arrow55);


        for (int i=0; i<=5; i++)
        {
            arena.addBall(ball[i]);
            
            arena.addText(text[i]);
            
            arena.update();
        }
    }

    public static void main(String[] args)
    {
        Graph5 game = new Graph5();
    }


    
}