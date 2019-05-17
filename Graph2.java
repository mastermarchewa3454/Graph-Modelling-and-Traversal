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
    private int widthArena = 1000;
    private int heightArena = 1000;
    private int text_size = 35;
    private int widthLine = 5;
    private String text_color = "#fffafa";
    private int size_ball = 40;
    private String color = "#FF0000";
    private boolean createWindow = true;
    private Ball[] ball = new Ball[5];
    private Line[][] line = new Line[5][5];
    private Text[] text = new Text[5];
    private LinkedList<Line> lineList = new LinkedList<Line>();

    GameArena arena = new GameArena(widthArena, heightArena, createWindow);

    public Graph2()
    {
        ball[0] = new Ball(500,250, size_ball ,color);
        ball[1] = new Ball(750,400, size_ball ,color);
        ball[2] = new Ball(400,650, size_ball ,color); 
        ball[3] = new Ball(600,650, size_ball ,color);
        ball[4] = new Ball(250,400, size_ball ,color);

        Text textE = new Text("E",ball[0].getXPosition(),ball[0].getYPosition(), text_size, text_color );
        Text textF = new Text("F",ball[1].getXPosition(),ball[1].getYPosition(), text_size, text_color );
        Text textG = new Text("G",ball[2].getXPosition(),ball[2].getYPosition(), text_size, text_color );
        Text textH = new Text("H",ball[3].getXPosition(),ball[3].getYPosition(), text_size, text_color );
        Text textI = new Text("I",ball[4].getXPosition(),ball[4].getYPosition(), text_size, text_color );

        //Line lineEF = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), widthLine, text_color);
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<4; j++)
            {
                line [i][j] = new Line (ball[i].getXPosition(), ball[i].getYPosition(), ball[j].getXPosition(), ball[j].getYPosition(), widthLine, text_color);
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