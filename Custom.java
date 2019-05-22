import java.util.Scanner;
/**
 * This class provide a posibility to create Custom graph in which user is putting details of connection between balls.
 * Combined with GameArena creates adjustable graph.
 */
public class Custom
{
    private Ball[] ball = new Ball[10];                                                     // The list of balls which are shown on the screen in GameArena
    private Text[] text = new Text[6];                                                      // The list of texts which are shown on the rectangles
    private GInfo g = new GInfo();                                                          // The additional class which provides all the details connecting with program such as sizes of elements
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);  // The GameArena class to show the arena on which menu is set up
    private Directed direct = new Directed(20);                                             // The class which provides direct connections between balls
    private UnDirected un = new UnDirected();                                               // The class which provides undirect connections between balls

    /**
     * Function to print template of balls on the screen
     * @param arena is used to setup graph on this arena
     */
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


        /**
         * Scanning results of number of connections, index of balls and type of connection
         * Depends on input of user it prints proper balls
         */

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