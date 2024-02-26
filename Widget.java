import greenfoot.*;
import java.util.ArrayList;

public class Widget extends Actor {
    protected WidgetManager manager;
    protected World world;
    protected GreenfootImage image;
    protected Widget parent;
    protected ArrayList<Widget> children;
    
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    /* The reference point within the widget used to position it at its specified coordinates */
    protected Anchor anchor;
    protected double scrollX;
    protected double scrollY;
    
    public Widget(WidgetManager manager, Anchor anchor, int x, int y, int width, int height) {
        this.manager = manager;
        this.world = manager.getWorld();
        
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.x = modifyXByAnchor(x);
        this.y = modifyYByAnchor(y);
        this.scrollX = 0;
        this.scrollY = 0;
        
        image = new GreenfootImage(this.width, this.height);
        setImage(image);
    }
    
    /*
     * TEMPORARY TESTING METHOD, REMOVE!!!
     */
    public void fill(Color color) {
        image.setColor(color);
        image.fill();
    }
    
    public void act() {
        setLocation(x, y);
        // If the widget is nested, draw manually onto the parent's image
        if (parent != null) {
            parent.image.drawImage(image, x, y);
        }
    }
    
    /**
     * Calculate the x coordinate based on the anchor.
     */
    private int modifyXByAnchor(int x) {
        return x - this.anchor.getX() * this.width / 2;
    }
    
    /**
     * Calculate the y coordinate based on the anchor.
     */
    private int modifyYByAnchor(int y) {
        return y - this.anchor.getY() * this.height / 2;
    }
    
    public void addChild(Widget child) {
        children.add(child);
        child.setParent(this);
    }
    
    public void addChildren(Widget... children) {
        for (Widget child : children) {
            addChild(child);
        }
    }
    
    public void setParent(Widget parent) {
        this.parent = parent;
        parent.addChild(this);
        // Now that it has become a nested Widget, manual rendering will take place
        setImage((GreenfootImage) null);
        // Recalculate position to adjust for drawing from the topleft instead of the center on the parent image
        x -= width / 2;
        y -= height / 2;
    }
    
    public void place() {
        world.addObject(this, x, y);
        manager.addWidget(this);
    }
}
