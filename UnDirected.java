/**
 * This class provides undirected connection for balls 
 * Combined with GameArena enable to draw a line between two balls 
 */
public class UnDirected
{
    private GInfo g = new GInfo(); // The additional class which provides all the details connecting with program such as sizes of elements

    /**
     * UnDirected is function to connect two balls using line in GameArena. It is used when undirected links are needed.
     * 
     * @param a the ball from which line is being made
     * @param b the ball to which line is being made
     * @param arena is used to setup menu on this arena
     */
    public void unDirected(Ball a, Ball b, GameArena arena)
    {
        Line line = new Line (a.getXPosition(), a.getYPosition(), b.getXPosition(), b.getYPosition(), g.getWidthLine(), g.getTextColor());
        arena.addLine(line);
    }
    /**
     * CustomUnDirect is function to connect two balls using line in Gamearena. It is used for Custom graph.
       * @param x index of first ball
     * @param y index of second ball 
     * @param arena is used to setup menu on this arena
     * @param ball array of ball for setting up custom direct
     */
    public void customUnDirect(int x, int y, GameArena arena, Ball [] ball)
    {
        Line line = new Line (ball[x].getXPosition(), ball[x].getYPosition(), ball[y].getXPosition(), ball[y].getYPosition(), g.getWidthLine(), g.getTextColor());
        arena.addLine(line);
    }
}