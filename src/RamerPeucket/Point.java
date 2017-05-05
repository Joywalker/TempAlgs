package RamerPeucket;

/**
 * Created by Joywalker on 4/28/2017.
 */
public class Point {

    private double pointX;
    private double pointY;

    public Point(double X, double Y)
    {
        this.pointX = X;
        this.pointY = Y;
    }

    public double getPointX() {return pointX;};
    public double getPointY() {return pointY;};

    @Override
    public String toString()
    {
        return "["+this.pointX +","+this.pointY+"]";
    }
}
