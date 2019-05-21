public class SetMenu
    {
        private GInfo g = new GInfo();
        private Rectangle[] rec = new Rectangle[7];
        private Text[] text = new Text[6];
        private GameArena arena = new GameArena(g.getWidthArena(), g.getHeightArena(), false);

        public void SetMenu(GameArena arena, Rectangle [] rec, Text[] text)
        {
        Text textintro = new Text("Choose the graph you would like to see",50,100,45, g.getTextColor() );
        arena.addText(textintro);
        arena.update();
        rec[1] = new Rectangle(200,250,g.getRecWidth(), g.getRecHeight(),"#FF9100");
        rec[2] = new Rectangle(200,500,g.getRecWidth(), g.getRecHeight(),"#FF9100");
        rec[3] = new Rectangle(200,750,g.getRecWidth(), g.getRecHeight(),"#FF9100");
        rec[4] = new Rectangle(700,250,g.getRecWidth(), g.getRecHeight(),"#FF9100");
        rec[5] = new Rectangle(700,500,g.getRecWidth(), g.getRecHeight(),"#FF9100");
        rec[6] = new Rectangle(100,900,g.getRecWidth()-100, g.getRecHeight()-50,"#FF9100");

        
        arena.addRectangle(rec[1]);
        arena.addRectangle(rec[2]);
        arena.addRectangle(rec[3]);
        arena.addRectangle(rec[4]);
        arena.addRectangle(rec[5]);
       // arena.addRectangle(rec[5]);
        arena.update();
        text[0] = new Text("Graph 1",rec[1].getXPosition()-80,rec[1].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[1] = new Text("Graph 2",rec[2].getXPosition()-80,rec[2].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[2] = new Text("Graph 3",rec[3].getXPosition()-80,rec[3].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[3] = new Text("Graph 4",rec[4].getXPosition()-80,rec[4].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[4] = new Text("Graph 5",rec[5].getXPosition()-80,rec[5].getYPosition(), g.getTextSize()+10, g.getTextColor() );
        text[5] = new Text("Come Back",rec[6].getXPosition()-80,rec[6].getYPosition(), g.getTextSize(), g.getTextColor());
        arena.addText(text[0]);
        arena.addText(text[1]);
        arena.addText(text[2]);
        arena.addText(text[3]);
        arena.addText(text[4]);
       // arena.addText(text[5]);
       arena.update();
        }
    }