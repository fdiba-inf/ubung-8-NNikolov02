package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
         x = 0.0;
         y = 0.0;
    }

    public Point(double a, double b) {
       this.x = a;
       this.y = b;
    }

    public Point(Point otherPoint) {
       x = otherPoint.x;
       y = otherPoint.y;
    }

    public void initialize() {
    Scanner input = new Scanner(System.in);
     this.x = input.nextDouble();
     this.y = input.nextDouble(); 
    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point z = new Point();
        z.x = x + xDelta;
        z.y = y + yDelta;
        return z;
    }

    public boolean equals(Point otherPoint) {
       if (this.x == otherPoint.x && this.y == otherPoint.y){
         return true;
       }else{
        return false;
       }
    }

    public String toString() {
       return "(" + x  + ", "  + y  + ")";
       

    }
}
