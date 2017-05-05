package RamerPeucket;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Joywalker on 4/28/2017.
 */
public class LineEquation {

    private Point start;
    private Point end;
    double A,B,C;

    public double getA() {return A;}
    public double getB() {return B;}
    public double getC() {return C;}

    public LineEquation(Point lineStartPoint, Point lineEndPoint) // Constructor for Line
    {
        //set start & end point of the line
        this.start = lineStartPoint;
        this.end = lineEndPoint;
        /**
         *  get the A,B,C parameters of the line
         *  let x = line
         *  let M = given Point
         *
         *             |A*M.x + B*M.y +C |
         *  d(M,x) =  ---------------------
         *              sqrt(A^2 + B^2)
         */
        this.A = lineEndPoint.getPointY() - lineStartPoint.getPointY();
        this.B = lineEndPoint.getPointX() - lineStartPoint.getPointX();
        this.C = A*lineStartPoint.getPointX() - B*lineStartPoint.getPointY();
    }

    public List<Point> asList() // return a list of 2 elem, start and end
    {
        return Arrays.asList(start, end);
    }

    public double perpendicularDistance(Point M) //get distance from Point M to the Line
    {
        double denominator = Math.abs(this.A*M.getPointX() + B*M.getPointY() + C);
        double nominator = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
        double result = denominator/nominator;
        return result;
    }
}
