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
    private int widthArena = 1000;
    private int heightArena = 1000;
    private int text_size = 35;
    private int widthLine = 5;
    private String text_color = "#fffafa";
    private int size_ball = 40;
    private String color = "#FF0000";
    private boolean createWindow = true;
    private Ball[] ball = new Ball[5];
   

    public Graph3()
    {
        GameArena arena = new GameArena(widthArena, heightArena, createWindow);
        ball[0] = new Ball(400,200, size_ball ,color);
        ball[1] = new Ball(600,400, size_ball ,color);
        ball[2] = new Ball(400,400, size_ball ,color); 
        ball[3] = new Ball(400,600, size_ball ,color);

       // Text textJ = new Text("A",ball[0].getXPosition(),ball[0].getYPosition(), text_size, text_color );
       // Text textK = new Text("B",ball[1].getXPosition(),ball[1].getYPosition(), text_size, text_color );
      //  Text textM = new Text("C",ball[2].getXPosition(),ball[2].getYPosition(), text_size, text_color );
       // Text textL = new Text("D",ball[3].getXPosition(),ball[3].getYPosition(), text_size, text_color );

        Line lineJK = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[1].getXPosition(), ball[1].getYPosition(), widthLine, text_color);
        Line lineKL = new Line (ball[0].getXPosition(), ball[0].getYPosition(), ball[2].getXPosition(), ball[2].getYPosition(), widthLine, text_color);
        Line lineLM = new Line (ball[2].getXPosition(), ball[2].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), widthLine, text_color);
        Line lineMJ = new Line (ball[1].getXPosition(), ball[1].getYPosition(), ball[3].getXPosition(), ball[3].getYPosition(), widthLine, text_color);
    }

}