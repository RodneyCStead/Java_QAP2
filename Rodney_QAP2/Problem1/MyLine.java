// Program for a class named MyLine that models a line segment with two MyPoint instances as its endpoints.
// Written on: May 27, 2024
// Written by: Rodney Stead

package Problem1;

public class MyLine {

    // Instance variables
    
    private MyPoint begin = new MyPoint(1, 1);
    private MyPoint end = new MyPoint (2,2);

    
// Constructors

    public MyLine(int x1, int y1, int x2, int y2)
    {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    //
    public MyLine(MyPoint begin, MyPoint end) 
    {
        this.begin = begin;
        this.end = end;
    }

// Getters and Setters

    // Getters and Setters for begin and end
    public MyPoint getBegin() 
    {
        return this.begin;
    }

    public void setBegin (MyPoint begin) 
    {
        this.begin = begin;
    }

    public MyPoint getEnd ()
    {
        return this.end;
    }

    public void setEnd (MyPoint end)
    {
        this.end = end;
    }    

    // Getters and setters for beginX, beginY, endX, endY

    public int getBeginX ()
    {
        return this.begin.getX();
    }

    public void setBeginX (int x) 
    {
        this.begin.setX(x);
    }

    public int getBeginY () 
    {
        return this.begin.getY();
    }

    public void setBeginY (int y)
    {
        this.begin.setY(y);
    }

    public int getEndX ()
    {
        return this.end.getX();
    }

    public void setEndX (int x)
    {
        this.end.setX(x);
    }

    public int getEndY ()
    {
        return this.end.getY();
    }

    public void setEndY (int y)
    {
        this.end.setY(y);
    }

    // getters and setters for beginXY and endXY

    public int [] getBeginXY ()
    {
        int [] XY;
        XY = this.begin.getXY();
        return XY;
    }

    public void setBeginXY (int x, int y)
    {
        this.begin.setXY(x,y);
    }

    public int [] getEndXY ()
    {
        int [] XY;
        XY = this.end.getXY();
        return XY;
    }

    public void setEndXY (int x, int y)
    {
        this.end.setXY (x,y);
    }

    // getters for Length and Gradient

    public double getLength ()
    {
        double length;
        length = begin.distance(end);
        return length;
    }

    public double getGradient() {
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method
    public String toString () 
    {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
