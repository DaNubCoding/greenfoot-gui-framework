public enum Anchor {
    CENTER(0, 0),
    TOPLEFT(-1, -1),
    TOPRIGHT(1, -1),
    BOTTOMRIGHT(1, 1),
    BOTTOMLEFT(-1, 1),
    TOP(0, -1),
    RIGHT(1, 0),
    BOTTOM(0, 1),
    LEFT(-1, 0);
    
    private int x;
    private int y;
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    private Anchor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}