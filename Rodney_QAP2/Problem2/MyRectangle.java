// Code for a class named MyRectangle that models a rectangle with top left and bottom right points. This class is able to 
// calculate the length, width, area, and perimeter of the rectangle from the 2 given point of the top left and bottom right corners.
// Written on: May 27, 2024
// Written by: Rodney Stead

package Problem2;

public class MyRectangle {
    
    // Instance variables
    private MyPoint topLeft;
    private MyPoint bottomRight;


// Constructors
    
    // Constructor with 4 parameters to make up the top left and bottom right points
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor with 2 parameters to make up the top left and bottom right points
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

// Getters and Setters

    // Getters and setters for top left corner
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getters and setters for bottom right corner
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // getting length and width of the rectangle
    public int getLength() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public int getWidth() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // getting area and perimeter of the rectangle
    public int getArea() {
        return getLength() * getWidth();
    }

    public int getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

