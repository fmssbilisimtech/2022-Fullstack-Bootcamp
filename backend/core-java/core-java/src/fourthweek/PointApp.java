//package fourthweek;
//
///*----------------------------------------------------------------------------------------------------------------------
//	PointF sınıfı
//----------------------------------------------------------------------------------------------------------------------*/
//
//import java.awt.*;
//
//import static java.lang.Math.sqrt;
//
//public class PointApp {
//    public float x;
//    public float y;
//
//    public PointApp()
//    {
//    }
//
//    public PointApp(float x)
//    {
//        this.x = x;
//    }
//
//    public PointApp(float x, float y)
//    {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double distance(Point p)
//    {
//        return this.distance(p.x, p.y);
//    }
//
//    public double distance(float a, float b)
//    {
//        return sqrt((x - a) * (x - a) + (y - b) * (y - b));
//    }
//
//    public void offset(float dxy)
//    {
//        this.offset(dxy, dxy);
//    }
//
//    public void offset(float dx, float dy)
//    {
//        x += dx;
//        y += dy;
//    }
//
//    public String toString()
//    {
//        return String.format("{x: %f, y: %f}", x, y);
//    }
//}
