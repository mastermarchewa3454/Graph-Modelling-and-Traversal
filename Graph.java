/**
 * This class provide a posibility to create Graph.
 */
public class Graph
{
    
    private Ball[] ball = new Ball[5];                                                      // The instances of ball from the class which are shown in GameArena
    private GInfo g = new GInfo();                                                          // The additional class which provides all the details connecting with program such as sizes of elements
    private UnDirected un = new UnDirected();                                               // The class which provides undirect connections between balls
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);  // The GameArena class to show the arena on which menu is set up
   
    /**
     * Function to print template of balls, texts and connections on the screen
     * @param arena is used to setup graph on this arena
     */
    public Graph(GameArena arena)
    {
        
        ball[0] = new Ball(400,400, g.getSizeBall() ,g.getBallColor());
        ball[1] = new Ball(600,400, g.getSizeBall() ,g.getBallColor());
        ball[2] = new Ball(400,600, g.getSizeBall() ,g.getBallColor()); 
        ball[3] = new Ball(600,600, g.getSizeBall() ,g.getBallColor());

        Text textA = new Text("A",ball[0].getXPosition(),ball[0].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textB = new Text("B",ball[1].getXPosition(),ball[1].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textC = new Text("C",ball[2].getXPosition(),ball[2].getYPosition(), g.getTextSize(), g.getTextColor() );
        Text textD = new Text("D",ball[3].getXPosition(),ball[3].getYPosition(), g.getTextSize(), g.getTextColor() );

        un.unDirected(ball[0], ball[1], arena);
        un.unDirected(ball[0], ball[2], arena);
        un.unDirected(ball[2], ball[3], arena);
        un.unDirected(ball[1], ball[3], arena);
 
        arena.update();
        for (int i= 0; i<4; i++)
        {
            arena.addBall(ball[i]);
            if(i==0)
            {
                arena.addText(textA);
            }
            if(i==1)
            {
                arena.addText(textB);
            }
            if(i==2)
            {
                arena.addText(textC);
            }
            if(i==3)
            {
                arena.addText(textD);
            }
            arena.update();
        }
        arena.update();
    }   

}
