import java.util.Scanner;
import java.util.Arrays;
import javax.lang.model.util.ElementScanner6;

import java.util.*;


public class Custom
{
    private Ball[] ball = new Ball[10];
    private Text[] text = new Text[6];
    private GInfo g = new GInfo();
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);
    private Directed direct = new Directed(20);
    private UnDirected un = new UnDirected();
    private Depth depth = new Depth (6);

    public Custom(GameArena arena)
    {
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

        for (int i=0; i<=5; i++)
        {
            arena.addBall(ball[i]);
            
            arena.addText(text[i]);
            
            arena.update();
        }

        Scanner s = new Scanner(System.in);
        System.out.println("\nPut a number of connection");

        int length = s.nextInt();

        while(length!=0)
        {
            System.out.println("\nPut a balls between should be connections in pair");
            int [] balls = new int[length];
            for(int i=0; i<2; i++ ) 
            {
                balls[i] = s.nextInt();
            }

            System.out.println("\nPut a way of connection you want between them (0 is nondirect, 1 is direct) ");
            int con = s.nextInt();
            if(con == 0)
            {
                un.customUnDirect(balls[0], balls[1], arena, ball);
            }
            else if (con == 1)
            {
                direct.customDirect(balls[0], balls[1], arena, ball);
            }
            else
            {
                System.out.println("You didn't put 0 or 1");
            }
            length--;
        }
        arena.update();
    }
    
}