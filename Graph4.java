/**
 * This class provide a posibility to create Graph.
 */
public class Graph4
{
    private Ball[] ball = new Ball[10];                                                      // The instances of ball from the class which are shown in GameArena
    private Text[] text = new Text[5];                                                       // The list of texts which are shown on the rectangles
    private GInfo g = new GInfo();                                                           // The additional class which provides all the details connecting with program such as sizes of elements
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);   // The GameArena class to show the arena on which menu is set up
    private Directed direct = new Directed(8);                                               // The class which provides direct connections between balls

    /**
     * Function to print template of balls, texts and connections on the screen
     * @param arena is used to setup graph on this arena
     */
    public Graph4(GameArena arena)
    {
        
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
       
        direct.directedLink(ball[1],ball[2], arena);
        direct.directedLink(ball[3],ball[3], arena);
        direct.directedLink(ball[3],ball[0], arena);
        direct.directedLink(ball[2],ball[3], arena);
        direct.directedLink(ball[1],ball[2], arena);
        direct.directedLink(ball[0],ball[1], arena);
        direct.directedLink(ball[1],ball[0], arena);
    
        arena.update();

        for (int i= 0; i<4; i++)
        {
            arena.addBall(ball[i]);
            arena.addText(text[i]);
            arena.update();
        }
        
    }
}