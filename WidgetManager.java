import greenfoot.*;

public class WidgetManager extends Actor {
    private World world;
    
    public WidgetManager(World world) {
        this.world = world;
        world.addObject(this, 0, 0);
        setImage((GreenfootImage) null);
    }
    
    public World getWorld() {
        return this.world;
    }
    
    public void act() {
        
    }
}
