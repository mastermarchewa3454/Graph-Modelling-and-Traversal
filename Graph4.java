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


public class Graph4
{
    private Ball[] ball = new Ball[10];
    private Text[] text = new Text[5];

    public Graph4()
    {
        GInfo g = new GInfo();
        GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);
        ball[0] = new Ball(450,200, g.getSizeBall(),g.getBallColor());
        ball[1] = new Ball(675,400, g.getSizeBall(),g.getBallColor());
        ball[2] = new Ball(450,700, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(225,400, g.getSizeBall() ,g.getBallColor());

        ball[4] = new Ball(710,400, g.getSizeBall() ,g.getTextColor());
        ball[5] = new Ball(190,400, g.getSizeBall() ,g.getTextColor());
        ball[6] = new Ball(710,400, g.getSizeBall()-5 , g.getBall2Color());
        ball[7] = new Ball(190,400, g.getSizeBall()-5 , g.getBall2Color());
        for (int i=4; i<=7; i++)
        {
            arena.addBall(ball[i]);
        }

        text[0] = new Text("J",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[1] = new Text("K",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[2] = new Text("M",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        text[3] = new Text("L",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );
        /*
        Line lineLJ = new Line (ball[3].getXPosition(), ball[3].getYPosition(), ball[0].getXPosition(), ball[0].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineML = new Line (ball[2].getXPosition(), ball[2].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineKM = new Line (ball[1].getXPosition(), ball[1].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor());
        Line lineJK = new Line (ball[0].getXPosition()+g.getForDouble(), ball[0].getYPosition()-g.getForDouble(), ball[1].getXPosition()+g.getForDouble(), ball[1].getYPosition()-g.getForDouble(), g.getWidthLine(), g.getTextColor());
        
        arena.addLine(lineLJ);
        arena.addLine(lineML);
        arena.addLine(lineKM);
        arena.addLine(lineJK);
        */
        
        Arrow arrowKK = new Arrow (ball[1].getXPosition(), ball[1].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowLL = new Arrow (ball[3].getXPosition(), ball[3].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowLJ = new Arrow (ball[3].getXPosition(), ball[3].getYPosition(), ball[0].getXPosition(), ball[0].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowML = new Arrow (ball[2].getXPosition(), ball[2].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowKM = new Arrow (ball[1].getXPosition(), ball[1].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowJK = new Arrow (ball[0].getXPosition()+g.getForDouble(), ball[0].getYPosition()-g.getForDouble(), ball[1].getXPosition()+g.getForDouble(), ball[1].getYPosition()-g.getForDouble(), g.getWidthLine(), g.getTextColor(), arena);
        Arrow arrowKJ = new Arrow (ball[1].getXPosition()-g.getForDouble(), ball[1].getYPosition()+g.getForDouble(), ball[0].getXPosition()-g.getForDouble(), ball[0].getYPosition()+g.getForDouble(), g.getWidthLine(), g.getTextColor(), arena);
        arena.update();

        for (int i= 0; i<4; i++)
        {
            arena.addBall(ball[i]);
            arena.addText(text[i]);
            arena.update();
        }
        
    }
    public static void main(String[] args)
    {
        Graph4 game = new Graph4();
    }
}