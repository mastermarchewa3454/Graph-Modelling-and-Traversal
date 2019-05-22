public class Graph5
{
    private Ball[] ball = new Ball[10];                                                     // The instances of ball from the class which are shown in GameArena
    private Text[] text = new Text[6];                                                      // The list of texts which are shown on the rectangles
    private GInfo g = new GInfo();                                                          // The additional class which provides all the details connecting with program such as sizes of elements
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);  // The GameArena class to show the arena on which menu is set up
    private Directed direct = new Directed(6);                                              // The class which provides direct connections between balls and BreathFirstTraversal for the graph
    private Depth depth = new Depth (6);                                                    // The class which provides DepthFirstTraversal for the graph

    /**
     * Function to print template of balls, texts and connections on the screen
     * @param arena is used to setup graph on this arena
     */
    public Graph5(GameArena arena)
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

        direct.directedLink(ball[0],ball[1], arena);
        direct.directedLink(ball[0],ball[2], arena);
        direct.directedLink(ball[1],ball[3], arena);
        direct.directedLink(ball[2],ball[4], arena);
        direct.directedLink(ball[2],ball[0], arena);
        direct.directedLink(ball[4],ball[1], arena);
        direct.directedLink(ball[4],ball[3], arena);
        direct.directedLink(ball[4],ball[5], arena);

        Line line55 = new Line (ball[5].getXPosition()+20, ball[5].getYPosition()-31, ball[5].getXPosition()+28, ball[5].getYPosition()-50, g.getWidthLine(), g.getTextColor());
        Line line555 = new Line (ball[5].getXPosition()+20, ball[5].getYPosition()-31, ball[5].getXPosition()+40, ball[5].getYPosition()-20, g.getWidthLine(), g.getTextColor());
        
        for (int i=0; i<=5; i++)
        {
            arena.addBall(ball[i]);
            
            arena.addText(text[i]);
            
            arena.update();
        }
        arena.addLine(line55);
        arena.addLine(line555);
        arena.update();

        /**
         * Adding all edges to direct in order to process Breadth First Traversal
         * Based on this edges, Breadth First Traversal is executed
         * In BreadthFirst there is an option to choose starting ball
         */
        direct.addEdge(0,1);
        direct.addEdge(0,2);
        direct.addEdge(1,3);
        direct.addEdge(2,4);
        direct.addEdge(2,0);
        direct.addEdge(4,1);
        direct.addEdge(4,3);
        direct.addEdge(4,5);
        direct.addEdge(5,5);
        System.out.println("Breadth First Traversal, started from 2");
        direct.BreadthFirst(2, ball, arena);
        arena.update();

        /**
         * Setting color of the ball to default before traversal
         */
        for (int i=0; i<=5; i++)
        {
            ball[i].setColour(g.getBallColor());
        }
        arena.update();

        /**
         * Adding all edges to direct in order to process Depth First Traversal
         * Based on this edges, Depth First Traversal is executed
         * In DepthFirst there is an option to choose starting ball
         */
        depth.addEdge(0,1);
        depth.addEdge(0,2);
        depth.addEdge(1,3);
        depth.addEdge(2,4);
        depth.addEdge(2,0);
        depth.addEdge(4,1);
        depth.addEdge(4,3);
        depth.addEdge(4,5);
        depth.addEdge(5,5);
        System.out.println("\nDepth First Traversal, started from 2");
        depth.DepthFirst(2, arena, ball);
        arena.update();
    }
}