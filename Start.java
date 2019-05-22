
/**
 * This class provides a main menu for the program in which graphics are drawn
 * Combined with GameArena, Text, SetMenu enable to create menu
 */
public class Start
{
    private GInfo g = new GInfo();                                                                                                             // The additional class which provides all the details connecting with program such as sizes of elements
    private Rectangle[] rec = new Rectangle[8];                                                                                                // The reclangles which are used as buttons to go to other graphs
    private Text[] text = new Text[8];                                                                                                         // The list of texts which are shown on the rectangles
    private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), true);                                                      // The GameArena class to show the arena on which menu is set up
    private Rectangle cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color()); // The black cover for gamearena
    private SetMenu menu = new SetMenu();                                                                                                      // The additional class which sets elements (Rectangles, Text) on the screen
    private int[] isExist = new int[10];                                                                                                       // The integer which enable/disable actual graph
    /**
     *
     * Constructor. Create a new instance of a Start.
     *
     */
    public Start()
    {
        menu.SetMenu(arena, rec, text);
        arena.update();

        for (int i=1; i<=rec.length; i++)
            {
                isExist[i] = 0;
            }
    /**
     * This loop execute moving to other graph by replacing Start page with the page depends on the graph
    */
        while(true)
        {
            arena.update();
            if(arena.leftMousePressed() && Math.abs(rec[1].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[1].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[1] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph graph = new Graph(arena);
                isExist[1] = 1;
                arena.addRectangle(rec[7]); 
                arena.addText(text[5]);         
            }
            else if(arena.leftMousePressed() && Math.abs(rec[2].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[2].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[2] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph2 graph2 = new Graph2(arena);
                isExist[2] = 1;
                arena.addRectangle(rec[7]);
                arena.addText(text[5]);          
            }
            else if(arena.leftMousePressed() && Math.abs(rec[3].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[3].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[3] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph3 graph3 = new Graph3(arena);
                isExist[3] = 1; 
                arena.addRectangle(rec[7]); 
                arena.addText(text[5]);        
            }
            else if(arena.leftMousePressed() && Math.abs(rec[4].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[4].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[4] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph4 graph4 = new Graph4(arena);
                isExist[4] = 1; 
                arena.addRectangle(rec[7]);
                arena.addText(text[5]);          
            }
            else if(arena.leftMousePressed() && Math.abs(rec[5].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[5].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[5] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Graph5 graph5 = new Graph5(arena);
                isExist[5] = 1; 
                arena.addRectangle(rec[7]); 
                arena.addText(text[5]);         
            }
            else if(arena.leftMousePressed() && Math.abs(rec[6].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[6].getYPosition()-arena.getMouseY())<g.getRecHeight() && isExist[6] == 0)
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                Custom custom = new Custom(arena);
                isExist[6] = 1; 
                arena.addRectangle(rec[7]); 
                arena.addText(text[5]);         
            }
            else if(arena.leftMousePressed() && Math.abs(rec[7].getXPosition()-arena.getMouseX())<g.getRecWidth() && Math.abs(rec[7].getYPosition()-arena.getMouseY())<g.getRecHeight())
            {
                cov = new Rectangle(g.getWidthArena()/2, g.getHeightArena()/2,g.getWidthArena(), g.getHeightArena(), g.getBall2Color());
                arena.addRectangle(cov);
                
                for (int i=1; i<=rec.length; i++)
                {
                    isExist[i] = 0;
                }
                menu.SetMenu(arena, rec, text);
                arena.update();
            }


            /**
             * The ability to close the program using space button
             */
            else if(arena.spacePressed())
            {
                arena.exit();
            }    
        }        
    }


    /**
     * Main function. Creates new instance of class Start.    
     */   
    public static void main(String[] args)
    {
        Start game = new Start();
    }
}