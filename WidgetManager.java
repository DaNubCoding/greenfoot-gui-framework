import greenfoot.*;
import java.util.ArrayList;

public class WidgetManager extends Actor {
    private World world;
    private ArrayList<Widget> widgets = new ArrayList<Widget>();
    
    public WidgetManager(World world) {
        this.world = world;
        world.addObject(this, 0, 0);
        setImage((GreenfootImage) null);
    }
    
    public void act() {
        
    }
    
    public World getWorld() {
        return this.world;
    }
    
    public void addWidget(Widget widget) {
        widgets.add(widget);
    }
}
