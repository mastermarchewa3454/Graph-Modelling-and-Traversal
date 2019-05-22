public class UnDirected
{
    private GInfo g = new GInfo();

    public void unDirected(Ball a, Ball b, GameArena arena)
    {
        Line line = new Line (a.getXPosition(), a.getYPosition(), b.getXPosition(), b.getYPosition(), g.getWidthLine(), g.getTextColor());
        arena.addLine(line);
    }
    public void customUnDirect(int x, int y, GameArena arena, Ball [] ball)
    {
        Line line = new Line (ball[x].getXPosition(), ball[x].getYPosition(), ball[y].getXPosition(), ball[y].getYPosition(), g.getWidthLine(), g.getTextColor());
        arena.addLine(line);
    }
}