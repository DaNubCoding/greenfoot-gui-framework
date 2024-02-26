import greenfoot.*;

public class GUITestWorld extends World {
    public GUITestWorld() {
        super(600, 400, 1);
        
        WidgetManager manager = new WidgetManager(this);
        
        Widget w1 = new Widget(manager, Anchor.TOPLEFT, 100, 100, 100, 100);
        w1.fill(Color.BLACK);
        
        Widget w2 = new Widget(manager, Anchor.TOP, 50, 50, 50, 50);
        w2.fill(Color.RED);
        w2.setParent(w1);
        
        Widget w3 = new Widget(manager, Anchor.CENTER, 25, 25, 10, 10);
        w3.fill(Color.GREEN);
        w3.setParent(w2);
        
        w1.place();
        w2.place();
        w3.place();
    }
}
