// Test program to test all public methods of MyRectangle class while utilizing MyPoint class
// Written on: May 27, 2024
// Written by: Rodney Stead

package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Createing a Rectangle using the first constructor
        MyRectangle rectangle1 = new MyRectangle(1, 1, 3, 4);

        // Createing a second Rectangle using the second constructor
        MyPoint topLeft = new MyPoint(5, 6);
        MyPoint bottomRight = new MyPoint(7, 8);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
    
        // testing toString method
        System.out.println("Rectangle 1: " + rectangle1.toString());
        System.out.println("Rectangle 2: " + rectangle2.toString());

        // testing getTopLeft and getBottomRight methods
        System.out.println("Rectangle 1 top left point: " + rectangle1.getTopLeft() + ", bottom right point: " + rectangle1.getBottomRight());
        System.out.println("Rectangle 2 top left point: " + rectangle2.getTopLeft() + ", bottom right point: " + rectangle2.getBottomRight());

        // testing setTopLeft and setBottomRight methods
        rectangle1.setTopLeft(new MyPoint(9, 10));
        rectangle1.setBottomRight(new MyPoint(11, 12));
        System.out.println("Rectangle 1 top left point: " + rectangle1.getTopLeft() + ", bottom right point: " + rectangle1.getBottomRight());
        
        rectangle2.setTopLeft(new MyPoint(13, 14));
        rectangle2.setBottomRight(new MyPoint(15, 16));
        System.out.println("Rectangle 2 top left point: " + rectangle2.getTopLeft() + ", bottom right point: " + rectangle2.getBottomRight());

        // testing getLength and getWidth methods
        System.out.println("Length of Rectangle 1: " + rectangle1.getLength() + ", Width of Rectangle 1: " + rectangle1.getWidth());
        System.out.println("Length of Rectangle 2: " + rectangle2.getLength() + ", Width of Rectangle 2: " + rectangle2.getWidth());
        
        // testing getPerimeter
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());

        // testing getArea
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());

    }
}
        
        
