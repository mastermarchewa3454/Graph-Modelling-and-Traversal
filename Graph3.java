/**
 * This class provide a posibility to create Graph3.
 */
public class Graph3
{
    private Directed direct = new Directed(4);                                              // The class which provides undirect connections between balls
    private Ball[] ball = new Ball[5];                                                      // The instances of ball from the class which are shown in GameArena
    private GInfo g = new GInfo();                                                          // The additional class which provides all the details connecting with program such as sizes of elements
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);  // The GameArena class to show the arena on which menu is set up

    /**
     * Function to print template of balls, text and connections on the screen
     * @param arena is used to setup graph on this arena
     */
    public Graph3(GameArena arena)
    {
        ball[0] = new Ball(400,150, g.getSizeBall(),g.getBallColor());
        ball[1] = new Ball(600,400, g.getSizeBall(),g.getBallColor());
        ball[2] = new Ball(400,750, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(200,400, g.getSizeBall() ,g.getBallColor());
        
        Text textJ = new Text("J",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textK = new Text("K",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textM = new Text("M",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textL = new Text("L",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );

       
        direct.directedLink(ball[0], ball[3], arena);
        direct.directedLink(ball[3], ball[2], arena);
        direct.directedLink(ball[2], ball[1], arena);
        direct.directedLink(ball[1], ball[0], arena);

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
}