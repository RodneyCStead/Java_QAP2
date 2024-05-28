
package Problem1;

public class MyPoint {
    
    // Private variables
    private int x = 0;
    private int y = 0;

    // Constructors

    // no-arg constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(X = " + x + ", Y = " + y + ")";
    }

    // overloaded methods for distance
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }



}
