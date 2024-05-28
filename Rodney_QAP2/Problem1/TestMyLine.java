// Test program to test all public methods of MyLine class while utilizing MyPoint class
// Written on: May 27, 2024
// Written by: Rodney Stead

package Problem1;

public class TestMyLine {
    public static void main(String[] args) 
    {
        // Createing a Line using the first constructor
        MyLine l1 = new MyLine(1, 1, 2, 2);
        

        // Createing a second line using the second constructor
        MyPoint begin = new MyPoint(3, 3);
        MyPoint end = new MyPoint(4, 4);
        MyLine l2 = new MyLine(begin, end);
        
        
        // testing toString method
        System.out.println("Line 1: " + l1.toString());
        System.out.println("Line 2: " + l2.toString());

        // testing getBegin and getEnd methods
        System.out.println("Line 1 begins at: " + l1.getBegin() + " and ends at: " + l1.getEnd());
        System.out.println("Line 2 begins at: " + l2.getBegin() + " and ends at: " + l2.getEnd());
    
        // testing getBeginX, getBeginY, getEndX, getEndY methods
        System.out.println("Line 1 begins at: (" + l1.getBeginX() + ", " + l1.getBeginY() + ") and ends at: (" + l1.getEndX() + ", " + l1.getEndY() + ")");
        System.out.println("Line 2 begins at: (" + l2.getBeginX() + ", " + l2.getBeginY() + ") and ends at: (" + l2.getEndX() + ", " + l2.getEndY() + ")");

        // testing setBegin and setEnd methods
        l1.setBegin(new MyPoint(5, 5));
        l1.setEnd(new MyPoint(6, 6));
        System.out.println("Line 1 begins at: " + l1.getBegin() + " and ends at: " + l1.getEnd());
        l2.setBegin(new MyPoint(7, 7));
        l2.setEnd(new MyPoint(8, 8));
        System.out.println("Line 2 begins at: " + l2.getBegin() + " and ends at: " + l2.getEnd());

        // testing setBeginX, setBeginY, setEndX, setEndY methods
        l1.setBeginX(9);
        l1.setBeginY(9);
        l1.setEndX(10);
        l1.setEndY(10);
        System.out.println("Line 1 begins at: (" + l1.getBeginX() + ", " + l1.getBeginY() + ") and ends at: (" + l1.getEndX() + ", " + l1.getEndY() + ")");
        
        l2.setBeginX(11);
        l2.setBeginY(11);
        l2.setEndX(12);
        l2.setEndY(12);
        System.out.println("Line 2 begins at: (" + l2.getBeginX() + ", " + l2.getBeginY() + ") and ends at: (" + l2.getEndX() + ", " + l2.getEndY() + ")");

        // testing getLength method
        System.out.println("Length of Line 1: " + l1.getLength());
        System.out.println("Length of Line 2: " + l2.getLength());

        // testing getGradiant method
        System.out.println("Gradiant of Line 1: " + l1.getGradient());
        System.out.println("Gradiant of Line 2: " + l2.getGradient());
    
    
    
    }
        
        
}
