public class Area {
    private int xLoc = 0;
    private int yLoc = 0;

    public Area(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    public int getxLoc() {
        return xLoc;
    }
    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }
    public int getyLoc() {
        return yLoc;
    }
    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public boolean containsPointWithX(int x) {
        return (0 <= x) && (x <= xLoc);
    }

    public boolean containsPointWithY(int y) {
        return (0 <= y) && (y <= yLoc);
    }
}
