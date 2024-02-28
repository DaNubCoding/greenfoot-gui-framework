import greenfoot.*;

public class GUITestWorld extends World {
    public GUITestWorld() {
        super(600, 400, 1);
        
        WidgetManager manager = new WidgetManager(this);
        
        Widget w1 = new Widget(manager, Anchor.TOPLEFT, 100, 100, 200, 100);
        w1.fill(Color.BLACK);
        
        Widget w2 = new Widget(manager, Anchor.TOP, 100, 50, 50, 50);
        w2.fill(Color.RED);
        w1.addChild(w2);
        
        Widget w3 = new Widget(manager, Anchor.CENTER, 25, 25, 10, 20);
        w3.fill(Color.GREEN);
        w2.addChild(w3);
        
        Widget w4 = new Widget(manager, Anchor.BOTTOM, 5, 5, 5, 5);
        w4.fill(Color.ORANGE);
        w3.addChild(w4);
        
        w1.place();
        w2.place();
        w3.place();
        w4.place();
    }
}
