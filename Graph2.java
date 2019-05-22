/**
 * This class provide a posibility to create Graph2.
 */
public class Graph2
{
    private Ball[] ball = new Ball[5];                                                       // The instances of ball from the class which are shown in GameArena
    private Line[][] line = new Line[5][5];                                                  // The instances of lines from the class which are shown in GameArena
    private GInfo g = new GInfo();                                                           // The additional class which provides all the details connecting with program such as sizes of elements
    private UnDirected un = new UnDirected();                                                // The class which provides undirect connections between balls
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);   // The GameArena class to show the arena on which menu is set up
    
    /**
     * Function to print template of balls, texts and connections on the screen
     * @param arena is used to setup graph on this arena
     */
    public Graph2(GameArena arena)
    {
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

        for (int i=0; i<ball.length; i++)
        {
            for (int j=0; j<ball.length-1; j++)
            {
                un.unDirected(ball[i], ball[j], arena);
            }
        }
        arena.update();

        for (int i= 0; i<ball.length; i++)
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
        
}