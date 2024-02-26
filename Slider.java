import greenfoot.*;

public class Slider extends Widget {
    public Slider(WidgetManager manager, Anchor anchor, int x, int y, int width, int height) {
        super(manager, anchor, x, y, width, height);
    }
    
    public void act() {
        
    }
    
    protected class Thumb extends Widget {
        public Thumb(WidgetManager manager, Anchor anchor, int x, int y, int width, int height) {
            super(manager, anchor, x, y, width, height);
        }
    }
    
    protected class Track extends Widget {
        public Track(WidgetManager manager, Anchor anchor, int x, int y, int width, int height) {
            super(manager, anchor, x, y, width, height);
        }
    }
}
